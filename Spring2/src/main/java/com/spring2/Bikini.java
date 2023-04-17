package com.spring2;

import org.springframework.stereotype.Component;

@Component("bikini")
public class Bikini implements Outfit {

    @Override
    public void wear() {
        System.out.println("Mac bikini");
    }
}
