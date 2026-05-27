package com.mystore.caffeeapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class CaffeeConfig {
    @Bean("caffe1")
    public Caffee caffee1(){
        return new Caffee("001","Amazon","3$", true);
    }

    @Bean("caffee2")
    public Caffee caffee2(){
        return new Caffee("002","Arabica","2$", true);
    }

    @Bean("caffee3")
    public Caffee caffee3(){
        return new Caffee("003","Crosa","1$", true);
    }
}
