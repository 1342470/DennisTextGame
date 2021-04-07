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
public class MI13SceretServiceHeadquarters implements location{
    private final int Sausages;
    private String location;

    /**
     *
     * @param Sausages defines the number of saughages ih locaiton 
     * @param location defines location if more than one is created
     */
    public MI13SceretServiceHeadquarters(int Sausages, String location) {
        this.Sausages = Sausages;
        this.location = location;
    }

    /**
     *getter for item
     * @return value of sausages
     */
    @Override
    public int getitem() {
        return Sausages;
    }

    /**
     *setter for saugages
     */
    @Override
    public void setitem() {
        
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
     *prints out discription of locaiton 
     */
    @Override
    public void ExplainLocation() {
        System.out.println("You finally at the end the after finding the location of walter you see a long corrdoor that leads to a door.");
    }

    /**
     *story methord used by the main
     */
    public static void goToMI13(){
        System.out.println("You finally at the end the after finding the location of walter you see a long corrdoor that leads to a door.");
        
        }

    
}
