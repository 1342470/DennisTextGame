/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopexam;

import java.util.Scanner;

/**
 *
 * @author kylej
 */
public class Shops implements location{
    private int apples;
    private final String location;

    /**
     *
     * @param apples interget that sets the amount of apples that are in a shop
     * @param location set the location of the shop (only used if more that one shop is created)
     */
    public Shops(int apples, String location) {
        this.apples = apples;
        this.location = location;
    }

    /**
     *
     * @return getter for the apple item
     */
    @Override
    public int getitem() {
        return apples;
    }

    /**
     *setters for the apple item
     */
    @Override
    public void setitem() {
        this.apples = apples;
    }
    
    /**
     *
     * @param theEater is the person who will eat the apple to gain health
     */
    public void eatapple(Person theEater){
        theEater.increaseHealth();
        System.out.println("yummy" + theEater.getName()+ " eats the apple restoring 1 point of health");
    }

    /**
     *
     * @return getter for the value of location 
     */
    @Override
    public String getLocation() {
        return location;
    }

    /**
     *simple output for the user that tells the user about their current location.
     */
    @Override
    public void ExplainLocation() {
        System.out.println("You are currently at the shops you see the famila slight of Pie-Face and a sign that states that they're currently giving out apples for free in a atempted to get more people to eat healthly.");
    }

    
    /**
     * method toShops is used by the main to progress the story
     */
    public static void toShops(){
        Dennis DennisM = new Dennis(10,"Male",0,"Dennis the menis",5,100,"Dennis",0);
        DennisM.losecon();
        Slipper SlipperS = new Slipper(34,"Male",1,"Slipper",5,100,"Sgt. Slipper");
        Gnashinator Gnash = new Gnashinator(0,"??","???",25,100,"Gnashinator");
        Shops localShops = new Shops(10,"local shops near Dennis house");
        localShops.ExplainLocation();
        System.out.println("once at the shops see that next to the saugage shop their the one of the worse villans to plage the land, the one and only Sgt. slipper across from Slipper is the walkway to the park as as as a shortcut made by yours truely to get bash street School.");
        Scanner input1 = new Scanner(System.in);
        System.out.println("please type in what you would like to do next");
        String responce = input1.nextLine();
        switch (responce) {
            case "shoot sling at slipper":
                DennisM.shootSling(SlipperS);
                SlipperS.specialistMove(DennisM);
                break;
            case "go to the park":
                System.out.println("you deside you to the park");
                park.gotopark();
                break;
            case "go to bash street school":
                System.out.println("for some strange reason you diside to go to school, however the way to the school is blocked by the Gnashinator ");
                System.out.println("What will you do next?");
                Scanner input2 = new Scanner(System.in);
                String responce2 = input2.nextLine();
            switch (responce2) {
                case "attack gnashinator":
                    while(Gnash.gethealth() !=0){
                        DennisM.shootSling(Gnash);
                        System.out.println("in rage the gnashinator bites back");
                        Gnash.bite(DennisM);
                        System.out.println("you attact back");
                        System.out.println("Gnashnator has " + Gnash.gethealth()+ " health left");
                        System.out.println("Dennis has " + DennisM.getHealth()+ " health left");
                        if(Gnash.gethealth() == 0){bashStreetSchool.gotoBashStreetSchool();}
                        else if(DennisM.getHealth() == 0){Dennis.loseGame();}
                        
                    }
                    break;
                case "run":
                    System.out.println("you run back to the shops avoiding the gnashinator");
                    toShops();
                    break;
                default:
                    System.out.println("unknown action");
                    toShops();
                    break;
            }
                break;

            default:
                System.out.println("unknown action");
                toShops() ;
                break;
        }
    }
}
