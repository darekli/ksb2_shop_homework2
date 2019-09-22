package com.example.ksb2_shop_homework2;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ShopService {

    private List<Double> shopList = new ArrayList();

    Random random = new Random();
    Double priceMin = 50.00;
    Double priceMax = 300.00;

//    public List<Double> getShopList() {
//        return shopList;
//    }

    {
        for (double i = 0; i < 5; i++) {
            double value = priceMin + (priceMax - priceMin) * random.nextDouble();
            double price = (double) Math.round(value * 100) / 100;
            Shop product1 = new Shop("product1",price);
        Shop product2 = new Shop("product2", price);
        Shop product3 = new Shop("product3", price);
        Shop product4 = new Shop("product4", price);
        Shop product5 = new Shop("product5", price);
      shopList.add(price);

        System.out.println(String.format("price = " + "%.2f", price) + " PLN");
        }
        double sum = 0;
        for (double i : shopList) {
            sum += i;
        }
        System.out.println(String.format("Total price = " + "%.2f", sum) + " PLN");
    }
}


