package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
     //   createNewFile();
        numbersExceptionHandiling();
    }
    public static void createNewFile(){
        File file = new File("C:/PhoneFactory/TAU videos/nonexistent.txt");
       try {
           file.createNewFile();
        } catch (Exception e){
           System.out.println("Directory does not exist");
           e.printStackTrace();
       }
    }
    public static void createNewFileRethrow() throws Exception{
        File file = new File("C:/PhoneFactory/TAU videos/nonexistent.txt");
        file.createNewFile();
    }
    public static void numbersExceptionHandiling(){
        File file = new File("C:/PhoneFactory/TAU videos/nonexistent.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }

        }catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }finally {
            fileReader.close();
        }
    }
}
