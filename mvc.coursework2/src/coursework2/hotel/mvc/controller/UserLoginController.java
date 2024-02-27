/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2.hotel.mvc.controller;
import coursework2.hotel.mvc.model.UserLoginModel;
/**
 *
 * @author User
 */
public class UserLoginController {
    private UserLoginModel userModel;

    public UserLoginController(UserLoginModel userModel) {
        this.userModel = userModel;
}
      public boolean isValidLogin(String email, char[] password) {
        // You can add additional business logic if needed
        return userModel.isValidLogin(email, password);
    }
}
