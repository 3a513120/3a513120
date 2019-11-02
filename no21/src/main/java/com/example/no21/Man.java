package com.example.no21;

import java.util.Scanner;

public class Man {
    private Scanner scanner = new Scanner(System.in);
    private String number;
    private String name;
    private String hourmoney;
    private String xxhour;
    private String month;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHourmoney(String hourmoney) {
        this.hourmoney = hourmoney;
    }

    public void setXxhour(String xxhour) {
        this.xxhour = xxhour;
    }

    public void setMonth(String month) {
        this.month = month;
    }
    public void end(){
        System.out.printf("請輸入員工編號 : ");
        setNumber(scanner.next());
        System.out.printf("請輸入員工姓名 : ");
        setName(scanner.next());
        System.out.printf("請輸入員工時薪 : ");
        setHourmoney(scanner.next());
        System.out.printf("請輸入員工工作時數 : ");
        setXxhour(scanner.next());
    }
    public void calc(){
        int a,b;
        a=Integer.parseInt(hourmoney);
        b=Integer.parseInt(xxhour);
        setMonth(String.valueOf(a*b));
        System.out.println("編號 : "+number+" 姓名 : "+name+" 時薪 : "+hourmoney+" 工作時數 : "+xxhour+" 月收入 : "+month);
    }
}
