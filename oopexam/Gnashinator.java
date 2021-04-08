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
public class Gnashinator extends Dog implements Animal,life,Robot {

    private int age;
    private String gender;
    private String nickname;
    private int strength;
    private int health;
    private String name;
    private static int numOfMis = 5;
    private String Owner;
    private String serialNum = "299asj34";

    public Gnashinator(int age, String gender,String nickname, int strength, int health, String name) {
        this.age = age;
        this.gender = gender;
        this.nickname = nickname;
        this.strength = strength;
        this.health = health;
        this.name = name;
        this.Owner = "????";
    }

    /**
     * allows dog to bite a person
     * @param thebiten target of bite
     */
    @Override
    public void bite(Person thebiten) {
        thebiten.decreasehealth();
        System.out.println( getName() + "bites " + thebiten.getName() + " when biten they now have " + thebiten.getHealth()+ " health left" );
    }

    /**
     *attack only this class is able to use 
     * @param theTarget target of attaack
     */
    @Override
    public void AnimalAblility(Person theTarget) {
        theTarget.decreasehealth();
        theTarget.decreasehealth();
        theTarget.decreasehealth();
        theTarget.decreasehealth();
        theTarget.decreasehealth();        
        System.out.println( getName() + " uses his mega bite at " + theTarget.getName() +   " the shock from the mega bark knocks him, now has has " + theTarget.getHealth() +  " strikes");
    }

    /**
     * allow the animal to make a noise depending on the animal type is depend on what is output
     */
    @Override
    public void makeNoise() {
        System.out.println(getName() + " in a robotic voice says woof woof");
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
     *allows gnashinator to get and gain health
     */
    @Override
    public void eat() {
        this.health+=10;
        System.out.println("Yumm" + this.getName() + "enjoys eating thier food and now has " + this.getHealth() + "heatlh");
    }

    /**
     *allows movement
     */
    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        /**
     *attack only robots are able to use 
     * @param theTarget target of attaack
     */
    @Override
    public void Robotfunction(Person theTarget) {
        if(health <100){System.out.println(getName() + " uses is system diagnosis and repears its self");
        this.increaseHealth();
        this.increaseHealth();
        this.increaseHealth();
        this.increaseHealth();
        this.increaseHealth();}
    }

    


    
    
}