/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coursework2.hotel.mvc.view;
import coursework2.hotel.mvc.dto.CustomerDto;
import coursework2.hotel.mvc.controller.CustomerController;
import coursework2.hotel.mvc.controller.PackageController;
import coursework2.hotel.mvc.dto.PackageDetailDto;
import coursework2.hotel.mvc.dto.PackageDto;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class PackageView extends javax.swing.JFrame {
private CustomerController customerController = new CustomerController();
private PackageController packageController = new PackageController();

/**
     * Creates new form PackageView
     */
    public PackageView() {
        initComponents();
        loadCustomerPackages();
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        packagetbl = new javax.swing.JTable();
        customerIdlbl = new javax.swing.JLabel();
        CustomerIdtxt = new javax.swing.JTextField();
        packageIdlbl = new javax.swing.JLabel();
        packageIdtxt = new javax.swing.JTextField();
        noPersonslbl = new javax.swing.JLabel();
        noOfPersontxt = new javax.swing.JTextField();
        totalPackagelbl = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        customerSearchBtn = new javax.swing.JButton();
        packageSearchBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalAmountlbl = new javax.swing.JLabel();
        customerDetaillbl = new javax.swing.JLabel();
        packageDetaillbl = new javax.swing.JLabel();
        packageDetaillbl1 = new javax.swing.JLabel();
        totalAmounttxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Royal Hotel Villa");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Package Details");

        packagetbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(packagetbl);

        customerIdlbl.setText("Customer Id");

        packageIdlbl.setText("Package Id");

        noPersonslbl.setText("No of Persons Stay");

        totalPackagelbl.setText("Total Amount for Package");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        customerSearchBtn.setText("Search");
        customerSearchBtn.setToolTipText("");
        customerSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerSearchBtnActionPerformed(evt);
            }
        });

        packageSearchBtn.setText("Search");
        packageSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageSearchBtnActionPerformed(evt);
            }
        });

        packageDetaillbl1.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(totalPackagelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(noOfPersontxt, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(totalAmounttxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalAmountlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noPersonslbl))
                        .addGap(363, 819, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerIdlbl)
                            .addComponent(packageIdlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(packageIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(packageSearchBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 452, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(packageDetaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(packageDetaillbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(customerSearchBtn)
                                .addGap(18, 18, 18)
                                .addComponent(customerDetaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerIdlbl)
                    .addComponent(CustomerIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerSearchBtn)
                    .addComponent(jLabel3)
                    .addComponent(customerDetaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packageIdlbl)
                    .addComponent(packageIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(packageSearchBtn)
                    .addComponent(jLabel4)
                    .addComponent(packageDetaillbl)
                    .addComponent(packageDetaillbl1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noPersonslbl)
                    .addComponent(noOfPersontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPackagelbl)
                    .addComponent(totalAmountlbl)
                    .addComponent(totalAmounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        packageDetaillbl1.getAccessibleContext().setAccessibleName("FILL");

        pack();
    }// </editor-fold>//GEN-END:initComponents
         
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
         savePackage();
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        deletePackage();
// TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void customerSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerSearchBtnActionPerformed
      searchCustomer();
             
    }//GEN-LAST:event_customerSearchBtnActionPerformed

    private void packageSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageSearchBtnActionPerformed
       searchPackageDetail();
// TODO add your handling code here:
    }//GEN-LAST:event_packageSearchBtnActionPerformed

    /**
     * @param args the command line arguments
     */
   // public static void main(String args[]) {
        /* Set the Nimbus look and feel */
       // //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    //    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
   //      * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
 //        */
   //     try {
        //    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
      //          if ("Nimbus".equals(info.getName())) {
     //               javax.swing.UIManager.setLookAndFeel(info.getClassName());
      //              break;
      //          }
   //         }
   //     } catch (ClassNotFoundException ex) {
 //           java.util.logging.Logger.getLogger(PackageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  //      } catch (InstantiationException ex) {
 //           java.util.logging.Logger.getLogger(PackageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 //       } catch (IllegalAccessException ex) {
  //          java.util.logging.Logger.getLogger(PackageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 //       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
 //           java.util.logging.Logger.getLogger(PackageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 //       }
        //</editor-fold>

        /* Create and display the form */
      //  java.awt.EventQueue.invokeLater(new Runnable() {
     //       public void run() {
     //           new PackageView().setVisible(true);
     //       }
    //    });
  //  }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustomerIdtxt;
    private javax.swing.JLabel customerDetaillbl;
    private javax.swing.JLabel customerIdlbl;
    private javax.swing.JButton customerSearchBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField noOfPersontxt;
    private javax.swing.JLabel noPersonslbl;
    private javax.swing.JLabel packageDetaillbl;
    private javax.swing.JLabel packageDetaillbl1;
    private javax.swing.JLabel packageIdlbl;
    private javax.swing.JTextField packageIdtxt;
    private javax.swing.JButton packageSearchBtn;
    private javax.swing.JTable packagetbl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel totalAmountlbl;
    private javax.swing.JTextField totalAmounttxt;
    private javax.swing.JLabel totalPackagelbl;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

  private void loadCustomerPackages() {
        try {
            String columns[] = {" Customer Id", "First Name","Last Name", "Package Type","No Of Persons", " Amount For Package"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };

            packagetbl.setModel(dtm);
            
              ArrayList<PackageDto> packageDtos = packageController.getAllPackage();

            for (PackageDto packageDto : packageDtos) {
                Object[] rowData = {packageDto.getCustomerId(), packageDto.getFirstName(),packageDto.getLastName(),
                    packageDto.getPackageType(),  packageDto.getNoOfPersons(), packageDto.getAmountForPackage()};
                     dtm.addRow(rowData);
            }

        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }  
        
    
        private void searchCustomer(){
   try {
            String customerId = CustomerIdtxt.getText();
           CustomerDto customerDto = customerController.searchCustomer(customerId);
            if(customerDto != null){
                customerDetaillbl.setText(customerDto.getFirstName()+ " "+ customerDto.getLastName());
            }else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(PackageView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


private void searchPackageDetail(){
    try {
            String packageId = packageIdtxt.getText();
            PackageDetailDto packageDetailDto = packageController.searchPackageDetail(packageId);
            if(packageDetailDto != null){
                packageDetaillbl1.setText(packageDetailDto.getPackageType()+ " | "+ packageDetailDto.getDescription()+" | LKR "+packageDetailDto.getPackageAmount());
            }else {
                JOptionPane.showMessageDialog(this, "Package Not Found");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(PackageView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

private void savePackage() {
    PackageDto dto = new PackageDto();
    dto.setCustomerId(CustomerIdtxt.getText());
    dto.setFirstName(customerDetaillbl.getText());
    dto.setLastName(customerDetaillbl.getText());
    dto.setPackageType(packageDetaillbl1.getText());
    dto.setNoOfPersons(noOfPersontxt.getText());
    dto.setAmountForPackage(totalAmounttxt.getText());
         try {
        String result = packageController.savePackage(dto);
        System.out.println(result);
        JOptionPane.showMessageDialog(this, result);
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
        JOptionPane.showMessageDialog(this, ex.getMessage());
    }
}
private void clear() {
   
    CustomerIdtxt.setText("");
    packageIdtxt.setText("");
    noOfPersontxt.setText("");
    totalAmounttxt.setText("");
    customerDetaillbl.setText("");
    packageDetaillbl.setText("");
    packageDetaillbl1.setText("");
}
   private void deletePackage(){
        try {
        String packageId = packageIdtxt.getText();
        packageController.deletePackage(packageId);
        JOptionPane.showMessageDialog(this, "Package deleted successfully.");

        clear();
    } catch (Exception ex) {
        Logger.getLogger(PackageView.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex.getMessage());
    }
}
}
