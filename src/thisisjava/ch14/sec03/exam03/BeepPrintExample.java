package thisisjava.ch14.sec03.exam03;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit tookit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    tookit.beep();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
            }
        };
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }

        }
    }
}
