package com.example.spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Locale;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    //ham random ten:
    public String randomName(int length) {
        //random 1 ten co do dai tuy y
        //su dung thu vien Apache Common Lang
        return RandomStringUtils.randomAlphanumeric(length).toLowerCase();
    }

    //ham random 1 girl theo random ten
    public Girl getRandomGirl() {
        String name = this.randomName(10);
        //goi xuong tang repository de lay 1 co gai
        return girlRepository.getGirlByName(name);
    }
}
