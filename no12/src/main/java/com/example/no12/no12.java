package com.example.no12;

import java.util.Scanner;

public class no12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int n;
        int i, j, k, m;
        n = scanner.nextInt();
        m = n;
        if( n <= 50 ){
            for( k = 1; k <= m; k++ ){
                for( j = n; j < m; j++ ){
                    System.out.print(" ");
                }
                for( i = 1; i <= n; i++ ){
                    System.out.print("*");
                }
                System.out.print("\n");
                n--;
            }
        }
        else{
            System.out.print("Enter more than 50");
        }
    }
}
