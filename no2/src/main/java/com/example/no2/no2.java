package com.example.no2;

import java.util.Scanner;

public class no2 {
    public static void main (String[] args)
    {
        int num1,num2,num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your birthday is? : ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        System.out.println("Year : " + num1 );
        System.out.println("Month : " + num2 );
        System.out.println("Day : " + num3 );
    }
}
