/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopexam;

/**
 *
 * @author kylej
 */
public class park implements location{
    private int skateboards;
    private String location;

    /**
     *
     * @param skateboards sets number of skateboards in location
     * @param location set location (if more than park is created it help to define which one is which)
     */
    public park(int skateboards, String location) {
        this.skateboards = skateboards;
        this.location = location;
    }

    /**
     * getter for item
     * @return value of skateboards
     */
    @Override
    public int getitem() {
        return skateboards;
    }

    /**
     * setter for item
     */
    @Override
    public void setitem() {
        this.skateboards = skateboards;
    }
    
    /**
     * allows user to eat item 
     * @param theEater target of who will eat the item
     */
    public void eatapple(Person theEater){
        theEater.increaseHealth();
        System.out.println("yummy" + theEater.getName()+ " eats the apple restoring 1 point of health");
    }

    /**
     *getter for location  
     * @return value of location 
     */
    @Override
    public String getLocation() {
        return location;
    }

    /**
     *explains current location
     */
    @Override
    public void ExplainLocation() {
        System.out.println("You are currently at the park around you are are stakeboards.");
    }


        /**
         * story methord used by main
         */
    public static void gotopark(){
        Dennis DennisM = new Dennis(10,"Male",0,"Dennis the menis",5,100,"Dennis",0);
        DennisM.losecon();
        System.out.println("now at the park you see skakeboards however It seems like work is being done to the park guess you have to come back later luckly their a path back to the shops so you decide to go to the shops");
        Shops.toShops();
        }
    
}
