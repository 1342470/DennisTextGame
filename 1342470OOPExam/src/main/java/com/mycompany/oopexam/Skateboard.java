/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopexam;

import static com.mycompany.oopexam.Shops.toShops;
import java.util.Scanner;

/**
 *
 * @author kylej
 */
public class Skateboard extends Item {

    /**
     * allows person to pick up item
     * @param theOwner target who will pick up item 
     */
    @Override
    public void pickup(Person theOwner) {
        System.out.println("you pick up a skateboard you can now use the skateboard to fast travel to most locaitons");
    }

    /**
     * allows the user to use to item to go to any locaiton other than the final area
     * @param theOwner target which to be sent to the location 
     */
    @Override
    public void useitem(Person theOwner) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Where do you want to go?");
        String responce = input1.nextLine();
        if(responce.equals("shops")){
            Shops.toShops();
        }else if(responce.equals("go to the park")){
            System.out.println("you deside you to the park");
            park.gotopark();
                }else if(responce.equals("go to the Bash Street School")){
                    System.out.println("for some strange reason you diside to go to school, well I guess you could get some tips on where Walter is");
                    bashStreetSchool.gotoBashStreetSchool();    
                    }else if(responce.equals("go to treehouse")){
                        treehouse.goToTreehouse();
                    }else if(responce.equals("go to living room")){
                        livingRoom.goToLivingRoom();
                    }
                    
                    
                     else{
                        System.out.println("unknown action");
                        
            
        }
    
    
    
    }
    
}
