package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

    File file = new File("src/main/test.txt");
    try{
        FileWriter writer = new FileWriter("home.txt", true);
        writer.write("Hello world!");
        writer.close();

    }
    catch (IOException e){
        System.out.println("went wrong");
    }



    if(file.exists()){
        System.out.println("That file exists");
        System.out.println(file.getAbsolutePath());
    } else {
        System.out.println("that file doesnt exist");


    }


    }


}