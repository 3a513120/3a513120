package com.example.no15;

import java.util.Scanner;

public class no15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a time : ");
        int h=scanner.nextInt();
        int m=scanner.nextInt();
        if(h<7)
            System.out.println("Off School ! ");
        if((h==7)&&(m<30))
            System.out.println("Off School ! ");
        if((h==7)&&(m>=30))
            System.out.println("At School ! ");
        if((h>7)&&(h<17))
            System.out.println("At School ! ");
        if(h>=17)
            System.out.println("Off School ! ");
    }
}
