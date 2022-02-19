package ua.com.alevel;

import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {

    public int uniqueNumbersInString(String userString) {
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (int indexAtString = 0; indexAtString < userString.length(); indexAtString++) {

            char numberAtIndex = userString.charAt(indexAtString);

            if (Character.isDigit(numberAtIndex) && !uniqueNumbers.contains((int) numberAtIndex)) {
                uniqueNumbers.add((int) numberAtIndex);
            }
        }

        return uniqueNumbers.size();
    }

    static class UniqueNumbersRun {

        Numbers numbers = new Numbers();
        String userString;
        Scanner scanner = new Scanner(System.in);

        public void numbersRun() {
            try {
                int selector = 1;
                while (selector != 0) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Enter your string:");
                    userString = scan.nextLine();
                    System.out.println("Number of unique digits: " + numbers.uniqueNumbersInString(userString));
                    System.out.println("Try again?\n" +
                            "1 - Yes\n" +
                            "0 - Back in menu");
                    selector = scan.nextInt();
                }
            } catch (Exception e) {
                int select = 1;
                System.out.println("Invalid number\n" +
                        "press 1 to back at menu and try again");
                select = scanner.nextInt();
            }
        }
    }
}

