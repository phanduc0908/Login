/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.User;

/**
 *
 * @author phanduc0908
 */
public class Validation {
    private static final Scanner sc = new Scanner(System.in);
    
    //check user input number limit
    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
    
    //check user input string
    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    
    // check dupplicate username 
    
    public static boolean checkIsExistUsername(ArrayList<User> userList,String xUsername){
        
        for(User user : userList){
            if(user.getUsername().equals(xUsername)){
                return true;
            }
        }
        return false;
    }
    
    // Check correct password
    
    public static boolean checkIsCorrectPassword(ArrayList<User> userList, String xUsername, String xPassword){
        for(User user : userList){
            if(user.getUsername().equals(xUsername) && user.getPassword().equals(xPassword)){
                return true;
            }
        }       
        return false;
        
    }
}
