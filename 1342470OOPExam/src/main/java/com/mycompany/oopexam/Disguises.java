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
public class Disguises extends Item {
    
    /**
     *allows player to pick up item
     * @param theOwner is who ever will pick up the item
     */
    @Override
    public void pickup(Person theOwner) {
        System.out.println("you picked up a item you can now use a Disguies");
        
    }

    /**
     * allows at a play to use the item
     * @param theOwner the user of the item
     */
    @Override
    public void useitem(Person theOwner) {
        System.out.println("you put on the Disguies as your hidden nobody knows who are are and so the number of strikes to your name can't be tracked");
        theOwner.setStrikes(0) ;
    }
    
}
