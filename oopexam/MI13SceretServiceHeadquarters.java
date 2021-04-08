/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopexam;

import static com.mycompany.oopexam.Shops.toShops;
import java.util.Scanner;

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
        System.out.println("You finally at the end the after finding the location of walter you see a long corrdoor will Wilbur wating for you.");
    }

    /**
     *story methord used by the main
     */
    public static void goToMI13(){
        Dennis DennisM = new Dennis(10,"Male",0,"Dennis the menis",5,100,"Dennis",0);
        DennisM.losecon();
        MI13SceretServiceHeadquarters Lare = new MI13SceretServiceHeadquarters(10,"MI13 Lare");
        Wilbur Final = new Wilbur(49,"Male",0,"Classic Walter",10,100,"Wilbur Brown");
        Lare.ExplainLocation();
        System.out.println("please type in what you would like to do next");
        Scanner input1 = new Scanner(System.in);    
        String responce = input1.nextLine();
        switch (responce) {
                case "attack Wilbur":
                    while(Final.getHealth() !=0){
                        DennisM.shootSling(Final);
                        System.out.println("you attack wilbur");
                        Final.detain(DennisM);
                        System.out.println("Wilbur will not take any of your pranks anymore and strikes back");
                        System.out.println("Wilbur has " + Final.getHealth()+ " health left");
                        System.out.println("Dennis has " + DennisM.getStrikes()+ " strikes");
                        if(Final.getHealth() == 0){NewMain.ending();}
                        else if(DennisM.getStrikes()== 0){Dennis.loseGame();}
                        
                    }
                    break;
                case "run":
                    System.out.println("if you run the town will be for ever doomed are you sure you want to run?");
                    Scanner run = new Scanner(System.in);
                    String answer = run.nextLine();
                            switch(answer){
                                case "yes":
                                    System.out.println("you run like to wind leaving to town to being taken over by the new mayor goodbye fun hello work for the rest of the towns days");
                                Dennis.loseGame();
                                break;
                                case"no":
                                    System.out.println("thats it dennis show him what you've got");
                                    goToMI13();
                    break;
                    default:
                        System.out.println("unknown action");
                        goToMI13();
                        break;
            }
            default:
                System.out.println("unknown action");
                goToMI13() ;
                break;
        }
        }

    
}
