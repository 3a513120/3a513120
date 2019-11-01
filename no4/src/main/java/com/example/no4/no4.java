package com.example.no4;

import java.util.Scanner;

public class no4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of seconds");
        int sec = scanner.nextInt();
        int h = sec / 3600;
        int m = sec % 3600 / 60;
        int s = sec % 60;
        System.out.println(h+" hour "+m+" minute "+s+" second ");
    }
}
