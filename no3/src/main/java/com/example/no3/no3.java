package com.example.no3;

import java.util.Scanner;

public class no3 {
    public static void main (String[] args)
    {
        float num1,num2,num3,num4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your height and weight? : ");
        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();
        num4 = num1/100;
        num3 = num2/(num4*num4);
        System.out.println("BMI : " + num3 );
    }
}
