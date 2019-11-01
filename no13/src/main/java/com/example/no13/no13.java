package com.example.no13;

import java.util.Scanner;

public class no13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter gender 1 for male 2 for female and enter age : ");
        int i=scanner.nextInt();
        int j=scanner.nextInt();
        if((i==1)&&(j>=18))
            System.out.println("You are marriageable ! ");
        if((i==1)&&(j<18))
            System.out.println("You are NOT marriageable ! ");
        if((i==2)&&(j>=18))
            System.out.println("You are marriageable ! ");
        if((i==2)&&(j<18))
            System.out.println("You are NOT marriageable ! ");
    }
}
