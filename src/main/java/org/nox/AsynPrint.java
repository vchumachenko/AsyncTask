package org.nox;

public class AsynPrint extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                // Приостанавливаю выполнение потока на 10 сек
                Thread.sleep(10000);
                System.out.println("Асинхронный привет!");
                // Приостанавливаю на 5 сек
                Thread.sleep(5000);
                System.out.println("Асинхронный пока!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
} 
