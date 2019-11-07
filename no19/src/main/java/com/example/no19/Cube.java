package com.example.no19;

import java.util.Scanner;

public class Cube {
    private Scanner scanner = new Scanner(System.in);
    private float cube[] = new float[40];
    private float point[] = new float[20];
    private int cubeN=0,cubeC=0,pointN=0,pointC=0;


    public void makemoreCube(){
        System.out.println("請輸入 r 建立矩形(最多建立10個)，或輸入 e 結束");
        String s =scanner.next();
        while ((s.matches("r")!=true)&&(s.matches("e")!=true)){
            System.out.println("請輸入 r 建立矩形(最多建立10個)，或輸入 e 結束");
            s =scanner.next();
        }
        if(s.matches("r")){
            cubeN++;
            makeCube(cubeN,cubeC);
            cubeC+=4;
            makemoreCube();
        }
        else if(s.matches("e")){
            System.out.println("結束");
        }
    }

    public void makemorePoint(){
        System.out.println("請輸入 p 建立點(最多建立10個)，或輸入 e 結束");
        String s =scanner.next();
        while ((s.matches("p")!=true)&&(s.matches("e")!=true)){
            System.out.println("請輸入 p 建立點(最多建立10個)，或輸入 e 結束");
            s =scanner.next();
        }
        if(s.matches("p")){
            pointN++;
            makePoint(pointN,pointC);
            pointC+=2;
            makemorePoint();
        }
        else if(s.matches("e")){
            System.out.println("結束");
        }
    }

    private void setLowRight(int cC,float LRx,float LRy){
        cube[cC]=LRx;
        cube[cC+1]=LRy;
    }
    private void setUpLeft(int cC,float ULx,float ULy){
        cube[cC+2]=ULx;
        cube[cC+3]=ULy;
    }

    public  void makeCube(int cN,int cC){
        while ((cube[cC]<=cube[cC+2])||(cube[cC+1]>=cube[cC+3])){
            System.out.printf("請輸入矩形 %d 之正確左上(格式:x y)\n",cN);
            setUpLeft(cC,scanner.nextFloat(),scanner.nextFloat());
            System.out.printf("請輸入矩形 %d 之正確右下(格式:x y)\n",cN);
            setLowRight(cC,scanner.nextFloat(),scanner.nextFloat());
        }
    }
    public void makePoint(int pN,int pC){
        System.out.printf("請輸入點 %d (格式:x y)\n",pN);
        point[pC]=scanner.nextFloat();
        point[pC+1]=scanner.nextFloat();
    }

    public void pointCheck(){
        for (int j=0;j<pointN;j++){
            for(int i=0;i<cubeN;i++){
                if ((point[(j*2)]<cube[(i*4)])&&(point[((j*2)+1)]>cube[((i*4)+1)])&&(point[((j*2))]>cube[((i*4)+2)])&&(point[((j*2)+1)]<cube[((i*4)+3)])){
                    System.out.printf("點%d在圖%d內\n",(j+1),(i+1));
                }
                else{
                    System.out.printf("點%d不在圖%d內\n",(j+1),(i+1));
                }
            }
        }
    }
}
