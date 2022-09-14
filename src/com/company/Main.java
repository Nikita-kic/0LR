package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите одно четное и одно нечетное числа");
        a = scanner.nextInt();
        b = scanner.nextInt();

        if ((a % 2 == 0) && (b % 2 != 0))
            System.out.println(b + " - нечетное число");
        else if ((a % 2 != 0) && (b % 2 == 0))
            System.out.println(a + " - нечетное число");
        else
            System.out.println("Некорректный ввод");
        scanner.close();
    }
}
