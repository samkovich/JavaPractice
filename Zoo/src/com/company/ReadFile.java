package com.company;
import java.io.*;
import java.util.*;

public class ReadFile {

    private Scanner x;

    //open a file method
    public void openFile() {
        try {
            x = new Scanner(new File("C:\\Users\\asamk\\IdeaProjects\\Zoo\\src\\com\\company\\AnimalList"));
        } catch (FileNotFoundException e) {
            System.out.println("Could not find any information.");
        }
    }
      //read the data from the file method
    public void readLine1 () {
            do {
                String[] line = new String[5];
                //String line = x.nextLine();
                //System.out.printf("%s\n", line);
                for (int i = 0; i < 5; i++) {
                    if (x.hasNextLine()) {
                        line[i] = x.nextLine();
                    }
                }
                System.out.println(line[0]);
            } while (x.hasNext());
    }
    public void readLine2 () {
                do{
                    String [] line = new String[5];
                    //String line = x.nextLine();
                    //System.out.printf("%s\n", line);
                    for(int i = 0; i<5; i++)
                    {
                        if (x.hasNextLine())  {
                            line[i] = x.nextLine();
                        }
                    }
                    System.out.println(line[1]);
                }while(x.hasNext());
    }

    public void readLine3 () {
        do{
            String [] line = new String[5];
            //String line = x.nextLine();
            //System.out.printf("%s\n", line);
            for(int i = 0; i<5; i++)
            {
                if (x.hasNextLine())  {
                    line[i] = x.nextLine();
                }
            }
            System.out.println(line[2]);
        }while(x.hasNext());

    }

    public void readLine4 () {
        do{
            String [] line = new String[5];
            //String line = x.nextLine();
            //System.out.printf("%s\n", line);
            for(int i = 0; i<5; i++)
            {
                if (x.hasNextLine())  {
                    line[i] = x.nextLine();
                }
            }
            System.out.println(line[3]);
        }while(x.hasNext());

    }

    public void readLine5 () {
        do{
            String [] line = new String[5];
            //String line = x.nextLine();
            //System.out.printf("%s\n", line);
            for(int i = 0; i<5; i++)
            {
                if (x.hasNextLine())  {
                    line[i] = x.nextLine();
                }
            }
            System.out.println(line[4]);
        }while(x.hasNext());

    }
        //close the file method
    public void closeFile(){
          x.close();
    }
}
