package thisisjava.ch19.sec02;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내 컴퓨터 IP 주소: " + local);

            InetAddress[] isArr = InetAddress.getAllByName("www.naver.com");
            for (InetAddress remote : isArr) {
                System.out.println("www.naver.com의  IP 주쇠: " + remote.getHostAddress());
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

    }
}
