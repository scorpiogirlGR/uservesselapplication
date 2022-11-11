package com.uservessel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class User {

    static HashMap<String, ArrayList<String>> usersAndTheirVessels = new HashMap<String, ArrayList<String>>();
   
    
    public static Map<String, ArrayList<String>> addUsername(String username) throws Exception{

        ArrayList<String> tempList = new ArrayList<String>();
       
        usersAndTheirVessels.put(username,tempList);

        return usersAndTheirVessels; 
    
    }

    public static Map<String, ArrayList<String>> addVessel(String username, String vesselName) throws Exception {

        ArrayList<String> tempList = new ArrayList<String>();

        if(usersAndTheirVessels.containsKey(username)){

           tempList= usersAndTheirVessels.get(username);
           tempList.add(vesselName);

        }else{

            throw new Exception ();
        }
       
        return usersAndTheirVessels; 
    
    }

    public static Map<String, ArrayList<String>> removeVessel(String username, String vesselName) throws Exception{

        ArrayList<String> tempList = new ArrayList<String>();

        if(usersAndTheirVessels.containsKey(username)){

           tempList= usersAndTheirVessels.get(username);
           tempList.remove(vesselName);
           
        }else{

            throw new Exception ();
        }
       
        return usersAndTheirVessels; 
    
    }

    public static void showAllVessels() throws Exception{

        for (String s: usersAndTheirVessels.keySet()){

            System.out.println("User:"+ s +" has the following vessels associated with them:");

            for (String v: usersAndTheirVessels.get(s)){
                
                System.out.println(v);
            }

        }        
    }
}
