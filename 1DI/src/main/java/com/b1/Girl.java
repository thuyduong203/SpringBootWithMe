package com.b1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    //Annotation @Autowired: De Spring biet rang can phai
    // tu tiem(ịnect) 1 instance cua Outfit vao thuoc tinh nay
    //khi khoi tao girl
    @Autowired
    Outfit outfit;

    public Girl(Outfit outfit) {
        this.outfit = outfit;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
}
