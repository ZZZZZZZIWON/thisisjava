package thisisjava.ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        try(Writer writer = new FileWriter("C:/Temp/test.txt")) {

            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);

            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            writer.write("FGH");

            writer.flush();
            System.out.println("출력 성공");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
