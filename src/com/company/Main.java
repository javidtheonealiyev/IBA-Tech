package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your char");

        char ch = scanner.next().charAt(0);
        if (Character.isUpperCase(ch) == true) {
            System.out.println("NO");
        } else if (Character.isUpperCase(ch) == false) {
            System.out.println("YES");
        }
    }
}
