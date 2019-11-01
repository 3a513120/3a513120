package com.example.no17;

import java.util.Scanner;

public class no17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入五個數字 : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int[] arr = {a, b, c, d, e};
        int m = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i] < m) {
                m = arr[i];
            }
        }
        System.out.print("最小值為 : " + m);
    }
}
