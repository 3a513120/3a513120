package com.example.no24;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class no24 {
    public static void main(String[] args) {
        StudentGrade studentGrade = new StudentGrade();
        int i=0;
        try {
            File file = new File("couse.txt");
            FileInputStream readIn = new FileInputStream(file);
            InputStreamReader read = new InputStreamReader(readIn, "UTF-8" );
            BufferedReader bufferedReader = new BufferedReader(read);
            String oneLine = null;
            while ((oneLine = bufferedReader.readLine()) != null) {
                System.out.println(oneLine);
                studentGrade.getStudentData(i,oneLine);
                i++;
            }
            read.close();
        }
        catch (Exception e) {
            System.out.println("Åª¨ú¤å¥ó¤º®e¥X¿ù");
            e.printStackTrace();
        }
        studentGrade.PrintAllData();
    }
}
