/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2.hotel.mvc.controller;

import coursework2.hotel.mvc.dto.RoomTypeDto;
import coursework2.hotel.mvc.model.RoomTypeModel;
import coursework2.hotel.mvc.dto.RoomTypeDetailDto;

import java.util.ArrayList;

public class RoomTypeController {
    private RoomTypeModel roomTypeModel;

    public RoomTypeController() {
        this.roomTypeModel = new RoomTypeModel();
    }

    public RoomTypeDto searchRoomCategory(Integer roomCategoryId) throws Exception {
        return roomTypeModel.searchRoomCategory(roomCategoryId);
    }
    
    public ArrayList<RoomTypeDetailDto> getAllRoom() throws Exception {
        return roomTypeModel.getAllRoom();
    }
    
     public String saveRoom(RoomTypeDetailDto roomTypeDetailDto) throws Exception{
        return  roomTypeModel.saveRoom(roomTypeDetailDto);
    }
     
     public void deleteRoom(Integer roomCategoryId) throws Exception {
    roomTypeModel.deleteRoom(roomCategoryId);
    
}
}