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
        System.out.println("Your are dennis the menis a trouble-making 10-year-old kid who loves making mischief and as your name implies, you considered a menace by everyone. However reasontly walters dad has become the mayor and its up to you to save the day before everyone dies of boredom");
    }
    
    public static void getExplainInfo(){
        explainInfo();
    }        

    private static String help(){
        System.out.println("HELP: if your not sure what you can do try the following 1. type go to and a name of a location this will take you to a diffrent location sometimes you will need to change the location in order to progress the story, in addtion you may need to make sure you read the disciptions as they may give you clues as to the locations are nearby 2. shoot sling if somebody is around you can type in who you want to shoot at 3. throw pie if you have a pie in your pocket you can throw a pie at nearby people. 4. make mischeif this allows you to make mischeif to a nearby person make sure you read the discriptions to learn who is currently nearby");
        return ("back to the game");
    }
  
    public static void GetHelp(){
        help();
    }
        
    public static void goToRoom(){
        System.out.println("your at your room their are various outfits from previous pranks, outside your window you see your treehouse as well as the stares going down to the LivingRoom");
        }
        
        
    public static void goToRoomGrounded(){
        System.out.println("you have been grounded and sent to your room luckly as window wasn't correctly locked and as easyly accessble but all the items that where once on the floor that you could of used have been taken by your mum as punishment");
        }
        

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
        
        
        private static void chapter2(){
        
        }
    }    
