package com.company;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println("Hello world");

        printThreeWords();
        checkSumSign(10, 5);
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("--------------------");
        System.out.println("|  Orange          |");
        System.out.println("|  Banana          |");
        System.out.println("|  Apple           |");
        System.out.println("--------------------");
    }

    public static void checkSumSign(int a, int b) {

        if (a + b < 0) {
            System.out.println(" Отрицательное");
        } else if (a + b > 0) {
            System.out.println("Положительное");
        }
    }

    public static void printColor() {
        int value = 100;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 7;
        int b = 40;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}











