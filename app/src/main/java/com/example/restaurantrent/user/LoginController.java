package com.example.restaurantrent.user;

import com.example.restaurantrent.user.DataBase.DatabaseHandler;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {


    public static void loginUser(String username, String password){
        DatabaseHandler dbHandler = new DatabaseHandler();
        ResultSet resultSet = dbHandler.loginUser(username,password);

        int counter = 0;

        while(true){
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            counter++;
        }
        if(counter >= 1){
            System.out.println("SUCCES!");
        }
    }

}

