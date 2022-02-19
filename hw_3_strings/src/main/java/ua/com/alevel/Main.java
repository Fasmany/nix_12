package ua.com.alevel;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to homework 3");
        System.out.println("Enter the number of the task you want to run, from 1-3 or 0 to exit:\n" +
                "1 - Reverse string\n" +
                "2 - Reverse substring\n" +
                "3 - Reverse string by first and last index\n" +
                "0 - Exit");
        int numberTask = scan.nextInt();

        switch (numberTask) {
            case 1 -> {
                System.out.println("Enter your string:");
                scan = new Scanner(System.in);
                String userString = scan.nextLine();
                String result = ReverseString.reverse(userString);
                System.out.println("Result: " + result);
                main(new String[]{""});
            }
            case 2 -> {
                System.out.println("Enter your string:");
                scan = new Scanner(System.in);
                String userString = scan.nextLine();
                System.out.println("Enter substring:");
                scan = new Scanner(System.in);
                String userSubstring = scan.nextLine();

                String result = ReverseString.substringReverse(userString, userSubstring);

                System.out.println("Result: " + result);
                main(new String[]{""});
            }
            case 3 -> {
                System.out.println("Enter your string:");
                scan = new Scanner(System.in);
                String userString = scan.nextLine();
                System.out.println("Enter first index:");
                scan = new Scanner(System.in);
                int firstIndex = scan.nextInt();
                System.out.println("Enter last index:");
                scan = new Scanner(System.in);
                int lastIndex = scan.nextInt();

                String resultString = ReverseString.specialReverse(userString, firstIndex, lastIndex);

                System.out.println("Result: " + resultString);
                main(new String[]{""});
            }
            case 0 -> {
                System.out.println("Program stop");
                }
            default -> {
                System.out.println("Please, select correct task number");
                main(new String[]{""});
            }
        }
    }
}