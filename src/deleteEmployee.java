
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author biaddop
 */
public class deleteEmployee extends javax.swing.JFrame {

    /**
     * Creates new form deleteEmployee
     */
    public deleteEmployee() {
        initComponents();
        showAllEmpl();
    }

    public void showAllEmpl() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empmange", "vatiza", "admin");
            System.out.println("Database Connected!");
            String sql;
            sql = "SELECT *FROM employee";
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            DefaultTableModel model = (DefaultTableModel) empTable.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new String[]{rs.getString(11), rs.getString(9), rs.getString(2), rs.getString(7),
                    rs.getString(8), rs.getString(12), rs.getString(13)});
            }
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }

    public void searchemployee() {
        DefaultTableModel ob = (DefaultTableModel) empTable.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        empTable.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(getempid.getText()));
    }

    public void setTextFromTable() {
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        int selectrowindex = empTable.getSelectedRow();
        getempid.setText(model.getValueAt(selectrowindex, 1).toString());
        empname.setText(model.getValueAt(selectrowindex, 2).toString());
        getDept.setText(model.getValueAt(selectrowindex, 0).toString());

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
        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        getempid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        empname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        getDept = new javax.swing.JTextField();
        closeBTn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setText("Remove Employee");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Dept", "EmpId", "Fist Name", "Phone", "Email", "Gendar", "Joint Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        empTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(empTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 750, 380));

        jButton1.setText("Remove this Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel2.setText("EmpId");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        getempid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                getempidKeyReleased(evt);
            }
        });
        getContentPane().add(getempid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 180, -1));

        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        getContentPane().add(empname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 180, -1));

        jLabel5.setText("Dept");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        getContentPane().add(getDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 180, -1));

        closeBTn.setText("Close");
        closeBTn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBTnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBTn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 490, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 760, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void getempidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getempidKeyReleased
        // TODO add your handling code here:
        searchemployee();


    }//GEN-LAST:event_getempidKeyReleased

    private void empTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empTableMouseClicked
        // TODO add your handling code here:
        setTextFromTable();
    }//GEN-LAST:event_empTableMouseClicked

    private void closeBTnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBTnActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_closeBTnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String empId = getempid.getText();

// Prepare the SQL statements
        String insertQuery = "INSERT INTO removed_employee SELECT * FROM employee WHERE emp_id = ?";
        String deleteQuery = "DELETE FROM employee WHERE emp_id = ?";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empmange", "vatiza", "admin");
            PreparedStatement insertStatement = con.prepareStatement(insertQuery);
            PreparedStatement deleteStatement = con.prepareStatement(deleteQuery);
            {
                insertStatement.setString(1, empId);
                deleteStatement.setString(1, empId);

                insertStatement.executeUpdate();
                deleteStatement.executeUpdate();
                System.out.println("Employee with emp_id " + empId + " removed successfully.");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        showAllEmpl();
      


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(deleteEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBTn;
    private javax.swing.JTable empTable;
    private javax.swing.JTextField empname;
    private javax.swing.JTextField getDept;
    private javax.swing.JTextField getempid;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
