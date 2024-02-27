/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2.hotel.mvc.controller;
import coursework2.hotel.mvc.model.PackageModel;
//import coursework2.hotel.mvc.dto.CustomerDto;
import coursework2.hotel.mvc.dto.PackageDetailDto;
import java.util.ArrayList;
import coursework2.hotel.mvc.dto.PackageDto;
/**
 *
 * @author User
 */
public class PackageController {
   
    private PackageModel packageModel;
    
    public PackageController(){
   this.packageModel = new PackageModel();
}
    
      
    
    public PackageDetailDto searchPackageDetail(String packageId) throws Exception{
       return packageModel.searchPackageDetail(packageId);
   }
   public ArrayList<PackageDto> getAllPackage() throws Exception {
        return packageModel.getAllPackage();
    }
    public String savePackage(PackageDto packageDto) throws Exception{
        return  packageModel.savePackage(packageDto);
    }
   public void deletePackage(String packageId) throws Exception {
    packageModel.deletePackage(packageId);
    
}
}