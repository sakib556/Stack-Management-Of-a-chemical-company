/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_entry;
import Main.StartWindow;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sakib
 */
public class Employee_salary extends javax.swing.JFrame {

    /**
     * Creates new form Employee_salary
     */
    public Employee_salary() {
        initComponents();
        connect();
        loadWindow();
        comboBox();
    }
Connection con;
PreparedStatement pst=null;
ResultSet rs=null,rs2=null,rs3=null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        date = new javax.swing.JLabel();
        txtMobileNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        employeeNCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        categoryNCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMonth = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Employe Name", "Mobile", "Position", "Category", "Month", "Amount"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 200, 1230, 250);
        jPanel1.add(date);
        date.setBounds(900, 10, 220, 30);

        txtMobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMobileNo);
        txtMobileNo.setBounds(420, 90, 160, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Category :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(270, 60, 90, 30);

        employeeNCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item" }));
        employeeNCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeNComboMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                employeeNComboMouseEntered(evt);
            }
        });
        employeeNCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeNComboActionPerformed(evt);
            }
        });
        jPanel1.add(employeeNCombo);
        employeeNCombo.setBounds(20, 90, 150, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mobile no. :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(470, 60, 70, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(610, 150, 130, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Employe Name :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 60, 110, 30);

        categoryNCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Salary", "Sales Commission", "Working Expenses", "Bonus" }));
        categoryNCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryNComboMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                categoryNComboMouseEntered(evt);
            }
        });
        categoryNCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryNComboActionPerformed(evt);
            }
        });
        jPanel1.add(categoryNCombo);
        categoryNCombo.setBounds(210, 90, 180, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Position :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(270, 120, 90, 30);

        txtPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionActionPerformed(evt);
            }
        });
        jPanel1.add(txtPosition);
        txtPosition.setBounds(210, 150, 180, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Month :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 120, 70, 30);

        txtMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonthActionPerformed(evt);
            }
        });
        jPanel1.add(txtMonth);
        txtMonth.setBounds(20, 150, 150, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Amount :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(470, 120, 70, 30);

        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        jPanel1.add(txtAmount);
        txtAmount.setBounds(420, 150, 160, 30);

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId);
        txtId.setBounds(960, 80, 70, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Id : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(920, 80, 40, 30);

        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(1140, 80, 90, 30);

        jLabel13.setBackground(new java.awt.Color(102, 255, 102));
        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel13.setText(" *Employee salary  : ");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 10, 240, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1260, 600);

        setSize(new java.awt.Dimension(1276, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void connect(){ 
        try {
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/chemical_company", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Employee_salary.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked
public void comboBox(){
        try {
            pst=con.prepareStatement("SELECT `name` FROM `employe`");
            rs=pst.executeQuery();
             while(rs.next()){
         employeeNCombo.addItem(rs.getString(1));
        }            
        } catch (SQLException ex) {
            Logger.getLogger(Employee_salary.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    private void txtMobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileNoActionPerformed

    private void employeeNComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeNComboMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeNComboMouseClicked

    private void employeeNComboMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeNComboMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeNComboMouseEntered

    private void employeeNComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeNComboActionPerformed
        // TODO add your handling code here:
        //      select();
        if(employeeNCombo.getSelectedIndex()>0){
            try {
                pst=con.prepareStatement("SELECT `position`,`phone_number` FROM `employe` WHERE `name`=?");
                pst.setString(1,employeeNCombo.getSelectedItem().toString());
                rs=pst.executeQuery();
                while(rs.next()){
                   txtPosition.setText(rs.getString(1));
                   txtMobileNo.setText(rs.getString(2));
        }    
            } catch (SQLException ex) {
                Logger.getLogger(Employee_salary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_employeeNComboActionPerformed
public void loadWindow(){
     String sid="0";
        try {
            pst=con.prepareStatement("SELECT `id` FROM `employee_salary`");
            rs2=pst.executeQuery();
        while(rs2.next()){
         sid=rs2.getString(1);
        }
        int cid=Integer.parseInt(sid);
        cid=cid+1;
        txtId.setText(cid+"");
        clear();
        } catch (SQLException ex) {
            Logger.getLogger(Employee_salary.class.getName()).log(Level.SEVERE, null, ex);
        }}
public void loadTable(){
        //dateBox();
        try {
         DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
            //dt.setRowCount(0);
            String sid="";
            sid=txtId.getText();
            int id=Integer.parseInt(sid);
            pst=con.prepareStatement("select *from `employee_salary` where id=?");
            pst.setInt(1,id);
            rs3=pst.executeQuery();
        while(rs3.next()){
         dt.addRow(new Object[]{rs3.getString(2),rs3.getString(3),rs3.getString(4)
                                ,rs3.getString(5),rs3.getString(6),rs3.getString(7),rs3.getString(8)});
        }
      // clear();
        } catch (SQLException ex) {
            Logger.getLogger(Employee_salary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void add(){
        String employeeN=employeeNCombo.getSelectedItem().toString();
        String mobile=txtMobileNo.getText();
        String position=txtPosition.getText();
        String category =categoryNCombo.getSelectedItem().toString();
        String month=txtMonth.getText();
        String amount=txtAmount.getText();
        long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);  
         if(mobile.isEmpty()==true||position.isEmpty()==true||month.isEmpty()==true||amount.isEmpty()==true){
            JOptionPane.showMessageDialog(this,"Please enter all records.");
        }
         else if(employeeNCombo.getSelectedIndex()==0 || categoryNCombo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this,"Please select the records.");             
         } 
        else{ 
            try {
        int Amounti=Integer.parseInt(amount);
        int mobilei=Integer.parseInt(mobile);
                pst=con.prepareStatement("INSERT INTO `employee_salary` (`date`,`employee_name`,`mobile`,`position`,`category`,`month`,`amount`) "
                        + "values(?,?,?,?,?,?,?)");
                pst.setDate(1,date);
                pst.setString(2,employeeN);
                pst.setInt(3,mobilei);               
                pst.setString(4,position);
                pst.setString(5,category);
                pst.setString(6,month);
                pst.setInt(7,Amounti);               
                pst.executeUpdate(); 
                JOptionPane.showMessageDialog(this,"Data add success !!!!!");
                 loadTable();
                loadWindow();
//                clear();
            } catch (SQLException ex) {
                Logger.getLogger(Employee_salary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add();
    }//GEN-LAST:event_jButton1ActionPerformed
public void clear(){
    txtMobileNo.setText("");
    txtMonth.setText("");
    txtPosition.setText("");
    txtAmount.setText("");
    employeeNCombo.setSelectedIndex(0);
    categoryNCombo.setSelectedIndex(0);
}
    private void categoryNComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryNComboMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryNComboMouseClicked

    private void categoryNComboMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryNComboMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryNComboMouseEntered

    private void categoryNComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryNComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryNComboActionPerformed

    private void txtPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionActionPerformed

    private void txtMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonthActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        new StartWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employee_salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_salary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoryNCombo;
    private javax.swing.JLabel date;
    private javax.swing.JComboBox<String> employeeNCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtPosition;
    // End of variables declaration//GEN-END:variables
}
