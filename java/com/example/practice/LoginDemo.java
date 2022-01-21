package com.example.practice;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();
        System.out.println(LoginApp.webpage);
        System.out.println("Input ID: ");
        System.out.println("Input PW: ");
        System.out.println("Input name: ");


        String ID = scanner.next();
        String PW = scanner.next();
        String name = scanner.next();

        String result = loginApp.login(ID, PW, name);
        System.out.println(result);
    }
}
