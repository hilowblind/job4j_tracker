package ru.job4j.pojo;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       // на этом не заостряй внимание, просто напиши, это нужно для считывания строк

        System.out.println("Введите первое число:");
        int a = scanner.nextInt();                      // здесь считываем первое число, потом второе

        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        System.out.println("Введите знак операции: ");
        String znakOperacii = scanner.next();                    //  здесь считываем знак операции, плюс, минус, деление и тд

        System.out.println("Результат операции: ");
        if (znakOperacii.equals("+")) {                          //  с помощью equals сравниваем знак операции с +, - и тд
            System.out.println(a + b);
        } else if (znakOperacii.equals("-")) {
            System.out.println(a - b);
        }
    }
}
