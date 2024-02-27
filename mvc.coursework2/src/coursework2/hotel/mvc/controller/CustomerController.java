/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2.hotel.mvc.controller;
import coursework2.hotel.mvc.dto.CustomerDto;
import coursework2.hotel.mvc.model.CustomerModel;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class CustomerController {
     private CustomerModel customerModel;

    public CustomerController() {
        this.customerModel = new CustomerModel();
    }
    
    
    
    public String saveCustomer(CustomerDto customerDto) throws Exception{
        return  customerModel.saveCustomer(customerDto);
    }
    public ArrayList<CustomerDto> getAllCustomer() throws Exception{
        return customerModel.getAllCustomer();
    }
    
    public String updateCustomer(CustomerDto customerDto) throws Exception{
        return customerModel.updateCustomer(customerDto);
    }
    
    public String deleteCustomer(String id) throws Exception{
        return customerModel.deleteCustomer(id);
    }
    
   public CustomerDto  searchCustomer(String customerId) throws Exception{
       return customerModel.searchCustomer(customerId);
   }
}