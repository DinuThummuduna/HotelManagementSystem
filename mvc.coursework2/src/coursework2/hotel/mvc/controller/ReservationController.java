/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2.hotel.mvc.controller;
import coursework2.hotel.mvc.dto.ReservationDto;
import coursework2.hotel.mvc.model.ReservationModel;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ReservationController {
    private ReservationModel reservationModel;

    
 public ReservationController() {
        this.reservationModel = new ReservationModel();
    }
    
public ArrayList<ReservationDto> getAllReservation() throws Exception {
        try {
            return reservationModel.getAllReservation();
        } catch (Exception ex) {
            
            throw new RuntimeException(ex);
        }
    }

public String saveReservation(ReservationDto reservationDto) throws Exception {
    try {
            return reservationModel.saveReservation(reservationDto);
        } catch (Exception ex) {
            // Handle the exception according to your application's needs
            throw new RuntimeException(ex);
        }
}
 public void deleteReservation(String customerId) throws Exception {
    try {
            reservationModel.deleteReservation(customerId);
        } catch (Exception ex) {
            // Handle the exception according to your application's needs
            throw new RuntimeException(ex);
        }
    }

}
