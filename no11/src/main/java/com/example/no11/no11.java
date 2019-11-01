package com.example.no11;

import java.util.Scanner;

public class no11 {
    public static void main (String[]args){
        int i=0;
        int j=0;
        int k=0;
        int x=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers : ");
        i=scanner.nextInt();
        j=scanner.nextInt();
        k=scanner.nextInt();
        if(i>j)
        {
            x=i;
            i=j;
            j=x;
        }
        if(i>k)
        {
            x=i;
            i=k;
            k=x;
        }
        if(j>k)
        {
            x=j;
            j=k;
            k=x;
        }
        System.out.println(i+", "+j+", "+k);
    }
}
