package com.ex45;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Isabelle Kenny
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    //Needs throw exception in the event file error
    public static void main(String[] args) throws IOException {
        //Address puling from current file
        //Ensures that grader's file address is taken correctly
        String currentPath = System.getProperty("user.dir");
        File file = new File(currentPath +"\\exercise45_input.txt");

        Scanner sFile = new Scanner(file);
        System.out.print("Output File name: ");

        Scanner s = new Scanner(System.in);
        String outputfile = s.next();

        // Same as before, using current folder for address path
        FileWriter writer = new FileWriter(currentPath +"\\" +outputfile);
        try {
            while(sFile.hasNext()) {
                String user = sFile.nextLine();

                //Replace function from file writer
                user = user.replaceAll("utilize", "use");
                writer.write(user);
                writer.write("\n");
            }
        }
        finally {
            sFile.close();
        }
        writer.close();
        System.out.println("\nFile created");
    }
}
