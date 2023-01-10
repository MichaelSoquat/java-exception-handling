package org.example;
import java.lang.Math;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {


            System.out.println("Enter a number");
            int x = scanner.nextInt();

            System.out.println("Enter a number to div");
            int y = scanner.nextInt();


            int z = x/y;

            System.out.println("result " + z);
        }
        catch (ArithmeticException e){
            System.out.println("Dont divide through 0");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter a number");
        }
        catch(Exception e){
            System.out.println("There went smth wrong");
        }
        finally {
            System.out.println("This will always print");
            scanner.close();
        }





    }


}