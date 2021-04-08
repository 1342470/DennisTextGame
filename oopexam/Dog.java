/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopexam;

/**
 *
 * @author kylej
 * sets what a dog can do
 */
abstract class Dog {
    
    /**
     * allows the dog to attack a person to deal damage
     * @param thebiten target of bite
     */
    public abstract void bite(Person thebiten);   
}
