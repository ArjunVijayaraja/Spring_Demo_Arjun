package com.Demo;

import org.springframework.cache.Cache;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        //Creating a object for a class in such a way (below) is TIGHT COUPLING
//        com.Demo.CricketCoach crickrtCoach = new com.Demo.CricketCoach();
//        System.out.println(crickrtCoach.getDailyWorkout());

//        com.Demo.FootBallCoach foodBallCoach = new com.Demo.FootBallCoach();
//        System.out.println(foodBallCoach.getDailyWorkout());
//------------------------------------------------------------------------------------------------------------------
        //InOrder to avoid it we can follow the
        //1. Interface and OverRiding methods

//        com.Demo.Coach coach = new com.Demo.CricketCoach();
//        System.out.println(coach.getDailyWorkout());
        // now while creating an Object - it is oK if we only change the name on the Right Side -- So it now Less Tightly coupled
//        com.Demo.Coach coach = new com.Demo.FootBallCoach();
//        System.out.println(coach.getDailyWorkout());
//---------------------------------------------------------------------------------------------------------------------


        //INVERSION OF CONTROL//
        // Insteard of creating an object for a class Manually-- we are using (giving the control to the Spring) to create an object
        //We should use Maven dependency --  search for "spring context" -- copy paste in pom.xmml file

        //***-----------------------------------------------------------
        //USING Spring to Create an Object
        //This concept is called Inversion o control
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("config.xml");
        //***---------------------------------------------------------------------

//        Coach coach = context.getBean("myCricketCoach", Coach.class);
//        System.out.println(coach.getDailyWorkout());
//        System.out.println(coach.getDailyWish());

//        Coach coach = context.getBean("myCricketCoach", CricketCoach.class);
        Coach coach = context.getBean("footBallCoach", FootBallCoach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyWish());
//        System.out.println(coach.getEmailAddress());
//        System.out.println(coach.getTeam());



//        FootBallCoach coach1 = context.getBean("myFootBallCoach", FootBallCoach.class);
//        System.out.println(coach == coach1);
        //This will return "True" because spring will nnot create a new object each and every time
        // this is called "SINGLETON"

        context.close();

    }

}
