package ua.com.alevel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sum first = new Sum();
        Quantity second = new Quantity();
        Lessons third = new Lessons();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to homework 2");

        while (true) {
            try {
                System.out.println("Enter the number of the task you want to run, from 1-3 or 0 to exit");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("Task 1 (SumOfNumbers):");
                    first.calculated();

                } else if (choice == 2) {
                    System.out.println("Task 2 (AmountOfLetters):");
                    second.count();

                } else if (choice == 3) {
                    System.out.println("Task 3 (EndOfLesson):");
                    third.bell();

                } else if (choice == 0) {
                    System.out.println("Program stop");
                    break;

                } else {
                    System.out.println("Invalid number. Try again.");
                }
            } catch (InputMismatchException input) {
                System.out.println("Invalid number. Try again.");
            }
        }


    }
}
