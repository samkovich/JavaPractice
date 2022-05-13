package com.company;



import java.util.*;

public class Main {

    public static void main(String[] args) {

        int infoNum;
        do {
            //display the instruction for the user
            System.out.println("\nPlease enter a number to read about our zoo inhabitants or press 0 to EXIT.");

            System.out.println("1-LION");
            System.out.println("2-DOG");
            System.out.println("3-EAGLE");
            System.out.println("4-PENGUIN");
            System.out.println("5-SHARK\n");

            Scanner scan = new Scanner(System.in);
            infoNum = scan.nextInt();
            ReadFile display = new ReadFile();
            switch (infoNum){
                case 0:
                    System.out.println("Bye-bye!");
                    break;
                case 1:
                    display.openFile();
                    display.readLine1();
                    display.closeFile();
                    break;
                case 2:
                    display.openFile();
                    display.readLine2();
                    display.closeFile();
                    break;
                case 3:
                    display.openFile();
                    display.readLine3();
                    display.closeFile();
                    break;
                case 4:
                    display.openFile();
                    display.readLine4();
                    display.closeFile();
                    break;
                case 5:
                    display.openFile();
                    display.readLine5();
                    display.closeFile();
                    break;
                default:
                    System.out.println("Wrong number!");
                    break;
                    //throw new IllegalStateException("Unexpected value: " + infoNum);
            }

        } while (infoNum !=0);
        System.out.println("Have a nice day!");

    }
}


