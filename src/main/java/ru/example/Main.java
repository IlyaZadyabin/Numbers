package ru.example;

public class Main {
    public static void main(String[] args) {
        long a = Long.parseLong(args[0]);
        long b = Long.parseLong(args[1]);
        String x = args[2];

        System.out.println(Converter.Conversion(x, a, b));
    }
}
