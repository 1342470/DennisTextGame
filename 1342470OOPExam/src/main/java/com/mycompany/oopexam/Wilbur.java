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
public class Wilbur extends Adult implements Person,life {

    private int age;
    private String gender;
    private int strikes;
    private String nickname;
    private int strength;
    private int health;
    private String name;

    public Wilbur(int age, String gender, int strikes, String nickname, int strength, int health, String name) {
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
		theTroubleMaker.increaseStrikes();
        System.out.println(theTroubleMaker.getName() + " your grounded goto your room");
		NewMain.goToRoomGrounded();
        
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




    
}
