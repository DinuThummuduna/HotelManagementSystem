/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2.hotel.mvc.dto;

/**
 *
 * @author User
 */
public class PackageDetailDto {
    private String PackageId;
     private String PackageType;
     private String Description;
     private String PackageAmount;

    /**
     * @return the PackageId
     */
    public String getPackageId() {
        return PackageId;
    }

    /**
     * @param PackageId the PackageId to set
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * @return the PackageType
     */
    public String getPackageType() {
        return PackageType;
    }

    /**
     * @param PackageType the PackageType to set
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
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
     * @return the PackageAmount
     */
    public String getPackageAmount() {
        return PackageAmount;
    }

    /**
     * @param PackageAmount the PackageAmount to set
     */
    public void setPackageAmount(String PackageAmount) {
        this.PackageAmount = PackageAmount;
    }

    @Override
    public String toString() {
        return "PackageDetailDto{" + "PackageId=" + PackageId + ", PackageType=" + PackageType + ", Description=" + Description + ", PackageAmount=" + PackageAmount + '}';
    }
   
    
}
