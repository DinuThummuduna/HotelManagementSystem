/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2.hotel.mvc.model;

import coursework2.hotel.mvc.dto.RoomTypeDto;
import coursework2.hotel.mvc.db.DBConnection;
import coursework2.hotel.mvc.dto.RoomTypeDetailDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author User
 */
public class RoomTypeModel {
    public RoomTypeDto searchRoomCategory(Integer roomCategoryId) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();

        String sql = "SELECT * FROM roomcategory WHERE RoomCategoryId = ?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, roomCategoryId); // Use setInt for Integer parameter

        ResultSet rst = statement.executeQuery();

        RoomTypeDto dto = null;
        while (rst.next()) {
            dto = new RoomTypeDto();

            // Correct the method names
            dto.setRoomCategoryId(rst.getInt("RoomCategoryId"));
            dto.setCategoryName(rst.getString("CategoryName"));
            dto.setDescription(rst.getString("Description"));
            dto.setPricePerNight(rst.getDouble("PricePerNight"));
        }

        return dto;
    }
    
     public ArrayList<RoomTypeDetailDto> getAllRoom() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM CustomerRooms";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();

        ArrayList<RoomTypeDetailDto> roomTypeDetailDtos = new ArrayList<>();
        
         while (rst.next()) {
            RoomTypeDetailDto dto = new RoomTypeDetailDto();
            dto.setCustomerId(rst.getInt("CustomerId"));
            dto.setName(rst.getString("Name"));
            dto.setRoomCategoryId(rst.getInt("RoomCategoryId"));
            dto.setCategoryName(rst.getString("CategoryName"));
            dto.setNoOfRooms(rst.getInt("NoOfRooms"));
            dto.setAmountForRoom(rst.getDouble("AmountForRoom"));
            roomTypeDetailDtos.add(dto);
        }

        return roomTypeDetailDtos;
    }
    public String saveRoom(RoomTypeDetailDto roomTypeDetailDto) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO customerrooms (CustomerId, Name, RoomCategoryId, CategoryName, NoOfRooms, AmountForRoom) VALUES (?,?,?,?,?,?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, roomTypeDetailDto.getCustomerId());
            statement.setString(2, roomTypeDetailDto.getName());
            statement.setInt(3, roomTypeDetailDto.getRoomCategoryId());
            statement.setString(4, roomTypeDetailDto.getCategoryName());
            statement.setInt(5, roomTypeDetailDto.getNoOfRooms());
            statement.setDouble(6, roomTypeDetailDto.getAmountForRoom());

            if (statement.executeUpdate() > 0) {
                return "Success";
            } else {
                return "Fail";
            }
        } finally {
            // Close resources in the finally block
            if (connection != null) {
                connection.close();
            }
        }
    
    }
    
     public String deleteRoom(Integer roomCategoryId) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();

        String sql = "DELETE FROM  customerrooms WHERE CustomerId=?";

        PreparedStatement statement = connection.prepareStatement(sql);        
        statement.setInt(1, roomCategoryId);

        if (statement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    }
}