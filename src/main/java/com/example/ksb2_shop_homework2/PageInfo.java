package com.example.ksb2_shop_homework2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
//@ConfigurationProperties(prefix ="page-info" )
    public class PageInfo {

    @Value("${page-info.shopVersion}")
    private String shopVersion;

    @Value("${page-info.autor}")
    private String author;

    @Value("${page-info.creation-date}")
    private String creationDate;

//    @Value("${page-info.price}")
//    private double price;

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println(shopVersion);
        System.out.println(author);
        System.out.println(creationDate);
     //   System.out.println(price);


}
}
