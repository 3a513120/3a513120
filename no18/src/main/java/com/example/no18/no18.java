package com.example.no18;

import java.util.Scanner;

public class no18 {
    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入數字串 : ");
        String x = scanner.next();
        int N0=0,N1=0,N2=0,N3=0,N4=0,N5=0,N6=0,N7=0,N8=0,N9=0;
        for(int i=0;i<x.length();i++){
            switch (Integer.parseInt(String.valueOf(x.charAt(i)))){
                case 0:
                    N0++;
                    break;
                case 1:
                    N1++;
                    break;
                case 2:
                    N2++;
                    break;
                case 3:
                    N3++;
                    break;
                case 4:
                    N4++;
                    break;
                case 5:
                    N5++;
                    break;
                case 6:
                    N6++;
                    break;
                case 7:
                    N7++;
                    break;
                case 8:
                    N8++;
                    break;
                case 9:
                    N9++;
                    break;
            }
        }
        int[] arr = {N0, N1, N2, N3, N4, N5, N6, N7, N8, N9};
        for(int i=0;i<10;i++ ){
            System.out.printf("數字 %d 出現 %d次\n",i,arr[i]);
        }
    }
}
