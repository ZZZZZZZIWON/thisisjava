package thisisjava.ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {

        String originalFileName = "C:/Temp/test.jpg";
        String targetFileName = "C:/Temp/test2.jpg";

        try (InputStream is = new FileInputStream(originalFileName);
             OutputStream os = new FileOutputStream(targetFileName);) {

            byte[] data = new byte[1024];
            while(true) {
                int num = is.read(data);
                if(num == -1) break;
                os.write(data, 0, num);
//                os.write(data); 512byte가 남았는데 그 이상을 쓰게 하면 파일이 깨질 수 있음
            }
            os.flush();

            System.out.println("복사가 잘 되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
