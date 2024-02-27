/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2.hotel.mvc.model;
import coursework2.hotel.mvc.db.DBConnection;
import coursework2.hotel.mvc.dto.CustomerDto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class CustomerModel {
    public String saveCustomer(CustomerDto customerDto) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        
         String sql = "INSERT INTO Customer VALUES (?,?,?,?,?)";
         
         PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, customerDto.getCustomerId());
        statement.setString(2, customerDto.getFirstName());
        statement.setString(3, customerDto.getLastName());
        statement.setString(4, customerDto.getEmail());
        statement.setString(5, customerDto.getPhoneNumber());
        
        if (statement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    } 
    public CustomerDto searchCustomer(String customerId) throws Exception {
    Connection connection = DBConnection.getInstance().getConnection();  
        
        
     String sql = "SELECT * FROM customer WHERE CustomerId = ?";
    
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, customerId);

    ResultSet rst = statement.executeQuery();

    CustomerDto dto = null;
    while (rst.next()) {
        dto = new CustomerDto();

        dto.setCustomerId(rst.getString("CustomerId"));
        dto.setFirstName(rst.getString("FirstName"));
        dto.setLastName(rst.getString("LastName")); 
        dto.setEmail(rst.getString("Email"));
        dto.setPhoneNumber(rst.getString("PhoneNumber"));
    }
    return dto;
    }
    
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM customer";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();

        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        
         while (rst.next()) {
            CustomerDto dto = new CustomerDto();
            dto.setCustomerId(rst.getString("CustomerId"));
            dto.setFirstName(rst.getString("FirstName"));
            dto.setLastName(rst.getString("LastName"));
            dto.setEmail(rst.getString("Email"));
            dto.setPhoneNumber(rst.getString("PhoneNumber"));
             customerDtos.add(dto);
        }

        return customerDtos;
    }
    
    public String updateCustomer(CustomerDto customerDto) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();

        String sql = "UPDATE Customer SET CustomerId=?, FirstName=?, LastName=?, Email=?, PhoneNumber=?";
                

        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, customerDto.getCustomerId());
        statement.setString(2, customerDto.getFirstName());
        statement.setString(3, customerDto.getLastName());
        statement.setString(4, customerDto.getEmail());
        statement.setString(5, customerDto.getPhoneNumber());
        
        if (statement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    }
     public String deleteCustomer(String id) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();

        String sql = "DELETE FROM customer WHERE CustomerId=?";

        PreparedStatement statement = connection.prepareStatement(sql);        
        statement.setString(1, id);

        if (statement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    }
}
