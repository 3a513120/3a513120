package com.example.no22;

import java.util.Scanner;

public class Man {
    private Scanner scanner = new Scanner(System.in);
    String a, b, c, d;
    private String number[] = {a, b, c, d};
    private String name[] = {a, b, c, d};
    private String hourmoney[] = {a, b, c, d};
    private String xxhour[] = {a, b, c, d};
    private String month[] = {a, b, c, d};
    private int allman = 4;

    public void setNumber(int i, String number) {
        this.number[i] = number;
    }

    public void setName(int i, String name) {
        this.name[i] = name;
    }

    public void setHourmoney(int i, String hourmoney) {
        this.hourmoney[i] = hourmoney;
    }

    public void setXxhour(int i, String xxhour) {
        this.xxhour[i] = xxhour;
    }

    public void setMonth(int i, String month) {
        this.month[i] = month;
    }

    public void end() {
        for (int i = 0; i < allman; i++) {
            System.out.printf("請輸入第%d員工編號 : ", (i + 1));
            setNumber(i, scanner.next());
            System.out.printf("請輸入第%d員工姓名 : ", (i + 1));
            setName(i, scanner.next());
            System.out.printf("請輸入員第%d工時薪 : ", (i + 1));
            setHourmoney(i, scanner.next());
            System.out.printf("請輸入員工第%d工作時數 : ", (i + 1));
            setXxhour(i, scanner.next());
        }

    }
    public void calc () {
        for (int i = 0; i < allman; i++) {
            int x,y;
            x=Integer.parseInt(hourmoney[i]);
            y=Integer.parseInt(xxhour[i]);
            setMonth(i, String.valueOf(x*y));
            System.out.println("編號 : " + number[i] + " 姓名 : " + name[i] + " 時薪 : " + hourmoney[i] + " 工作時數 : " + xxhour[i] + " 月收入 : " + month[i]);
        }
    }
}