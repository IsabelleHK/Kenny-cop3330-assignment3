package com.ex46;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Isabelle Kenny
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)throws IOException {
        String currentPath = System.getProperty("user.dir");
        File file = new File(currentPath +"\\exercise46_input.txt");
        String[] words=null; //Intialize the word Array
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String s;
        String word1="badger", word2 = "mushroom", word3="snake";
        int count1=0, count2=0, count3=0;
        while((s=br.readLine())!=null){
            words=s.split(" ");
            for (String word : words) {
                if (word.equals(word1)){
                    count1++; 
                }
                if(word.equals(word2)){
                    count2++;
                }
                if(word.equals(word3)){
                    count3++;
                }
            }
        }
        System.out.print("badger: ");
        if(count1!=0){
            for(int i = 0; i<count1; i++){
                System.out.print("*");
            }
        }
        System.out.print("\nmushroom: ");
        if(count2!=0){
            for(int i = 0; i<count2; i++){
                System.out.print("*");
            }
        }
        System.out.print("\nsnake: ");
        if(count3!=0){
            for(int i = 0; i<count3; i++){
                System.out.print("*");
            }
        }
        fr.close();
    }
}
