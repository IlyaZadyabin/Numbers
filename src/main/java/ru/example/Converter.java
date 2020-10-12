package ru.example;

public class Converter {
    public static long ConvertToDec(char c) {
        if (Character.isLetter(c)) {
            return Character.toLowerCase(c) - 'a' + 10;
        } else {
            return Character.toLowerCase(c) - '0';
        }
    }
    public static char DecToChar(long num) {
        if (num <= 9) {
            return (char)(num + '0');
        } else {
            return (char)(num - 10 + 'A');
        }
    }
    public static String MakeString(long num, long system) {
        StringBuilder stringBuilder = new StringBuilder();
        while (num > 0) {
            stringBuilder.append(DecToChar(num % system));
            num /= system;
        }
        return stringBuilder.reverse().toString();
    }
    public static String Conversion(String x, long a, long b) {
        long dec_num = 0;
        for (int i = 0; i < x.length(); i++) {
            dec_num += Converter.ConvertToDec(x.charAt(i)) * Math.pow(a, x.length() - 1 - i);
        }
        if (dec_num == 0) {
            return "0";
        } else {
            return Converter.MakeString(dec_num, b);
        }
    }
}
