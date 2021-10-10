package com.ex42;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Isabelle Kenny
 */
import java.util.*;
import java.io.*;
public class Main {

    //Parsing data file
    public void employeeInfo(String filename){
        try{
            File file = new File(filename);
            Scanner names = new Scanner(file);
            //While there is another line of information
            while (names.hasNext()){
                String s = names.nextLine();

                //Information within line separated by comma
                //Temp information in string[]
                String[] info = s.split(",");
                System.out.printf("%-10s%-10s%-10s\n", info[0], info[1], info[2]);
            }
        //Error says "java.io.FileNotFoundException; must be caught or declared to be thrown"
        //Here is try and catch to throw exception
        } catch (FileNotFoundException ex) {
            //Invalid file name/address
            System.out.println("Try Again! Enter valid file address");
        }
    }
    public static void main(String[] args) throws Exception {
        Main person = new Main();
        System.out.printf("%-10s%-10s%-10s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------");

        //Please input file address in replacement to "D:\Isabelle\Documents\exercise42_input.txt"
        //This is my file address, thus will need to be changed
        person.employeeInfo("D:\\Isabelle\\Documents\\exercise42_input.txt");

    }
}

