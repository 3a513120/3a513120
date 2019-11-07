package com.example.no23;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class no23 {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            FileInputStream readIn = new FileInputStream(file);
            InputStreamReader read = new InputStreamReader(readIn, "UTF-8" );
            BufferedReader bufferedReader = new BufferedReader(read);
            String oneLine = null;
            while ((oneLine = bufferedReader.readLine()) != null) {
                System.out.println(oneLine);
            }
            read.close();
        }
        catch (Exception e) {
            System.out.println("讀取文件內容出錯");
            e.printStackTrace();
        }
    }
}
