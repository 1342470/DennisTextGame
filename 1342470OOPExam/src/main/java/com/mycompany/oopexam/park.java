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

    public park(int skateboards, String location) {
        this.skateboards = skateboards;
        this.location = location;
    }

    

    
    @Override
    public int getitem() {
        return skateboards;
    }

    @Override
    public void setitem() {
        this.skateboards = skateboards;
    }
    
    public void eatapple(Person theEater){
        theEater.increasehelath();
        System.out.println("yummy" + theEater.getName()+ " eats the apple restoring 1 point of health");
    }

    @Override
    public String getLocation() {
        return location;
    }

 

    @Override
    public void ExplainLocation() {
        System.out.println("You are currently at the park around you are are stakeboards.");
    }


    
    public static void gotopark(){
        Dennis DennisM = new Dennis(10,"Male",0,"Dennis the menis",5,100,"Dennis",0);
        DennisM.losecon();
        
        System.out.println("now at the park you see shakeboards");
        
        }
    
}
