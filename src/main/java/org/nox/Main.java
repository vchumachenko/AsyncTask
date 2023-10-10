package org.nox;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new AsynPrint().start();
        while (true) {
            System.out.println("Работает основная программа");
            Thread.sleep(1000);
        }
    }
}