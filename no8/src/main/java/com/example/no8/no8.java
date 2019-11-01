package com.example.no8;

import java.util.Scanner;

public class no8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter n");
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean k = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    k = false;
                    break;
                }
            }
            if (k) {
                System.out.println("Prime number is : " + i);
            }
        }
    }
}
