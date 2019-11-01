package com.example.no5;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number of seconds");
        int sec = scanner.nextInt();
        System.out.println("Please enter the second number of seconds");
        int sec1 = scanner.nextInt();
        System.out.println("Please enter the first number of minutes");
        int min = scanner.nextInt();
        System.out.println("Please enter the second number of minutes");
        int min1 = scanner.nextInt();
        System.out.println("Please enter the first number of hours");
        int hr = scanner.nextInt();
        System.out.println("Please enter the second number of hours");
        int hr1 = scanner.nextInt();
        int h = hr - hr1;
        int m = min - min1;
        int s = sec - sec1;
        System.out.println(h*3600+m*60+s+"second");
    }
}
