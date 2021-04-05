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


    public MI13SceretServiceHeadquarters(int Sausages, String location) {
        this.Sausages = Sausages;
        this.location = location;
    }


    

    
    @Override
    public int getitem() {
        return Sausages;
    }

    @Override
    public void setitem() {
        
    }
    
    public void useCatapult(Person theEn){
        theEn.decreasehealth();
        System.out.println("you shoot the slingshot hitting " + theEn.getName() + " the impact leaves them with " + theEn.gethealth()+ "enery left ");
    }

    @Override
    public String getLocation() {
        return location;
    }

 

    @Override
    public void ExplainLocation() {
        System.out.println("You are currently at the park around you are are stakeboards.");
    }

    
    public static void goToLivingRoom(){
        Sandra SandraM = new Sandra(34,"Female",1,"test",5,100,"test");
        Dennis DennisM = new Dennis(10,"Male",0,"Dennis the menis",5,100,"Dennis",0);

        
        }

    
}
