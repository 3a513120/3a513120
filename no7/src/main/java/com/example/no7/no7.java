package com.example.no7;

import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter n");
        int x = scanner.nextInt();
        int y = x*(x+1)/2;
        System.out.println("The sum is : "+y);
    }
}
