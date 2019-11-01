package com.example.no6;

import java.util.Scanner;

public class no6 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        while(scanner.hasNext() ){
            int a =scanner.nextInt();

            if( (a % 4 == 0 && a % 100 != 0) || a % 400 == 0 )
                System.out.println("leap year");
            else
                System.out.println("average year");
        }

    }
}
