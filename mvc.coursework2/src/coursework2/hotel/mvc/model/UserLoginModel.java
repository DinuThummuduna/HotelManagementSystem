/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2.hotel.mvc.model;

import coursework2.hotel.mvc.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class UserLoginModel {
    public boolean isValidLogin(String emailId, char[] password) {
        try {
            // Use the DBConnection class to get the connection instance
            try (Connection connection = DBConnection.getInstance().getConnection()) {
                String query = "SELECT * FROM userlogin WHERE emailId = ? AND password = ?";
                
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, emailId);
                    preparedStatement.setString(2, new String(password));
                    
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        return resultSet.next(); // If the result set has at least one row, the login is valid
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            // Handle database connection or query execution errors
            return false;
        }
    }
}
