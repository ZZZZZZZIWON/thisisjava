package thisisjava.ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) {
//        try {
//            OutputStream os = new FileOutputStream("C:/Temp/test.txt");
//
//            String str = "문자 변환 스트림을 사용합니다.";
//
//            byte[] data = str.getBytes("UTF-8");
//
//            os.write(data);
//
//            os.flush();
//            os.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try (OutputStream os = new FileOutputStream("C:/Temp/test.txt");
             Writer writer = new OutputStreamWriter(os, "UTF-8");) {

            String str = "문자 변환 스트림을 사용합니다.";
            writer.write(str);

            writer.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }

//        try(InputStream is = new FileInputStream("C:/Temp/test.txt");) {
//
//                byte[] data = new byte[100];
//                int num = is.read(data);
////            for (int i = 0; i < num; i++) {
////                System.out.print(data[i]);
////            }
//                String str2 = new String(data,"UTF-8");
//                System.out.println(str2);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try (InputStream is = new FileInputStream("C:/Temp/test.txt");
             Reader reader = new InputStreamReader(is, "UTF-8");) {

            char[] data = new char[20];
            int num = reader.read(data);

            String str = new String(data, 0, num);
            System.out.println(str);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
