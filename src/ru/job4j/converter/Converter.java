package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value/60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);
        int rubleE = Converter.euroToRuble(5);
        int rubleD = Converter.dollarToRuble(7);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollar.");
        System.out.println("5 euros are " + rubleE + " rubles.");
        System.out.println("7 dollars are " + rubleD + " rubles.");
    }
}