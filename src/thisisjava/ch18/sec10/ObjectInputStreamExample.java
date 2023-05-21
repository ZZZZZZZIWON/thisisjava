package thisisjava.ch18.sec10;

import java.io.*;
import java.util.Arrays;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("C:/Temp/object.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Member m2 = (Member) ois.readObject();
        Product p2 = (Product) ois.readObject();
        int[] arr2 = (int[]) ois.readObject();

        ois.close();
        fis.close();

        System.out.println(m2);
        System.out.println(p2);
        System.out.println(Arrays.toString(arr2));

    }
}
