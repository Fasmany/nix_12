package ua.com.alevel;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Numbers.UniqueNumbersRun uniqueNumbersRun = new Numbers.UniqueNumbersRun();
        Chess chessRun = new Chess();
        Triangle.TriangleRun triangleRun = new Triangle.TriangleRun();
        AvaliableString.AvaliableStringRun avaliableStringRun = new AvaliableString.AvaliableStringRun();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number of the task you want to run, from 1-4 or 0 to exit:\n" +
                    "1 - Number of unique digits in the string\n" +
                    "2 - Knight's move\n" +
                    "3 - The area of the triangle\n" +
                    "4 - Avaliable string\n" +
                    "0 - Exit");

            int select;
            try {
                select = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid number\n" +
                        "Enter number of tast 1-4");
                scanner = new Scanner(System.in);
                select = scanner.nextInt();
                continue;
            }
            switch (select) {
                case 1 -> uniqueNumbersRun.numbersRun();
                case 2 -> chessRun.chessRun();
                case 3 -> triangleRun.triangleAreaRun();
                case 4 -> avaliableStringRun.avaliableStringRun();
            }
            if (select == 0) {
                break;
            }
        }
    }
}

