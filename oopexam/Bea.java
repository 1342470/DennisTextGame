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
public class Bea extends child implements Person,life {
    

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

    /**
     * @param age defines the age of bea
     * @param gender defines the gender of bea
     * @param strikes defines the strikes allowed for bea
     * @param nickname defines the nickname of bea
     * @param strength defines the strength of bea (used with the base strength of a attack which will add together to make the final base attack power)
     * @param health defines the health points of bea
     * @param name defines the name of bea
     * @param pies defines how many pies bea starts with ( if pie value is zero bea is unable to throw a pie)
     * @param pets defines if this person has any pets
     */
    public Bea(int age, String gender, int strikes, String nickname, int strength, int health, String name, int pies,String pets) {
        this.age = age;
        this.gender = gender;
        this.strikes = strikes;
        this.nickname = nickname;
        this.strength = strength;
        this.health = health;
        this.name = name;
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
     * getter for pies
     * @return will return the value of bea's pies
     */
    public int getPies(){
        return pies;
    }
    
    /**
     * will add one to the pie value
     * @return will return the new value of pies
     */
    public int addPie(){
        pies++;
        return pies;
    }
    
    /**
     * getter for age
     * @return will return the value of pies
     */
    public int getAge() {
        return age;
    }

    /**
     * setter for age 
     * @param age allows to to able to change the age of bea (used if the story was to progress over mulitable years)
     */
    public void setAge(int age) {
        this.age = age;
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
     * 
     * @param theEn theEn is the target that will be shot by the sling shot
     * 
     * after the target has been shot a message will display to the user telling them who they shot, who shot how and what health the target is now on.
     */
    @Override
    public void shootSling(Person theEn) {
        theEn.decreasehealth();
        System.out.println("you shoot the slingshot hitting " + theEn.getName() + " the impact leaves them with " + theEn.getHealth()+ "enery left ");
    }

    /**
     * will allow the ability to take items from shops without paying or take other items from other non playable people.
     */
    @Override
    public void stealItem() {
    
    }

    /**
     *a form of attack for only people who have the child interface- this form of attack uses the strike system and will not take any health off theEn
     * @param theEn the target of attack
     * once attacked it will print the result of the attack
     */
    public void playPrank(Person theEn) {
        theEn.increaseStrikes();
        System.out.println( this.getName() +  "has played a prank on " + theEn.getName() + " the shock renders them with " + theEn.getStrikes() + "stamina left" );
    }

    /**
     * getter for name
     * @return will return the value of name
     */
    public String  getName() {
        return name;
    }

    /**
     *
     */
    @Override
    /**
     * increases the strikes for the player. this is a slightly diffrent way of the health as health is only reduced if the player is attacked while strikes are only given when the player is caught by an adult or fails a prank.
     */
    public void increaseStrikes() {
        this.strikes++;
    }

    /**
     * a stronger form to play a prank 5 strikes are added however due to it being more powerfull if the player number of mis is less than 0 it will not allow the user to run the methord.
     * @param theEn target of attack.
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


    /**
     * will take one of the value of health
     * @return new value of health
     */
    @Override
    public int decreasehealth() {
        health--;
        return health;
    }

    /**
     * getter for health
     * @return returns value of health
     */
    @Override
    public int getHealth() {
        return health;
    }

    /**
     *
     * @return adds one the value of health
     */
    @Override
    public int increaseHealth() {
        return this.health++;
    }

    /**
     *will set the strikes to 10 and send the person to their room.
     */
    @Override
    public void caught() {
        this.strikes =10;
        System.out.println(this.getName() + " has been caught and has been sent to thier room as punisment ");
        NewMain.goToRoomGrounded();
    }

    /**
     *allows the player to eat to gain back some health
     */
    @Override
    public void eat() {
        this.health+=10;
        System.out.println("Yumm" + this.getName() + "enjoys eating thier food and now has " + this.getHealth() + "heatlh");
    }

    /**
     * used to move people around to diffrent locations
     */
    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *setter for strikes
     * @param newstrikes is the new value of the charters strike value
     */
    @Override
    public void setStrikes(int newstrikes) {
        newstrikes = this.strikes;
       
    }
    
    /**
     * adds one to value of pie
     */
    @Override
    public void increasePies() {
        pies++;
    }

    /**
     * takes one to value of pie
     */
    @Override
    public void decreasePies() {
        pies--;
    }
    
    
}