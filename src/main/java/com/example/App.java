package com.example;

public class App {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Hello World");
            try {
                Thread.sleep(1000); // 等待 1 秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

