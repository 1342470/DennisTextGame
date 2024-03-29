/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopexam;

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

    

    @Override
    public int getStrikes() {
        return strikes;
    }

    public int getPies(){
        return pies;
    }
    
    public int addPie(){
        pies++;
        return pies;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStrikes(int numst) {
        Dennis.strikes = numst;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int setHealth(int health) {
        this.health = health;
        return health;
    }
    
    

    /**
     * losecon 
     * sets the losing conditional so that if dennis's number of strikes goes to 10 or above to then print out to the user that they have lost.
     */
    public void losecon(){
        while (Dennis.strikes >= 10)if(Dennis.strikes == 10 ){System.out.println("You lose");}
    }
    
    

    public void pickItem(Item theItem) {
        System.out.println("you have picked up the item" );
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
        System.out.println("you shoot the slingshot hitting " + theEn.getName() + " the impact leaves them with " + theEn.gethealth()+ "enery left ");
    }

    public static void loseGame(){
        System.out.println("you lose");
    }
    
    @Override
    /**
     * used in congjustion with the lose methord as well as a methord from a adult for example if a police officer as to caputre the player it would run their methoreds as well as this methord to tell the user that the game is over.
     */
    public void caught(){
        loseGame();
    }


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


    public String  getName() {
        return name;
    }

    @Override
    /**
     * increases the strikes for the player. this is a slightly diffrent way of the health as health is only reduced if the player is attacked while strikes are only given when the player is caught by an adult or fails a prank.
     */
    public void increaseStrikes() {
        this.strikes++;
    }

    @Override
    /**
     * a stronger form to play a prank 5 strikes are added however due to it being more powerful if the player number of mis is less than 0 it will not allow the user to run the methord.
     */
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

    @Override
    public int decreasehealth() {
        health--;
        return health;
    }

    @Override
    public int gethealth() {
        return health;
    }

    
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

    @Override
    public int increasehelath() {
        return this.health++;
    }

    @Override
    public void eat() {
        this.health+=10;
        System.out.println("Yumm" + this.getName() + "enjoys eating thier food and now has " + this.gethealth() + "heatlh");
    }

    @Override
    public void move() {
        
    }
    
    
}