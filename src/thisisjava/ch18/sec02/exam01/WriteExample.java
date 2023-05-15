package thisisjava.ch18.sec02.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) throws IOException {
//        OutputStream os = null;
//        try {
//            os = new FileOutputStream("C:/Temp/test1.db");
//
//            byte a = 10;
//
//            os.write(a);
//            System.out.println("저장 성공");
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            ;
//        } finally {
//            os.close();
//        }
        try (OutputStream os = new FileOutputStream("C:/Temp/test1.db")) {
            // autoCloseable 구현(finally 쓰지 않아도 자동으로 close)
            // if) append()(덮어쓰기) -> true값을 인자로 전달
            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c); // 파일 대체

            os.flush();
            System.out.println("저장 성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
