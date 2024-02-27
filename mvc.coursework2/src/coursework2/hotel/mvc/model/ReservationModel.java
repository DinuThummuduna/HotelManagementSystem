/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2.hotel.mvc.model;

import coursework2.hotel.mvc.dto.ReservationDto;
import coursework2.hotel.mvc.db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

public class ReservationModel {

    public ArrayList<ReservationDto> getAllReservation() {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "SELECT * FROM Reservation";
            try (PreparedStatement statement = connection.prepareStatement(sql);
                 ResultSet rst = statement.executeQuery()) {

                ArrayList<ReservationDto> reservationDtos = new ArrayList<>();

                while (rst.next()) {
                    ReservationDto dto = new ReservationDto();
                    dto.setCustomerId(rst.getInt("CustomerId"));
                    dto.setName(rst.getString("Name"));

                    Timestamp reservationDate = rst.getTimestamp("ReservationDate");
                    dto.setReservationDate(reservationDate);

                    dto.setCheckInDate(rst.getString("CheckInDate"));
                    dto.setCheckOutDate(rst.getString("CheckOutDate"));
                    dto.setNoOfDaysStay(rst.getInt("NoOfDaysStay"));
                    dto.setReservationAmount(rst.getDouble("ReservationAmount"));
                    reservationDtos.add(dto);
                }

                return reservationDtos;
            } finally {
                if (connection != null) {
                    connection.close();
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public String saveReservation(ReservationDto reservationDto) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Reservation (CustomerId, Name, ReservationDate, CheckInDate, CheckOutDate, NoOfDaysStay, ReservationAmount) VALUES (?,?,?,?,?,?,?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, reservationDto.getCustomerId());
            statement.setString(2, reservationDto.getName());
            statement.setTimestamp(3, new Timestamp(reservationDto.getReservationDate().getTime()));
            statement.setString(4, reservationDto.getCheckInDate());
            statement.setString(5, reservationDto.getCheckOutDate());
            statement.setInt(6, reservationDto.getNoOfDaysStay());
            statement.setDouble(7, reservationDto.getReservationAmount());

            if (statement.executeUpdate() > 0) {
                return "Success";
            } else {
                return "Fail";
            }
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    public String deleteReservation(int customerId) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();

        String sql = "DELETE FROM Reservation WHERE CustomerId=?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, customerId);

            if (statement.executeUpdate() > 0) {
                return "Success";
            } else {
                return "Fail";
            }
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
}