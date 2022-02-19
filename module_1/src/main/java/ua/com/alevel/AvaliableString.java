package ua.com.alevel;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class AvaliableString {

    public boolean isValid(String userString) {
        String s = onlyBrackets(userString);
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                stack.push(')');
            else if (ch == '{')
                stack.push('}');
            else if (ch == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != ch)
                return false;
        }
        return stack.isEmpty();
    }

    private String onlyBrackets(String userString) {
        ArrayList<Character> brackets = new ArrayList<>();
        for (int indexChar = 0; indexChar < userString.length(); indexChar++) {

            if (userString.charAt(indexChar) == '(' | userString.charAt(indexChar) == ')' |
                    userString.charAt(indexChar) == '{' | userString.charAt(indexChar) == '}' |
                    userString.charAt(indexChar) == '[' | userString.charAt(indexChar) == ']') {
                brackets.add(userString.charAt(indexChar));
            }
        }
        char[] brack = new char[brackets.size()];
        for (int i = 0; i < brackets.size(); i++) {
            brack[i] = (char) brackets.get(i);
        }
        String result = new String(brack);
        return result;
    }

    static class AvaliableStringRun {

        AvaliableString avaliableString = new AvaliableString();

        public void avaliableStringRun() {
            Scanner scanner = new Scanner(System.in);
            try {
                String userString;
                boolean result;
                int selector = 1;

                while (selector != 0) {

                    System.out.println("Enter your string, with using bracket: ( ),[ ],{ }: ");
                    userString = scanner.nextLine();

                    result = avaliableString.isValid(userString);
                    if (result) {
                        System.out.println("String avaliable!");
                    } else {
                        System.out.println("String not avaliable!");
                    }

                    System.out.println("Try again?\n" +
                            "1 - Yes\n" +
                            "0 - Back in menu");
                    selector = scanner.nextInt();
                }
            } catch (Exception e) {
                int selector = 1;
                System.out.println("Invalid string\n" +
                        "\"press 1 to back at menu and try again");
                selector = scanner.nextInt();
            }
        }
    }
}

