/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopexam;

/**
 *
 * @author kylej
 * sets what the catapult item can do 
 */
public class Catapult extends Item {

    /**
     *allows a person to pick up the item
     * @param theOwner the target of who will pick up the item
     */
    @Override
    public void pickup(Person theOwner) {
        System.out.println("you have picked up a Catapult you can now use this item by typing throw pie and the name of the person you would like to shot it at");
    }
    
    /**
     *allows a person to shoot the catapult at somebody
     * @param theEn target of shot
     */
    @Override
    public void useitem(Person theEn) {
        theEn.decreasehealth();
        theEn.decreasehealth();
        theEn.decreasehealth();
        theEn.decreasehealth();
        theEn.decreasehealth();        
        System.out.println( "you shoot at " + theEn.getName() + " the impact damgages them " + theEn.getHealth() + " health left" );
    }
}
