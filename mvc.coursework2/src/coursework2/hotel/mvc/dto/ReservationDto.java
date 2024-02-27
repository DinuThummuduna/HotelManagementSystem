/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2.hotel.mvc.dto;

/**
 *
 * @author User
 */
import java.sql.Timestamp;

public class ReservationDto {
    private Integer customerId;
    private String name;
    private Timestamp reservationDate;
    private String checkInDate;
    private String checkOutDate;
    private Integer noOfDaysStay;
    private Double reservationAmount;

    // Constructors

    public ReservationDto() {
        // Default constructor
    }

    public ReservationDto(Integer customerId, String name, Timestamp reservationDate,
                          String checkInDate, String checkOutDate, Integer noOfDaysStay,
                          Double reservationAmount) {
        this.customerId = customerId;
        this.name = name;
        this.reservationDate = reservationDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.noOfDaysStay = noOfDaysStay;
        this.reservationAmount = reservationAmount;
    }

    // Getters and Setters

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Timestamp reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Integer getNoOfDaysStay() {
        return noOfDaysStay;
    }

    public void setNoOfDaysStay(Integer noOfDaysStay) {
        this.noOfDaysStay = noOfDaysStay;
    }

    public Double getReservationAmount() {
        return reservationAmount;
    }

    public void setReservationAmount(Double reservationAmount) {
        this.reservationAmount = reservationAmount;
    }

    // toString method for debugging or logging

    @Override
    public String toString() {
        return "ReservationDto{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", reservationDate=" + reservationDate +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", noOfDaysStay=" + noOfDaysStay +
                ", reservationAmount=" + reservationAmount +
                '}';
    }
}