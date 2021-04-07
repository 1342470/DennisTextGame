/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopexam;

import static com.mycompany.oopexam.treehouse.goToTreehouse;
import java.util.Scanner;

/**
 *
 * @author kylej
 */
public class livingRoom implements location{
    private final int Catapults;
    private String location;

    /**
     *
     * @param Catapults sets amount of catapults in locaiotn 
     * @param location sets the location of room( used mostly if more than one room is created.
     */
    public livingRoom(int Catapults, String location) {
        this.Catapults = Catapults;
        this.location = location;
    }

    /**
     * getter for item
     * @return value of item
     */
    @Override
    public int getitem() {
        return Catapults;
    }

    /**
     *setter for item
     */
    @Override
    public void setitem() {
        
    }
    
    /**
     *allow user to use catapult
     * @param theEn target of soot
     */
    public void useCatapult(Person theEn){
        theEn.decreasehealth();
        System.out.println("you shoot the slingshot hitting " + theEn.getName() + " the impact leaves them with " + theEn.getHealth()+ "enery left ");
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
     * output current locaiton
     */
    @Override
    public void ExplainLocation() {
        System.out.println("your are in the living room");
    }

    /**
     * story methord used by main
     */
    public static void goToLivingRoom(){
        Sandra SandraM = new Sandra(38,"Female",0,"Dennis's Mum",5,100,"Sandra Menace");
        DennisSnr DennisS = new DennisSnr(40,"Male",0,"Dennis's Dad",25,100,"Dennis Menace Sr");
        Dennis DennisM = new Dennis(10,"Male",0,"Dennis the Menace",15,100,"Dennis",0);
        Bea BeaM = new Bea(1,"Female",0,"Bea",1,100,"Beatrice Menace",0,"No Pets");
        DennisM.losecon();
        livingRoom FrontRoom = new livingRoom(10,"the Dennis's living Room");
        System.out.println("Your are now in your lving room out the the back window you see your tree house as well as the back window in the front window you see the streets that follow to the your local shops. All family members are currently at home you could talk to them but they do look like their currently watching a programme on the tv. In the back of the room you see a pile of catapults. ");
        Scanner input1 = new Scanner(System.in);     
        System.out.println("please type in what you would like to do next");
        String responce = input1.nextLine();
        
        switch (responce) {
            case "go to your room":
                NewMain.goToRoom();
                break;
            case "go to treehouse":
                treehouse.goToTreehouse();
                break;
            case "go to shops":
                Shops.toShops();
                break;
            case "talk to mum":
                System.out.println("Hey dennis iv'e been meaning to ask you about your homework, a little birdy told me you've got a pile of work to be doing have you done it yet");
                Scanner input2 = new Scanner(System.in);
                System.out.println("Did you do your homework type in your responce");
                String reHomework = input2.nextLine();
                if(reHomework.equals("yes")){
                    System.out.println("oh right that's good I'll let your teacher know then");
                    goToLivingRoom();}
                else{System.out.println("hmm I thought so");
                SandraM.specialistMove(DennisM);
                }
                break;
            case "talk to dad":
                System.out.println("not now dennis I'm watching tv");
                goToLivingRoom();
                break;
            case "help":
                NewMain.GetHelp();
                treehouse.goToTreehouse();
                break;
            case "talk to bea":
                System.out.println("bea says; Walter Walter Shop Shop. You deduce that bea is trying to tell you that she saw walter walking towards to shops you should probably investage as he will know where Wilbur is");
                goToLivingRoom();
                break;
            default:
                System.out.println("Unknown action");
                goToLivingRoom();
                break;
        }
    }

    
}
