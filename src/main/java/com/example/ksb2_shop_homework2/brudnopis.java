package com.example.ksb2_shop_homework2;

import java.util.ArrayList;
import java.util.Random;

public class brudnopis {
    public static void main(String[] args) {

        ArrayList<Double> article = new ArrayList();

        Random r = new Random();
        Double min = 50.00;
        Double max = 300.00;

        for (double i = 0; i < 5; i++) {
            double value = min + (max - min) * r.nextDouble();
            double price = (double) Math.round(value * 100) / 100;
            article.add(price);

            System.out.println(String.format("price = " + "%.2f", price) + " PLN");
        }
        double sum = 0;
        for (double i : article) {
            sum += i;
        }
        System.out.println(String.format("Total price = " + "%.2f", sum) + " PLN");
    }
}