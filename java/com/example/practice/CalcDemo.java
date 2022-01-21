package com.example.practice;

import java.util.Scanner;

public class CalcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();

        System.out.println(CalcApp.webpage);
        System.out.println("첫 번째 값을 입력하세요.");
        System.out.println("연산기호를 입력하세요.");
        System.out.println("두 번째 값을 입력하세요.");

        int num1 = scanner.nextInt();
        String opcode = scanner.next();
        int num2 = scanner.nextInt();

        String result = calcApp.calc(num1, opcode, num2);
        System.out.println(result);

    }
}
