package org.example;

import org.example.service.UserService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // This code could and should be put in a Menu class
        boolean flag = true;
        // infinite loop:
        while (flag) {
            System.out.println("Choose an option:");
            System.out.println("1. Register a User");
            System.out.println("2. Quit");
            int choice;
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    UserService.create();
                    break;
                case 2:
                    System.out.println("Quitting now...");
                    flag = false;
                    break;
            }
        }
    }
}
