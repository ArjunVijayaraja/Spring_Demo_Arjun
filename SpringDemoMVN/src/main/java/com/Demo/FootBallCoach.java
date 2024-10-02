package com.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("myFootBallCoach")
@Component
public class FootBallCoach implements Coach {
    private WishSerivice wishSerivice;
    private String emailAddress;
    private String team;

    @Autowired
    public void setWishSerivice(WishSerivice wishSerivice) {
        this.wishSerivice = wishSerivice;
    }

    @Autowired
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Autowired
    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public String getDailyWorkout(){
        return "Spen Daily 120 mins of Kicking";
    }

    @Override
    public String getDailyWish() {
        return wishSerivice.getWish();
    }

    public void startUpMethod(){
        System.out.println("Started");
    }

    public void destroyMethod(){
        System.out.println("Destroy");
    }
}
