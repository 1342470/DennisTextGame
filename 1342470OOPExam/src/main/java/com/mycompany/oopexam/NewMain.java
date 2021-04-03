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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        chapter1();
    }
    
    private static void explainInfo(){
        System.out.println("Your are dennis the menis a trouble-making 10-year-old kid who loves making mischief and as your name implies, you considered a menace by everyone. However reasontly walters dad has become the mayor and its up to you to save the day before everyone dies of boredom");
    }
    

    
    private static void chapter1(){
        Dennis DennisM = new Dennis(10,"Male",0,"Dennis the menis",5,100,"Dennis",0,"Gnasher");
        DennisM.losecon();
        treehouse DennisTreehouse = new treehouse(10,"Dennis's backgarden");
        explainInfo();
        System.out.println("Chapter 1 The adventure begins.");
        DennisTreehouse.ExplainLocation();
        Scanner input1 = new Scanner(System.in);     
        System.out.println("please type in what you would like to do next");
        
        String responce = input1.nextLine();
        
        if(responce.equals("go to shops")){
            goToShops();
        }else if (responce.equals("make mischeif")){
            System.out.println("their currently isn't anyone near by");
            chapter1();
        }
            else if(responce.equals("pick up pie")){
                if(DennisTreehouse.pies !=0){ 
                    DennisM.addPie();
                    DennisTreehouse.setitem();                
                    System.out.println("you grab at pie you now have " + DennisM.getPies());
                    chapter1();
                }       else{
                            System.out.println("you must have eaten or taken all pies as you can't see any left");
                            chapter1();
                        }                                    
                    }
            else if(responce.equals("help")){
                System.out.println("HELP: if your not sure what you can do try the following 1. change location this will take you to a diffrent location sometimes you will need to change the location in order to progress the story 2. shoot sling if somebody is around you can type in who you want to shoot at 3. throw pie if you have a pie in your pocket you can throw a pie at nearby people.");
                chapter1();
            }else{
                System.out.println("unknown action");
                chapter1();
                    
                    };
            
        }
            


    
    private static void goToShops(){
        Dennis DennisM = new Dennis(10,"Male",0,"Dennis the menis",5,100,"Dennis",0,"Gnasher");
        DennisM.losecon();
        Slipper SlipperS = new Slipper(34,"Male",1,"peter pie-face",5,100,"Peter shepherd");
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
                chapter1();
                }else {System.out.println("Thank you for playing goodbye");}
                    }else if(responce.equals("go to the park")){
                        System.out.println("you deside you to the park");
                        gotopark();
                    }else if(responce == "go to the Bash Street School"){
                        System.out.println("for some strange reason you diside to go to school, well I guess you could get some tips on where pie face is");
                        gotoBashStreetSchool();    
                    }else{
                System.out.println("unknown action");
                goToShops();
                    
                    };
            
        }
    
        private static void gotopark(){
        Dennis DennisM = new Dennis(10,"Male",0,"Dennis the menis",5,100,"Dennis",0,"Gnasher");
        DennisM.losecon();

        
        }
        
        private static void gotoBashStreetSchool(){
        }
        
        
        
        private static void chapter2(){
        
        }
    }    
