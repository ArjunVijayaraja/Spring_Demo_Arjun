package com.Demo;

import org.springframework.stereotype.Component;

@Component("myWish")
public class HappyWishService implements WishSerivice{

    @Override
    public String getWish() {
        return "Good Luck for the Match--Happy wish";
    }
}
