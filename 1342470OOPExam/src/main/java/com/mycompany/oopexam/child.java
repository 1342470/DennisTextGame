/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopexam;

/**
 *
 * @author kylej
 * sets methods that only the child can use
 */
abstract class child {
    
    public abstract void shootSling(Person theEn);

    public abstract void playPrank(Person theEn);
    
    public abstract void makeMischief(Person theEn);
    
    public abstract void stealItem();
    
    public abstract void increasePies();
    
    public abstract void decreasePies();
    
    public abstract int getPies();
}
