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
public class Sausages extends Item{

    /**
     * allows a user to pick up the item
     * @param theOwner target of the pickup
     */
    @Override
    public void pickup(Person theOwner) {
        System.out.println(theOwner.getName() + "picks up the sausages");
    }

    /**
     * allows the target to use the item
     * @param Target eats the item and restores health
     */
    @Override
    public void useitem(Person Target) {
        System.out.println("you eat the sauagages, you now have" + Target.getName());
        Target.increaseHealth();
    }
    
}
