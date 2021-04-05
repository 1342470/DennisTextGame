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
        theEater.increasehelath();
        System.out.println("yummy" + theEater.getName()+ " eats the apple restoring 1 point of health");
    }

    @Override
    public String getLocation() {
        return location;
    }

 

    @Override
    public void ExplainLocation() {
        System.out.println("You are currently at the shops you see the famila slight of Pie-Face and a sign that states that they're currently giving out apples for free in a atempted to get more people to eat healthly.");
    }


    
    /**
     * method that is used by the main to progress to story
     */
    public static void toShops(){
        Dennis DennisM = new Dennis(10,"Male",0,"Dennis the menis",5,100,"Dennis",0);
        DennisM.losecon();
        Slipper SlipperS = new Slipper(34,"Male",1,"Slipper",5,100,"Sgt. Slipper");
        Shops localShops = new Shops(10,"local shops near Dennis house");
        localShops.ExplainLocation();
        System.out.println("once at the shops see that next to the saugage shop their the one of the worse villans to plage the land, the one and only Pie face across from Pie face is the walkway to the park as as as a shortcut made by yours truely to get bash street School.");
         Scanner input1 = new Scanner(System.in);
        System.out.println("please type in what you would like to do next");
        String responce = input1.nextLine();
        if(responce.equals("shoot sling at pie face")){
            DennisM.shootSling(SlipperS);
            SlipperS.specialistMove(DennisM);
            Scanner playAgain = new Scanner(System.in);
            System.out.println("Would you like to play again?");
            String playAgainInput = input1.nextLine();
                if(playAgainInput.equals("yes")){
                treehouse.goToTreehouse();
                }else {System.out.println("Thank you for playing goodbye");}
                    }else if(responce.equals("go to the park")){
                        System.out.println("you deside you to the park");
                        park.gotopark();
                    }else if(responce == "go to the Bash Street School"){
                        System.out.println("for some strange reason you diside to go to school, well I guess you could get some tips on where pie face is");
                        bashStreetSchool.gotoBashStreetSchool();    
                    }else{
                System.out.println("unknown action");
                toShops();
                    
                    };
            
        }
    
}
