package com.ex41;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Isabelle Kenny
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        //To ensure graders can use their own file address, I used an input
        //File address input
        Scanner input = new Scanner(System.in);
        System.out.println("Paste file address: ");
        String fileName = input.nextLine();

        //Scanner class to scan file for inputs separated by lines
        //Adding each input to array
        Scanner file = new Scanner(new File(fileName));
        ArrayList<String> list = new ArrayList<String>();
        while (file.hasNextLine()){
            list.add(file.nextLine());
        }
        file.close();

        //Sorting array
        Collections.sort(list);

        //Output command to create file named "exercise41_output.txt"
        PrintStream out = new PrintStream(new FileOutputStream("exercise41_output.txt"));
        System.setOut(out);

        //Converting string into string[]
        String names[] = new String[list.size()];
        for (int x = 0; x<list.size(); x++){
            names[x] = list.get(x);
       }

        //Output into file
        System.out.println("Total of " + list.size() + " names");
        System.out.println("---------------------------");
        for(int j = 0; j<list.size(); j++){
            System.out.println(names[j]);

       }
    }
}
