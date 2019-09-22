package com.example.ksb2_shop_homework2;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile("Pro")
public class ShopPro {

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println("Shop Pro");

    }
}