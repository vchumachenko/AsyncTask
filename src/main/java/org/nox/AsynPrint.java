package org.nox;

public class AsynPrint extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10000);
                System.out.println("Асинхронный привет!");
                Thread.sleep(5000);
                System.out.println("Асинхронный пока!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
