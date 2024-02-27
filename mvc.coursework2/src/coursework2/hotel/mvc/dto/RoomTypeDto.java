/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2.hotel.mvc.dto;

/**
 *
 * @author User
 */
public class RoomTypeDto {
   
    private Integer RoomCategoryId;
    private String CategoryName;
    private String Description;
    private Double PricePerNight;

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
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the PricePerNight
     */
    public Double getPricePerNight() {
        return PricePerNight;
    }

    /**
     * @param PricePerNight the PricePerNight to set
     */
    public void setPricePerNight(Double PricePerNight) {
        this.PricePerNight = PricePerNight;
    }

    @Override
    public String toString() {
        return "RoomTypeDto{" + "RoomCategoryId=" + RoomCategoryId + ", CategoryName=" + CategoryName + ", Description=" + Description + ", PricePerNight=" + PricePerNight + '}';
    }

    /**
     * @return the CustomerId
     */
   
    
}
