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


    public void peck(Person thebiten) {
        thebiten.decreasehealth();
        System.out.println( getName() + "uses its peak to peck at  " + thebiten.getName() + " when pecked they now have " + thebiten.gethealth()+ " health left" );
    }

    @Override
    public void AnimalAblility(Person theTarget) {
        System.out.println(getName() + "pecks at "+ theTarget.getName() + " they drop a bag of food " + getName() + "grabs the food and gives it to you as a reward to both share the stolen food");
        this.increaseHealth();
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