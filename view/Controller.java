/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import model.User;

/**
 *
 * @author phanduc0908
 */
public class Controller {

    // show menu
    public static void menu() {
        System.out.println("====== Login form ======");
        System.out.println("1. Login ");
        System.out.println("2. Register ");
        System.out.println("3. Exist ");
        System.out.println("Enter your choice:");
    }

    // create new user
    public static void createUser(ArrayList<User> userList) {
        while (true) {
            System.out.println("------- Register form ------");
            String username;
            System.out.println("Enter username: ");
            username = Validation.checkInputString();
            while (true) {
                
                
                if (Validation.checkIsExistUsername(userList, username)) {
                    System.err.println("Username '"+username+"' is existed, please re-enter !");
                    System.out.println("Enter username: ");
                    username = Validation.checkInputString();
                }
                break;
            }
            String password;
            System.out.println("Enter your password: ");
            password = Validation.checkInputString();
            
            userList.add(new User(username, password));
            System.out.println("Register successfull !");
            
            return;
        }
    }
    
    //  login
    
    public static void loginUser(ArrayList<User> userList){
        if(userList.isEmpty()){
            System.out.println("User data is empty !");
            return;
        }
        while(true){
            System.out.println("------- Login form ------");
            String username;
            System.out.println("Enter username: ");
            username = Validation.checkInputString();
            while (true) {               
                
                if (!Validation.checkIsExistUsername(userList, username)) {
                    System.err.println("Username '"+username+"' is not existed. Please re-enter !");
                    System.out.println("Enter username: ");
                    username = Validation.checkInputString();
                }
                break;
            }
            String password;
            System.out.println("Enter password: ");
            password = Validation.checkInputString();
            while(true){
                
                if(!Validation.checkIsCorrectPassword(userList, username, password)){
                    System.err.println("Your password is incorrect. Please re-enter");
                    System.out.println("Enter password: ");
                    password = Validation.checkInputString();
                }
                break;
            }
            
            System.out.println("Login successfull !");
            return;
        }
    }
}
