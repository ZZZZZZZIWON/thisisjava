package thisisjava.ch18.sec03.exam01;

import java.io.*;

public class ReadExample {
    public static void main(String[] args) {

        try (InputStream is = new FileInputStream("C:/Temp/test1.db")) {

            while (true) {
                int data = is.read();
                if(data==-1) break;
                System.out.println(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
