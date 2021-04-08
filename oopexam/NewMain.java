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
        treehouse.goToTreehouse();
    }
    
    private static void explainInfo(){
        System.out.println("Your are dennis the menis a trouble-making 10-year-old kid who loves making mischief and as your name implies, you considered a menace by everyone. However reasontly walters dad has become the mayor and its up to you to save the day by finding him and getting him out of office try looking around town to find where he is before everyone dies of boredom");
    }
    
    /**
     * getter to access the private explain info methord
     */
    public static void getExplainInfo(){
        explainInfo();
    }        

    /**
     * 
     * @return outputs back to game once the all help tips have been read
     */
    private static String help(){
        System.out.println("HELP: if your not sure what you can do try the following 1. type go to and a name of a location this will take you to a diffrent location sometimes you will need to change the location in order to progress the story, in addtion you may need to make sure you read the disciptions as they may give you clues as to the locations are nearby 2. shoot sling if somebody is around you can type in who you want to shoot at 3. throw pie if you have a pie in your pocket you can throw a pie at nearby people. 4. make mischeif this allows you to make mischeif to a nearby person make sure you read the discriptions to learn who is currently nearby");
        return ("back to the game");
    }
  
    /**
     * getter to access the private help methord
     */
    public static void GetHelp(){
        help();
    }
        
    /**
     * story methord used by various classes to send the player to Dennis room
     */
    public static void goToRoom(){
        System.out.println("your at your room their are various outfits from previous pranks, outside your window you see your treehouse as well as the stares going down to the LivingRoom");
        Scanner input1 = new Scanner(System.in);     
        System.out.println("please type in what you would like to do next");
        String responce = input1.nextLine();
        
        if(responce.equals("go to your room")){
            System.out.println("hmm your already in your room on the account");
            goToRoom();
        }else if(responce.equals("go to treehouse")){
                treehouse.goToTreehouse();
            }else if(responce.equals("go to living room")){
                livingRoom.goToLivingRoom();
            }else{System.out.println("unknown action");
            goToRoom();}
        }
        
    /**
     * if a character move is used onto dennis it will uses the method to end the player to dennis room in the grounded state which has diffrent options than the normal room has
     */
    public static void goToRoomGrounded(){
        System.out.println("you have been grounded and sent to your room luckly as window or the door back to the front room wasn't correctly locked and as easyly accessble but all the items that where once on the floor that you could of used have been taken by your mum as punishment");
        Scanner input1 = new Scanner(System.in);     
        System.out.println("please type in what you would like to do next");
        String responce = input1.nextLine();
        
        switch (responce) {
            case "go to your room":
                System.out.println("hmm your alread in your room on the account of you being grounded by mum");
                goToRoomGrounded();
                break;
            case "go to treehouse":
                treehouse.goToTreehouse();
                break;
            case "go to living room":
                System.out.println("DENNIS I TOLD YOU THAT YOU WERE GROUNDED HOW DID YOU EVEN GET OUT.");
                System.out.println("You were sent back to your room this time your mum checks to see if there are any other way of getting out, she locks the window the way you goto out the first time with no way out you goto bed");
                Dennis.loseGame();
                break;
            default:
                System.out.println("unknown action");
                goToRoomGrounded();
                break;
        }
    }
        
    /**
     * final story methord
     */  
        public static void ending(){
            System.out.println("You have beaten Wilbur and saved the town congratuations");
            Scanner playAgain = new Scanner(System.in);
                System.out.println("would you like to play again?");
                String play = playAgain.nextLine();        
                if(play.equals("yes")){treehouse.goToTreehouse();}
                    else{System.out.println("okay thanks for playing");}
        }
    }    

