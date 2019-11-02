package com.example.no20;

public class Phone {
    private int Number;
    private String Pinpi;
    private String Sinhao;
    private String Year;
    private String Money;

    public Phone(int number,String pinpi,String sinhao,String year,String money){
        Number=number;
        Pinpi=pinpi;
        Sinhao=sinhao;
        Year=year;
        Money=money;
    }
    public String getPinpi(){
        return Pinpi;
    }
    public String getSinhao(){
        return Sinhao;
    }
    public String getYear(){
        return Year;
    }
    public String getMoney(){
        return Money;
    }
    public void allphone(){
        System.out.println("手機 : "+Number+" 品牌 : "+Pinpi+" 型號 : "+Sinhao+" 出廠年份 : "+Year+" 售價 : "+Money);
    }
}
