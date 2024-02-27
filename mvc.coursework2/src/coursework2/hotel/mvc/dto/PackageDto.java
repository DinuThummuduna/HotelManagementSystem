/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2.hotel.mvc.dto;

/**
 *
 * @author User
 */
public class PackageDto {
     private String CustomerId;
     private String FirstName;
     private String LastName;
     private String PackageType;
     private String NoOfPersons;
     private String AmountForPackage;

    /**
     * @return the CustomerId
     */
    public String getCustomerId() {
        return CustomerId;
    }

    /**
     * @param CustomerId the CustomerId to set
     */
    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
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
     * @return the NoOfPersons
     */
    public String getNoOfPersons() {
        return NoOfPersons;
    }

    /**
     * @param NoOfPersons the NoOfPersons to set
     */
    public void setNoOfPersons(String NoOfPersons) {
        this.NoOfPersons = NoOfPersons;
    }

    /**
     * @return the AmountForPackage
     */
    public String getAmountForPackage() {
        return AmountForPackage;
    }

    /**
     * @param AmountForPackage the AmountForPackage to set
     */
    public void setAmountForPackage(String AmountForPackage) {
        this.AmountForPackage = AmountForPackage;
    }

    @Override
    public String toString() {
        return "PackageDto{" + "CustomerId=" + CustomerId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", PackageType=" + PackageType + ", NoOfPersons=" + NoOfPersons + ", AmountForPackage=" + AmountForPackage + '}';
    }

   
     
     
}
