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
public class treehouse implements location{
    public static int pies;
    private String location;

    public treehouse(int pies, String location) {
        treehouse.pies = pies;
        this.location = location;
    }

    
    
    @Override
    public int getitem() {
        return pies;
    }
    

    @Override
    public void setitem() {
        pies--;
    }

    @Override
    public String getLocation() {
        return location;
    }


    @Override
    public void ExplainLocation() {
        System.out.println("You are currently at the treehouse apon looking around the locaiton you find that thier are a number of pies scattered around proboly bought ready for throwing at pie face the local officer. From your treehouse you can see the local shops nearby as well as your front room");
    }

    @Override
    public void changeLocation(String locaiton) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
