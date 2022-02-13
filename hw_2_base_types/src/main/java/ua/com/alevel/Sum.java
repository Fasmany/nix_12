package ua.com.alevel;

import java.util.Scanner;

public class Sum {

    public void calculated() {
        System.out.println("Write your message with numbers and letters");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++){
            char temp = input.charAt(i);
            if (Character.isDigit(temp)){
                int digit = Integer.parseInt(String.valueOf(temp));
                sum = sum + digit;
            }
        }
        System.out.println("Sum is:" + sum );
    }
}