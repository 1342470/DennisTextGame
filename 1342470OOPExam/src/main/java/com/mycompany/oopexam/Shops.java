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
public class Shops implements location{
    private int apples;
    private String location;

    public Shops(int apples, String location) {
        this.apples = apples;
        this.location = location;
    }

    

    
    @Override
    public int getitem() {
        return apples;
    }

    @Override
    public void setitem() {
        this.apples = apples;
    }
    
    public void eatapple(Person theEater){
        System.out.println("yummy" + theEater.getName()+ " eats the apple restoring 10 points of health");
    }

    @Override
    public String getLocation() {
        return location;
    }

 

    @Override
    public void ExplainLocation() {
        System.out.println("You are currently at the shops you see the famila slight of Pie-Face and a sign that states that they're currently giving out apples for free in a atempted to get more people to eat healthly.");
    }

    @Override
    public void changeLocation(String locaiton) {
        
    }
    
}
