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
public class Dennis extends child implements Person,life {

    private int age;
    private String gender;
    private static int strikes;
    private String nickname;
    private int strength;
    private static int health;
    private final String name;
    private int pies;
    private static final int numOfMis = 5;
    private String pets;

    /**
     * @param age defines the age 
     * @param gender defines the gender 
     * @param strikes defines the strikes allowed 
     * @param nickname defines the nickname 
     * @param strength defines the strength  (used with the base strength of a attack which will add together to make the final base attack power)
     * @param health defines the health points 
     * @param name defines the name 
     * @param pies defines how many pies you starts with ( if pie value is zero is unable to throw a pie)
     * @param pets defines if this person has any pets
     */
    public Dennis(int age, String gender, int strikes, String nickname, int strength, int health, String name, int pies) {
        this.age = age;
        this.gender = gender;
        Dennis.strikes = strikes;
        this.nickname = nickname;
        this.strength = strength;
        Dennis.health = health;
        this.name = name;
        this.pets = "Gnasher" + "Joe" + "Rasher";
    }

    /**
     * getter for strikes
     * @return will reutrn the value of bea's strikes
     */
    @Override
    public int getStrikes() {
        return strikes;
    }

    /**
     * getter for pies
     * @return will return the value of bea's pies
     */
    public int getPies(){
        return pies;
    }
    
     /**
     * getter for age
     * @return will return the value of pies
     */
    public int getAge() {
        return age;
    }

    
    /**
     * getter for gender
     * @return returns the value of gender 
     */
    public String getGender() {
        return gender;
    }


    /**
     *getter for nickname
     * @return returns the value of nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     *
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
    *getter for strength
    * @return the value of strength
    */
    public int getStrength() {
        return strength;
    }



    /**
     * losecon 
     * sets the losing conditional so that if dennis's number of strikes goes to 10 or above to then print out to the user that they have lost.
     */
    public void losecon(){
        while (Dennis.strikes >= 10)if(Dennis.strikes == 10 ){loseGame();}
    }
    
    /**
     * allows play to pick up item
     * @param theItem
     */
    public void pickItem(Item theItem) {
        theItem.pickup(this);
    }

    /**
     * 
     * @param theEn theEn is the target that will be shot by the sling shot
     * 
     * after the target has been shot a message will display to the user telling them who they shot, who shot how and what health the target is now on.
     */
    @Override
    public void shootSling(Person theEn) {
        theEn.decreasehealth();
        System.out.println("you shoot the slingshot hitting " + theEn.getName() + " the impact leaves them with " + theEn.getHealth()+ "enery left ");
    }
    
    /**
     * allows the player to shoot at robots
     * @param theEn target of shot.
     */
    public void shootSling(Robot theEn) {
        theEn.decreasehealth();
        theEn.decreasehealth();
        theEn.decreasehealth();
        theEn.decreasehealth();
        theEn.decreasehealth();
        System.out.println("you shoot the slingshot hitting " + theEn.getName() + " the impact leaves them with " + theEn.getHealth()+ "enery left ");
    }

    /**
     * sets used with losecon so when the strikes is 10 it will tell the user they have lost and do they want to play again.
     */
    public static void loseGame(){
        System.out.println("you lose");
            Scanner playAgain = new Scanner(System.in);
                System.out.println("would you like to play again?");
                String play = playAgain.nextLine();        
                if(play.equals("yes")){treehouse.goToTreehouse();}
                    else{System.out.println("okay thanks for playing");}
    }
    
    /**
     * used in congjustion with the lose methord as well as a methord from a adult for example if a police officer as to caputre the player it would run their methoreds as well as this methord to tell the user that the game is over.
     */
    @Override
    public void caught(){
        loseGame();
    }

    /**
     * allow player to steal Items
     */
    @Override
    public void stealItem() {
     
    }

    /**
     * works like a attack system in an RPG 
     * @param theEn takes the target that the player will being attacking.
     * once prank the output of the result of the prank will be displayed
     */
    public void playPrank(Person theEn) {
        theEn.increaseStrikes();
        System.out.println( this.getName() +  "has played a prank on " + theEn.getName() + " the shock renders them with " + theEn.getStrikes() + "stamina left" );
    }

    /**
     *getter for name
     * @return value of name
     */
    public String  getName() {
        return name;
    }

    /**
     * increases the strikes for the player. this is a slightly diffrent way of the health as health is only reduced if the player is attacked while strikes are only given when the player is caught by an adult or fails a prank.
     */
    @Override
    public void increaseStrikes() {
        this.strikes++;
    }

    /**
     ** a stronger form to play a prank 5 strikes are added however due to it being more powerful if the player number of mis is less than 0 it will not allow the user to run the methord.
     * @param theEn target of prank
     */
    @Override
    public void makeMischief(Person theEn) {
        if(numOfMis< 0){
            theEn.increaseStrikes();
            theEn.increaseStrikes();
            theEn.increaseStrikes();
            theEn.increaseStrikes();
            theEn.increaseStrikes();
        System.out.println( this.getName() +  "has played a prank on " + theEn.getName() + " the shock renders them with " + theEn.getStrikes() + "stamina left" );
        } else{System.out.println("you have ran out of idea's for mischief");}
    }

    /**
     * takes one of the value of health
     * @return value of health
     */
    @Override
    public int decreasehealth() {
        health--;
        return health;
    }

    /**
     * getter for health
     * @return health
     */
    @Override
    public int getHealth() {
        return health;
    }

    /**
     *shows number of strikes the player currently has
     */
    public void showSrikes() {
        System.out.println(strikes); 
    
    }  
    
    /**
     * if the number of charters pies is greater than 0 it will add one stike to the targe and output the user the result of the hit
     * @param theEn target of thrown item
     * @return if the number of pies is less than 0 it will return the value of pies
     */
    public int throwpie(Person theEn){
        if(pies>0 ){
        theEn.increaseStrikes();
        System.out.println( "you throw a pie at " + theEn.getName() + " as they spend a long time cleaing themselfs they now have " + theEn.getStrikes() + "stamina left" );
        pies--;
        }
        else
            System.out.println("You can't throw a pie if you don't have any silly");
        return pies;
    }

    /**
     *
     * @return increases health and returns the value
     */
    @Override
    public int increaseHealth() {
        return this.health++;
    }

    /**
     * allow the player to eat to gain health
     */
    @Override
    public void eat() {
        this.health+=10;
        System.out.println("Yumm" + this.getName() + "enjoys eating thier food and now has " + this.getHealth() + "heatlh");
    }

    /**
     * Allows the player to move locations
     */
    @Override
    public void move() {
        
    }

    /**
     * adds one to value of pies
     */
    @Override
    public void increasePies() {
        pies++;
    }

    /**
     * takes one from the value of pies
     */
    @Override
    public void decreasePies() {
        pies--;
    }

    /**
     * sets new value of strikes
     * @param newstrikes 
     */
    @Override
    public void setStrikes(int newstrikes) {
        newstrikes = this.strikes;
    }
    
    
}