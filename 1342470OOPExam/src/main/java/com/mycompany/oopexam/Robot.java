/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopexam;

/**
 *
 * @author kylej
 * defines the required methods for any robots
 */
public interface Robot {
    
    public void Robotfunction(Person theTarget);

    public void makeNoise();

    public String getName();

    public void increaseHealth();

    public int getHealth();

    public int decreasehealth();

    public int gethealth();
    
    public abstract void bite(Person thebiten);   
}
