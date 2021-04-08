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
public class Rasha extends Pig implements Animal,life {

    private int age;
    private String gender;
    public int strikes;
    private String nickname;
    private int strength;
    private int health;
    private String name;
    private String owner;

    /**
     * @param age defines the age 
     * @param gender defines the gender 
     * @param strikes defines the strikes allowed 
     * @param nickname defines the nickname 
     * @param strength defines the strength (used with the base strength of a attack which will add together to make the final base attack power)
     * @param health defines the health points 
     * @param name defines the name 
     * @param Owner defines the owner
    */
    
    public Rasha(int age, String gender,String nickname, int strength, int health, String name) {
        this.age = age;
        this.gender = gender;
        this.strikes = strikes;
        this.nickname = nickname;
        this.strength = strength;
        this.health = health;
        this.name = name;
        this.owner = "Dennis";
    }

    /**
    *attack only this class is able to use 
    * @param theTarget target of who will get the health bonus
    */
    @Override
    public void AnimalAblility(Person theTarget) {
        System.out.println(getName() + " finds a truffle " + getName() + " eats the truffle and gains health and shares it with you");
        theTarget.increaseHealth();    
        theTarget.increaseHealth();
        this.increaseHealth();
        this.increaseHealth();
        
    }

    /**
    * allow the animal to make a noise depending on the animal type is depend on what is output
    */
    @Override
    public void makeNoise() {
        System.out.println(getName() + "sniffles its nose");
    }
    /**
    * getter for name
    * @return value of name
    */
    @Override
    public String getName() {
        return name;
    }

    /**
    * increases the value of health
    */
    @Override
    public void increaseHealth() {
        health++;
    }

    /**
     * getter for health
     * @return value of health
     */
    @Override
    public int getHealth() {
        return health;
    }


    /**
     * decreases the value of health
     * @return new value of health
     */
    @Override
    public int decreasehealth() {
        health--;
        return health;
    }

    /**
     * getter for health
     * @return value of health
     */
    @Override
    public int gethealth() {
        return health;
    }

    /**
     *allows aniaml to get and gain health
     */
    @Override
    public void eat() {
        this.health+=10;
        System.out.println("Yumm" + this.getName() + "enjoys eating thier food and now has " + this.getHealth() + "heatlh");
    }

    /**
     *allows animal to move
     */
    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}