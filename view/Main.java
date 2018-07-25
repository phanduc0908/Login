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
public class Main {
    public static void main(String[] args) {
        
        ArrayList<User> userList = new ArrayList<>();
        while(true){
            Controller.menu();
            
            int choice = Validation.checkInputIntLimit(1, 3);
            switch(choice){
                case 1:
                    Controller.loginUser(userList);
                    break;
                case 2: 
                    Controller.createUser(userList);
                    break;
                case 3:
                    return;
            }
        }
    }
}
