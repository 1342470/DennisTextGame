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
public class Gnasher extends Dog implements Animal,life {

    private int age;
    private String gender;
    private String nickname;
    private int strength;
    private int health;
    private String name;
    private static int numOfMis = 5;
    private String Owner;

    public Gnasher(int age, String gender,String nickname, int strength, int health, String name) {
        this.age = age;
        this.gender = gender;
        this.nickname = nickname;
        this.strength = strength;
        this.health = health;
        this.name = name;
        this.Owner = "Dennis";
    }

    @Override
    public void bite(Person thebiten) {
        thebiten.increaseStrikes();
        System.out.println( getName() + "bites " + thebiten.getName() + " when biten they now have " + thebiten.gethealth()+ " health left" );
    }

    @Override
    public void AnimalAblility(Person theTarget) {
        theTarget.increaseStrikes();
        System.out.println( getName() + " uses his mega bark at " + theTarget.getName() +   " the shock from the mega bark knocks him, now has has " + theTarget.getStrikes() +  " strikes");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + "says woof woof");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void increaseHealth() {
        health++;
    }

    @Override
    public int getHealth() {
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

    @Override
    public void eat() {
        this.health+=10;
        System.out.println("Yumm" + this.getName() + "enjoys eating thier food and now has " + this.getHealth() + "heatlh");
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    


    
    
}