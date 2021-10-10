package com.ex43;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Isabelle Kenny
 */
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String currentPath, author, siteName;
        //Declare questions and start at N
        char js = 'N';
        char css = 'N';

        //Input for site name
        System.out.print("Site name: ");
        siteName = input.nextLine();

        //Input for author
        System.out.print("Author: ");
        author = input.nextLine();

        //Does the user want a JS folder?
        System.out.print("Do you want a folder for JavaScript? ");
        js = input.next().charAt(0);

        //Does the user want a CSS folder?
        System.out.print("Do you want a folder for CSS? ");
        css = input.next().charAt(0);

        //User directory for address
        currentPath = System.getProperty("user.dir");
        currentPath += "\\"+siteName;
        File website = new File(currentPath);
        boolean websiteCreated = website.mkdir();
        if(websiteCreated)
        {
            System.out.println("Created " + currentPath);
            try
            {
                //Function to create file
                //FileWriter open
                FileWriter websiteWriter = new FileWriter(new File(currentPath+"\\index.html"));
                websiteWriter.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                websiteWriter.write("\t<meta author=\""+author+"\">\n");
                websiteWriter.write("\t<title>"+siteName+"</title>\n");
                websiteWriter.write("</head>\n<body>\n\n</body>\n</html>");
                websiteWriter.close();

                System.out.println("Created " + currentPath+"\\index.html");
                if(js == 'y' || js == 'Y')
                {
                    File jsFolder = new File(currentPath+"\\js");
                    //mkdir function
                    boolean jsCreated = jsFolder.mkdir();
                    //JS folder created
                    if(jsCreated)
                    {
                        System.out.println("Created " + jsFolder+"\\");
                    }
                    //User does not want JS folder
                    else
                    {
                        System.out.println("JS folder was not created.");
                    }
                }
                if(css == 'y' || css == 'Y')
                {
                    File cssFolder = new File(currentPath+"\\css");
                    //mkdir function
                    boolean cssCreated = cssFolder.mkdir();
                    //CSS folder created
                    if(cssCreated)
                    {
                        System.out.println("Created " + cssFolder+"\\");
                    }
                    //User does not want CSS folder
                    else
                    {
                        System.out.println("CSS folder was not created.");
                    }
                }
            }
            //If error occurs and index.html is not created
            catch(IOException e)
            {
                System.out.println("index.html not created.");
            }
        }
        //If error or website folder was not created
        else
        {
            System.out.println("Website folder was not created");
        }
        input.close();
    }
}
