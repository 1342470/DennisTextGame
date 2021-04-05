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
public class Walter extends child implements Person,life {

    private int age;
    private String gender;
    public int strikes;
    private String nickname;
    private int strength;
    private int health;
    private String name;
    private int pies;
    private static int numOfMis = 5;
    private String pets;

    public Walter(int age, String gender, int strikes, String nickname, int strength, int health, String name, int pies,String pets) {
        this.age = age;
        this.gender = gender;
        this.strikes = strikes;
        this.nickname = nickname;
        this.strength = strength;
        this.health = health;
        this.name = name;
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

    

    @Override
    public void stealItem() {
     
    }

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
     * a stronger form to play a prank 5 strikes are added however due to it being more powerfull if the player number of mis is less than 0 it will not allow the user to run the methord.
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

    public int health(){
        return health;
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

    public int showSrikes() {
        System.out.println(strikes); 
        return strikes;
    }  

    @Override
    public int increasehelath() {
        return this.health++;
    }

    @Override
    public void caught() {
        this.strikes =10;
        System.out.println(this.getName() +" has been caught and has been sent to thier room as punisment ");
    }

    @Override
    public void eat() {
        this.health+=10;
        System.out.println("Yumm" + this.getName() + "enjoys eating thier food and now has " + this.gethealth() + "heatlh");
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}