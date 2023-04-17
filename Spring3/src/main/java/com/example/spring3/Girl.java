package com.example.spring3;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    @PostConstruct
    public void postConstruct() {
        System.out.println("Doi tuong girl sau khi duoc khoi tao se chay ham nay");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Doi tuong girl truoc khi destroy se chay ham nay");
    }

}
