package com.uservessel;
import java.util.Scanner;

public class Menu {

    public static int getUserInput(){
        
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Enter your choice:");
        System.out.println("1. Add a new username");
        System.err.println("2. Add a vessel for a specific username");
        System.err.println("3. Delete a vessel from a specific username");
        System.err.println("4. Print all vessels for a specific username");
        System.err.println("5. Exit Application");
        System.out.println("----------------------------------------------------");

    
        return input.nextInt();
    }

    public static void loopMenu(){

        boolean loop=true;
        String username;
        String vesselName;
        Scanner userInput = new Scanner(System.in);

        while(loop){
            switch(getUserInput()){

                case 1:

                    System.out.println("please enter a new username:");

                   try {
                   
                    System.out.println(User.addUsername(userInput.next()));
                    
                } catch (Exception e) {
                        
                    e.printStackTrace();
                    System.out.println("That is not a valid username");
                    
                }
                    break;
                    
                case 2: 

                    System.out.println("please enter a the username you wish to associate a vessel with:");
                    username= userInput.next();

                    System.out.println("please enter the name of the vessel you wish to associate with the user:");
                    vesselName = userInput.next();  

                    try {

                        System.out.println(User.addVessel(username, vesselName));

                    } catch (Exception e) {

                        e.printStackTrace();
                        System.out.println("That is not a valid username");
                    }

                    break;

                case 3:

                    System.out.println("please enter a the username for which you wish to delete a vessel:");
                    username = userInput.next();

                    System.out.println("please enter a the name of the vessel you wish to delete:");
                    vesselName = userInput.next();

                    try {

                        System.out.println(User.removeVessel(username,vesselName));

                    } catch (Exception e) {

                        e.printStackTrace();
                        System.out.println("You have not entered a valid value");

                    }

                    break;
                case 4:

                    try {

                        User.showAllVessels();

                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                    
                    break;
                case 5:
                    loop=false;
                    break;
                default:
                    loop=false;
                    break;
                }
            }
       }       
}
