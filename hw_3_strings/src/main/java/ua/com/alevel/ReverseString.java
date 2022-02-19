package ua.com.alevel;

public final class ReverseString {

    private ReverseString() {
    }

    public static String reverse(String input) {
        char[] symbol = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            symbol[i] = input.charAt(input.length() - i - 1);
        }
        return new String(symbol);
    }

    public static String substringReverse(String input, String substring) {
        String substringReverse = reverse(substring);
        if (input.toLowerCase().contains(substring.toLowerCase())) {
            return input.replaceAll(substring, substringReverse);
        } else {
            return "This string does not contain such substring";
        }
    }

    public static String specialReverse(String input, int firstIndex, int lastIndex) {
        StringBuilder substring = new StringBuilder(input.length());
        for (int i = firstIndex; i <= lastIndex; i++) {
            substring.append(input.charAt(i));
        }
        return input.replaceAll(substring.toString(), reverse(substring.toString()));
    }
}
