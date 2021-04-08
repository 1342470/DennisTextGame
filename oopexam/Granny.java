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
public class Granny extends Adult implements Person,life {

    private int age;
    private String gender;
    private int strikes;
    private String nickname;
    private int strength;
    private int health;
    private String name;
    private String pets;

    /**
     *
     * @param age defines the age 
     * @param gender defines the gender 
     * @param strikes defines the strikes allowed 
     * @param nickname defines the nickname 
     * @param strength defines the strength (used with the base strength of a attack which will add together to make the final base attack power)
     * @param health defines the health points 
     * @param name defines the name 
     */
    public Granny(int age, String gender, int strikes, String nickname, int strength, int health, String name,String pets) {
        this.age = age;
        this.gender = gender;
        this.strikes = strikes;
        this.nickname = nickname;
        this.strength = strength;
        this.health = health;
        this.name = name;
        this.pets = pets;
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
     *getter for strength
     * @return the value of strength
     */
    public int getStrength() {
        return strength;
    }

 

    /**
     * getter for name
     * @return will return the value of name
     */
    public String getName() {
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
     * will take one of the value of health
     * @return new value of health
     */
    public int decreasehealth(){
        return --health;
}

    /**
     * methord exculive to this person that allows the adult to use a move basted on their specialist 
     * @param theTroubleMaker target of the move
     */
    public void specialistMove(Person Gifter) {
        Gifter.increaseHealth();
        Gifter.increaseHealth();
        Gifter.increaseHealth();
        System.out.println(Gifter.getName() + " my sweetly I baked you a pie");
        System.out.println(Gifter.getName() + "enjoys the pie from granny and now has " + Gifter.getHealth());
    }

    @Override
    public void detain(Person theTroubleMaker) {
        theTroubleMaker.increaseStrikes();
        System.out.println("You have been caught " + theTroubleMaker.getName() + " now has " + theTroubleMaker.getStrikes()+ "strikes  ");
    }
    
    /**
     *getter for health
     * @return value of health
     */
    @Override
    public int getHealth() {
        return health;
    }

    /**
     * adds 10 the value of strike
     */
    @Override
    public void caught() {
        strikes+=10;
    }

    /**
     *
     * @return adds one the value of health and returns it.
     */
    @Override
    public int increaseHealth() {
        return this.health++;
    }

    /**
     * allows adult to eat and gain health back
     */
    @Override
    public void eat() {
        this.health+=10;
        System.out.println("Yumm" + this.getName() + "enjoys eating thier food and now has " + this.getHealth() + "heatlh");
    }

    /**
     * allows adult to move to diffrent locaiotn 
     */
    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     *setter for strikes
     * @param newstrikes new value of strikes
     */
    @Override
    public void setStrikes(int newstrikes) {
        newstrikes = this.strikes;
    }
    
}
