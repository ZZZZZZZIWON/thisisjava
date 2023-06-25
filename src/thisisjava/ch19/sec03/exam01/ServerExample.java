package thisisjava.ch19.sec03.exam01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class ServerExample {

    private static ServerSocket serverSocket;
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");
        System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter키를 입력하세요.");
        System.out.println("----------------------------------------------------");

        // TCP 서버 시작
        startServer();

        // 키보드 입력
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if(key.toLowerCase().equals("q")) {
                break;
            }
        }
        scanner.close();

        // TCT 서버 종료
        stopServer();
        }

    private static void startServer() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                // ServerSocket 생성 및 Port 바인딩
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[서버] 시작");

                    while (true) {
                        System.out.println("\n[서버] 연결 요청을 기다림\n");
                        // 연결 수락
                        Socket socket = serverSocket.accept();

                        // 연결된 클라이언트 정보 얻기
                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                        String clientIp = isa.getHostString();
                        System.out.println("[서버] " + clientIp + "의 연결 요청을 수락함");

                        // 연결 끊기
                        socket.close();
                        System.out.println("[서버] " + clientIp + "의 연결을 끊음");
                    }
                } catch (IOException e) {
                    System.out.println("[서버] " + e.getMessage());
                    e.printStackTrace();
                }

            }
        };
        thread.start();
    }
    private static void stopServer() {
        // ServerSocket을 닫고 Port 언바인딩
        try {
            serverSocket.close();
            System.out.println("[서버] 종료됨");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

