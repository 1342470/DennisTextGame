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
public class bashStreetSchool implements location{
    private final int Disguises;
    private String location;


    public bashStreetSchool(int Disguises, String location) {
        this.Disguises = Disguises;
        this.location = location;
    }


    

    
    @Override
    public int getitem() {
        return Disguises;
    }

    @Override
    public void setitem() {
        
    }
    
    public void useDisguies(Person theEater){
     
    }

    @Override
    public String getLocation() {
        return location;
    }

 

    @Override
    public void ExplainLocation() {
        System.out.println("You are currently at the park around you are are stakeboards.");
    }


    
    public static void gotoBashStreetSchool(){
        
        }
    
}
