/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2.hotel.mvc.model;

import coursework2.hotel.mvc.dto.PackageDetailDto;
import coursework2.hotel.mvc.dto.PackageDto;
import coursework2.hotel.mvc.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class PackageModel {
    
    public PackageDetailDto searchPackageDetail(String packageId) throws Exception {
    Connection connection = DBConnection.getInstance().getConnection();

    String sql = "SELECT * FROM package WHERE PackageId = ?";
    
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, packageId);

    ResultSet rst = statement.executeQuery();

    PackageDetailDto dto = null;
    while (rst.next()) {
        dto = new PackageDetailDto();

        dto.setPackageId(rst.getString("PackageId"));
        dto.setPackageType(rst.getString("PackageType"));
        dto.setPackageType(rst.getString("PackageType")); 
        dto.setDescription(rst.getString("Description"));
        dto.setPackageAmount(rst.getString("PackageAmount"));
    }

    return dto;
}
    public ArrayList<PackageDto> getAllPackage() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM customerpackages";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();

        ArrayList<PackageDto> packageDtos = new ArrayList<>();
        
         while (rst.next()) {
            PackageDto dto = new PackageDto();
            dto.setCustomerId(rst.getString("CustomerId"));
            dto.setFirstName(rst.getString("FirstName"));
            dto.setLastName(rst.getString("LastName"));
            dto.setPackageType(rst.getString("PackageType"));
            dto.setNoOfPersons(rst.getString("NoOfPersons"));
            dto.setAmountForPackage(rst.getString("AmountForPackage"));
             packageDtos.add(dto);
        }

        return packageDtos;
    }
    public String savePackage(PackageDto packageDto) throws ClassNotFoundException, SQLException {
    Connection connection = DBConnection.getInstance().getConnection();
    
    String sql = "INSERT INTO CustomerPackages (CustomerId, FirstName, LastName, PackageType, NoOfPersons, AmountForPackage) VALUES (?,?,?,?,?,?)";
    
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, packageDto.getCustomerId());
    statement.setString(2, packageDto.getFirstName());
    statement.setString(3, packageDto.getLastName());
    statement.setString(4, packageDto.getPackageType());
    statement.setString(5, packageDto.getNoOfPersons());
    statement.setString(6, packageDto.getAmountForPackage()); 

    if (statement.executeUpdate() > 0) {
        return "Success";
    } else {
        return "Fail";
    }
}
    
    public String deletePackage(String custId) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();

        String sql = "DELETE FROM customer WHERE CustomerId=?";

        PreparedStatement statement = connection.prepareStatement(sql);        
        statement.setString(1, custId);

        if (statement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    }
}
