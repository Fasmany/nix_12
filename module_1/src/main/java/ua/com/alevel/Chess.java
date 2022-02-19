package ua.com.alevel;

import java.util.Arrays;
import java.util.Scanner;

class Chess {

    MoveChess chess = new MoveChess();
    Scanner scan = new Scanner(System.in);

    public void chessRun() {
        try {
            int selector = 1;
            while (selector != 0) {
                chess.horseStepIsPossible();

                System.out.println("Try again?\n" +
                        "1 - Yes\n" +
                        "0 - Back in menu");
                selector = scan.nextInt();
            }
        } catch (Exception e) {
            int selector = 1;
            System.out.println("Invalid number\n" +
                    "press 1 to back at menu and try again");
            selector = scan.nextInt();
        }
    }

    public static class MoveChess {

        public void horseStepIsPossible() {

            final char startPosLetter;
            final int startPosNumber;
            final char finPosLetter;
            final int finPosNumber;

            //отрисовка коня
            char horse = 9822;
            char whiteSquare = 9644;
            char blackSquare = 9645;

            char[][] chessBoard = new char[8][8];

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the starting and final position of the knight: ");

            System.out.println("Starting position, letter A - H: ");
            startPosLetter = scanner.next().charAt(0);

            System.out.println("Starting position, number 1 - 8: ");
            startPosNumber = scanner.nextInt();

            System.out.println("Final position, letter A - H: ");
            finPosLetter = scanner.next().charAt(0);

            System.out.println("Final position, number 1 - 8: ");
            finPosNumber = scanner.nextInt();

            int numberOfStartLetter = (int) Character.toUpperCase(startPosLetter) - 65;
            int numberOfFinLetter = (int) Character.toUpperCase(finPosLetter) - 65;

            int horseStepLetter = numberOfFinLetter - numberOfStartLetter;
            int horseStepNumber = finPosNumber - startPosNumber;

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {

                    if (i % 2 == 0 & j % 2 == 1) {
                        chessBoard[i][j] = blackSquare;
                    } else if (i % 2 == 1 & j % 2 == 0) {
                        chessBoard[i][j] = blackSquare;
                    } else if (i % 2 == 0 & j % 2 == 0) {
                        chessBoard[i][j] = whiteSquare;
                    } else if (i % 2 == 1 & j % 2 == 1) {
                        chessBoard[i][j] = whiteSquare;
                    }
                }
            }

            try {
                chessBoard[startPosNumber - 1][numberOfStartLetter] = horse;
                chessBoard[finPosNumber - 1][numberOfFinLetter] = horse;

                if (Math.abs(horseStepNumber) == 1 && Math.abs(horseStepLetter) == 2 ||
                        Math.abs(horseStepNumber) == 2 && Math.abs(horseStepLetter) == 1) {
                    System.out.println("The move is possible");
                } else {
                    System.out.println("The move is not possible");
                }

            } catch (Exception e) {
                System.out.println("Invalid number! \n" +
                        "letter from A to H \n" +
                        "number from 1 to 8");
            }

            for (int i = 0; i < 8; i++) {
                System.out.println(i + 1 + " " + Arrays.toString(chessBoard[i]));
            }
            System.out.println("  " + " A  " + " B  " + " C  " + "D  " + " E  " + " F  " + "G  " + " H");
        }
    }
}

