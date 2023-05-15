package thisisjava.ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample2 {
    public static void main(String[] args) {
        try {
            write("문자 변환 스트림을 사용합니다.");
            String data = read();
            System.out.println(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write(String str) throws IOException {
        OutputStream os = new FileOutputStream("C:/Temp/test.txt");
        Writer writer = new OutputStreamWriter(os, "UTF-8");

        writer.write(str);
        writer.flush();
        writer.close();
    }

    public static String read() throws IOException {
//        InputStream is = new FileInputStream("C:/Temp/test.txt");
//        Reader reader = new InputStreamReader(is, "UTF-8");
//
//        char[] data = new char[20];
//        int num = reader.read(data);
//        reader.close();
//        String str2 = new String(data, 0, num);
//        return str2;
//    }
        InputStream is = new FileInputStream("C:/Temp/test.txt");
        Reader reader = new InputStreamReader(is, "UTF-8");
        BufferedReader br = new BufferedReader(reader);

        String str = br.readLine();
        return str;
    }
}
