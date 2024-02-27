/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2.hotel.mvc;
import coursework2.hotel.mvc.view.UserLoginView;
import coursework2.hotel.mvc.view.PackageView;
import coursework2.hotel.mvc.view.CustomerView;
import coursework2.hotel.mvc.view.RoomTypeView;
import coursework2.hotel.mvc.view.ReservationView;
/**
 *
 * @author User
 */
public class Main {
    public static void main (String[] args){
     //new PackageView().setVisible(true);
     //new RoomTypeView().setVisible(true);
     //new CustomerView().setVisible(true);
     // new UserLoginView().setVisible(true);
     // new ReservationView().setVisible(true);
    //Create and display the login view
     
        UserLoginView userLoginView = new UserLoginView();
        userLoginView.setVisible(true);{
        
        CustomerView customerView = new CustomerView();
        customerView.setVisible(true);{
        
        PackageView packageView = new PackageView();
        packageView.setVisible(true);{
        
         RoomTypeView roomTypeView = new RoomTypeView();
        roomTypeView.setVisible(true);{
        
         ReservationView reservationView = new ReservationView();
        reservationView.setVisible(true);
        }
        
        }
        
        }
    }
           
    }
    }
