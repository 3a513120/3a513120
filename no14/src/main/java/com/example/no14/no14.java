package com.example.no14;

import java.util.Scanner;

public class no14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the three sides of the triangle : ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if ((x + y > z) && (x + z > y) && (y + z > x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
