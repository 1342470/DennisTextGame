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
public class Gnasher extends Dog implements Animal {

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

    public Gnasher(int age, String gender, int strikes, String nickname, int strength, int health, String name, int pies,String pets) {
        this.age = age;
        this.gender = gender;
        this.strikes = strikes;
        this.nickname = nickname;
        this.strength = strength;
        this.health = health;
        this.name = name;
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

    


    
    
}