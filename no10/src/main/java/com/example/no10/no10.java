package com.example.no10;

import java.util.Scanner;

public class no10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the letter you want to convert : ");
        char c = input.next().charAt(0);
        change(c);
    }

    private static void change(char c) {
        if (c >= 'A' && c <= 'Z') {
            c += 32;
            System.out.println("The capital letter you entered is : " + (char) (c - 32) + ", Was converted into : " + c);
        } else if (c >= 'a' && c <= 'z') {
            c -= 32;
            System.out.println("The lowercase letter you entered is : " + (char) (c + 32) + ", Was converted into : " + c);
        } else {
            System.out.println("The characters entered are incorrect ! ");
        }
    }
}
