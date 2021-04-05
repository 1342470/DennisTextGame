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
public class Dennis extends child implements Person {

    private int age;
    private String gender;
    public int strikes;
    private String nickname;
    private int strength;
    private int health;
    private String name;
    private int pies;
    private static int numOfMis = 5;

    public Dennis(int age, String gender, int strikes, String nickname, int strength, int health, String name, int pies) {
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
     * losecon 
     * sets the losing conditional so that if dennis's number of strikes goes to 10 or above to then print out to the user that they have lost.
     */
    public void losecon(){
        while (this.strikes >= 10)if(this.strikes == 10 ){System.out.println("You lose");}
    }
    
    
    @Override
    public void pickItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public void lose(){
        System.out.println("you lose");
    }
    
    public void caught(){
        lose();
    }


    @Override
    public void stealItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void playPrank(Person theEn) {
        theEn.increaseStrikes();
        System.out.println( this.getName() +  "has played a prank on " + theEn.getName() + " the shock renders them with " + theEn.getStrikes() + "stamina left" );
    }


    public String  getName() {
        return name;
    }

    @Override
    public void increaseStrikes() {
        this.strikes++;
    }

    @Override
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
    /**
     * if the number of charters pies is greater than 0 it will add one stike to the targe and output the user the result of the hit
     * @param theEn target of thrown item
     * @return if the number of pies is less than 0 it will return the value of pies
     */
    public int throwpie(Person theEn){
        if(pies>0 ){
        theEn.increaseStrikes();
        System.out.println( "you throw a pie at " + theEn.getName() + " as they spend a long time cleaing themselfs they now have " + theEn.getStrikes() + "stamina left" );
        pies--;
        }
        else
            System.out.println("You can't throw a pie if you don't have any silly");
        return pies;
    }
    
    
}