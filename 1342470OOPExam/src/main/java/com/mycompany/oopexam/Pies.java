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
public class Pies extends Item {

    /**
     *allows the user to pick up item
     * @param theOwner
     */
    @Override
    public void pickup(Person theOwner) {
        System.out.println("you have picked up a pie you can now use this item by typing throw pie and the name of the person you would like to throw it at");
        
    }
    
    /**
     *allows player to use item 
     * @param theEn target of trown pie
     */
    @Override
    public void useitem(Person theEn) {
        theEn.increaseStrikes();
        System.out.println( "you throw a pie at " + theEn.getName() + " as they spend a long time cleaing themselfs they now have " + theEn.getStrikes() + "stamina left" );
    }
}


    

