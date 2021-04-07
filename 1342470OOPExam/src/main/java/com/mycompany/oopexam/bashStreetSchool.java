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
public class bashStreetSchool implements location{
    private final int Disguises;
    private String location;

    /**
     *
     * @param Disguises sets how many Disguies are
     * @param location sets location of school if more than one is created 
     */
    public bashStreetSchool(int Disguises, String location) {
        this.Disguises = Disguises;
        this.location = location;
    }

    /**
     *getter for item
     * @return value of item
     */
    @Override
    public int getitem() {
        return Disguises;
    }

    /**
     *setter of item
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
     * lets the user know the discription of the sutsounding area
     */
    @Override
    public void ExplainLocation() {
        System.out.println("Your now in school Ms carol is outside the classroom waiting for the students before class starts as well as .");
    }


    /**
     * story method used by main 
     */
    public static void gotoBashStreetSchool(){
        Dennis DennisM = new Dennis(10,"Male",0,"Dennis the menis",5,100,"Dennis",0);
        DennisM.losecon();
        Carol Carols = new Carol(34,"Female",0,"teach",5,100,"Carol");
        Gnashinator Gnash = new Gnashinator(0,"??","???",25,100,"Gnashinator");
        bashStreetSchool school = new bashStreetSchool(10,"the local school the bash Street School");
        school.ExplainLocation();
        Scanner input1 = new Scanner(System.in);
        System.out.println("please type in what you would like to do next");
        String responce = input1.nextLine();
        switch (responce) {
            case "shoot sling at carol":
                DennisM.shootSling(Carols);
                Carols.specialistMove(DennisM);
                break;
            case "go to the park":
                System.out.println("you deside you to the park");
                park.gotopark();
                break;
            case "talk to carol":
                System.out.println("carol says dennis is time for class come on in ");
                System.out.println("will you go to class");
                String responce2 = input1.nextLine();
                if(responce2.equals("yes")){System.out.println("Are you feeling alright? as you head into class for some reason you see that wilbour isn't in class he must be somewhere else you need to find him before its to late");}
                else{System.out.println("Hmm well dentention it is then");
                detentionRoom();
                }
                break;
            case "help":
                NewMain.GetHelp();
                gotoBashStreetSchool();
                break;
            default:
                gotoBashStreetSchool();
                break;
        }
        }
    
   /**
    * spesical story methord that is only accessed in serten story options or by a teachers spesicist move
    */
    public static void detentionRoom(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("As punisment I must write; I have thought about my actions and I wont do it again. the teacher states I must right this out five times if even one letter is wrong that you will be in detention for the rest of your live so be care ");
        String responce = input1.nextLine();
            if(responce.equals("I have thought about my actions and I wont do it again. I have thought about my actions and I wont do it again. I have thought about my actions and I wont do it again. I have thought about my actions and I wont do it again. I have thought about my actions and I wont do it again.")){
            bashStreetSchool.gotoBashStreetSchool();}
                else{System.out.println("As you didn't correctly apologised you have been put into detention for the rest of your life.");
                Dennis.loseGame();
                }
        }
    
}
