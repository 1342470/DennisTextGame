/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopexam;

/**
 *
 * @author kylej
 *interface of the animal all animals must conain these methords as well as the sub classes to the type of animal it is.
 */
public interface Animal {
    
public void AnimalAblility(Person theTarget);

/**
 * depending on the animal diffrent noises will be printed to the user e.g dog barking or bird tweeting.
 */
public void makeNoise();

/**
 * getter for the animal name
 * @return will return the value of the animals name
 */
public String getName();

/**
 * will add one to the current value of health
 */
public void increaseHealth();

/**
 * getter for the animals health
 * @return will return the value of the animals health
 */
public int getHealth();

/**
 * will take one of the value of the animals health
 * @return will return the new value of the animals health
 */
public int decreasehealth();

/**
 * getter for health
 * @return value of health will be returned.
 */
public int gethealth();

}
    

