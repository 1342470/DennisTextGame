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
public class treehouse implements location{

    public static int pies;
    private String location;

    /**
     * @param pies sets number of pies in location
     * @param location sets location (used to define which treehouse is which if more than one is created)
     */
    public treehouse(int pies, String location) {
        treehouse.pies = pies;
        this.location = location;
    }

    /**
     *getter for item
     * @return value of item
     */
    @Override
    public int getitem() {
        return pies;
    }
    
    /**
     * setter for item
     */
    @Override
    public void setitem() {
        this.pies = pies;
    }

    /**
     *getter for location
     * @return value of locaiton
     */
    @Override
    public String getLocation() {
        return location;
    }

    /**
     * explains current locaiton.
     */
    @Override
    public void ExplainLocation() {
        System.out.println("You are currently at the treehouse apon looking around the locaiton you find that thier are a number of pies scattered around proboly bought ready for throwing at pie face the local officer. From your treehouse you can see the local shops nearby as well as your front room");
    }


    /**
     * first story path allows the user to go to diffrent locations to progress the story.
     */
    public static void goToTreehouse(){
        Dennis DennisM = new Dennis(10,"Male",0,"Dennis the menis",5,100,"Dennis",0);
        DennisM.losecon();
        treehouse DennisTreehouse = new treehouse(10,"Dennis's backgarden");
        NewMain.getExplainInfo();
        System.out.println("Chapter 1 The adventure begins.");
        DennisTreehouse.ExplainLocation();
        Scanner input1 = new Scanner(System.in);     
        System.out.println("please type in what you would like to do next");
        
        String responce = input1.nextLine();
        
        switch (responce) {
            case "go to shops":
                Shops.toShops();
                break;
            case "make mischeif":
                System.out.println("their currently isn't anyone near by");
                goToTreehouse();
                break;
            case "go to living room": 
                livingRoom.goToLivingRoom();
                break;
            case "pick up pie":
                if(treehouse.pies !=0){
                    DennisM.increasePies();
                    DennisTreehouse.setitem();                
                    System.out.println("you grab at pie you now have " + DennisM.getPies());
                    goToTreehouse();
                }       else{
                    System.out.println("you must have eaten or taken all pies as you can't see any left");
                    goToTreehouse();
                }
                break;
            case "help":
                NewMain.GetHelp();
                goToTreehouse();
                break;
            default:
                System.out.println("unknown action");
                goToTreehouse();
                break;
        }

            
        }
    
}
