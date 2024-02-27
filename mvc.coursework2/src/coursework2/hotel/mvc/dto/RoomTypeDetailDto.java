/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2.hotel.mvc.dto;

/**
 *
 * @author User
 */
public class RoomTypeDetailDto {
    private Integer CustomerId;
    private String Name;
    private Integer RoomCategoryId;
    private String CategoryName;
    private Integer  NoOfRooms;
    private Double AmountForRoom;

    /**
     * @return the CustomerId
     */
    public Integer getCustomerId() {
        return CustomerId;
    }

    /**
     * @param CustomerId the CustomerId to set
     */
    public void setCustomerId(Integer CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the RoomCategoryId
     */
    public Integer getRoomCategoryId() {
        return RoomCategoryId;
    }

    /**
     * @param RoomCategoryId the RoomCategoryId to set
     */
    public void setRoomCategoryId(Integer RoomCategoryId) {
        this.RoomCategoryId = RoomCategoryId;
    }

    /**
     * @return the CategoryName
     */
    public String getCategoryName() {
        return CategoryName;
    }

    /**
     * @param CategoryName the CategoryName to set
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * @return the NoOfRooms
     */
    public Integer getNoOfRooms() {
        return NoOfRooms;
    }

    /**
     * @param NoOfRooms the NoOfRooms to set
     */
    public void setNoOfRooms(Integer NoOfRooms) {
        this.NoOfRooms = NoOfRooms;
    }

    /**
     * @return the AmountForRoom
     */
    public Double getAmountForRoom() {
        return AmountForRoom;
    }

    /**
     * @param AmountForRoom the AmountForRoom to set
     */
    public void setAmountForRoom(Double AmountForRoom) {
        this.AmountForRoom = AmountForRoom;
    }

    @Override
    public String toString() {
        return "RoomTypeDetailDto{" + "CustomerId=" + CustomerId + ", Name=" + Name + ", RoomCategoryId=" + RoomCategoryId + ", CategoryName=" + CategoryName + ", NoOfRooms=" + NoOfRooms + ", AmountForRoom=" + AmountForRoom + '}';
    }
    
    
    
}
