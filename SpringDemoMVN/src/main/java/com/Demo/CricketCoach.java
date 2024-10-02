package com.Demo;

import org.springframework.stereotype.Component;

//@Component("myCricketCoach")
@Component
public class CricketCoach implements Coach   {
    WishSerivice wishSerivice;

    //norma way of initiallising an object is by using constructor
    public CricketCoach(WishSerivice wishSerivice){
        this.wishSerivice = wishSerivice;
    }
    public String getDailyWorkout(){
        return "Spen Daily 30 mins of Batting";
    }

    @Override
    public String getDailyWish() {
        return wishSerivice.getWish();
    }

    //Creating an Object for CricketCoach as usual method
   // CricketCoach coach = new CricketCoach(new HappyWishService());

    //Now By using a Spring Bean the Object is goint to be created


}
