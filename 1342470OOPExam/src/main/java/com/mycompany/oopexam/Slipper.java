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
public class Slipper extends Adult implements Person {

    private int age;
    private String gender;
    private int strikes;
    private String nickname;
    private int strength;
    private int health;
    private String name;

    public Slipper(int age, String gender, int strikes, String nickname, int strength, int health, String name) {
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

    public int getAge() {
        return age;
    }


    public String getGender() {
        return gender;
    }



    public String getNickname() {
        return nickname;
    }


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    public String  getName() {
        return name;
    }

    @Override
    public void increaseStrikes() {
        this.strikes++;
    }

    public int decreasehealth(){
        return --health;
}


    public void specialistMove(Person theTroubleMaker) {
        theTroubleMaker.caught();
        System.out.println("due to your actions have been arrested by Peter ");
    }

    @Override
    public void detain(Person theTroubleMaker) {
        theTroubleMaker.increaseStrikes();
        System.out.println("You have been caught " + theTroubleMaker.getName() + " now has " + theTroubleMaker.getStrikes()+ "strikes  ");
    }
    

    @Override
    public int gethealth() {
        return health;
    }


    @Override
    public void caught() {
        strikes+=10;
    }




    
}
