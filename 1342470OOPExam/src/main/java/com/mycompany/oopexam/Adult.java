/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopexam;

/**
 *
 * @author kylej
 * Adult class consists of the main mehtods that only adults 
 */
abstract class Adult {
    
    /**
     *detain takes the form of attack from other RPG's in which the methord will take a agugment of the value of "theTrouble Maker"
     * or the target and add one to the value of the targets strike if the targets strike value is 10 or greater that child will be unable to use its methords or progress to story
     * @param theTroubleMaker is the target of the the detain
     */
    public abstract void detain(Person theTroubleMaker);

    /**
     * 
     * @param theTroubleMaker takes the value of from the target and uses the methord to whatever the adults specilaist move is could be sending a child to a grounded room, putting them into detantion or ending the game by arresting the trouble maker.
     */
    public abstract void specialistMove(Person theTroubleMaker);
    
            
}
