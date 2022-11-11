package com.uservessel;
import java.util.Scanner;

public class UserMenu {

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
    
}
