
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class removeEmployee extends javax.swing.JFrame {

    /**
     * Creates new form removeEmployee
     */
    public removeEmployee() {
        initComponents();
        showAllEmpl();
      
    }
     public void searchemployee(){
    DefaultTableModel ob=(DefaultTableModel) allempTable.getModel();
        TableRowSorter<DefaultTableModel>obj=new TableRowSorter<>(ob);
        allempTable.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchField.getText()));
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
            DefaultTableModel model = (DefaultTableModel) allempTable.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new String[]{rs.getString(11), rs.getString(9), rs.getString(2),rs.getString(3), rs.getString(7),
                    rs.getString(8), rs.getString(12), rs.getString(13),rs.getString(1),rs.getString(6)});
            }
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        allempTable = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setText("Resignation Employee");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1)
                .addContainerGap(446, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 70));

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 500, -1, -1));

        allempTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Dept", "EmpId", "Fist Name", "Last Name", "Phone", "Email", "Bank", "Account Number", "Nid", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        allempTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allempTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(allempTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1030, 380));

        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 190, -1));

        jLabel3.setText("Search");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void allempTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allempTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_allempTableMouseClicked

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
searchemployee();        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldKeyReleased

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
            java.util.logging.Logger.getLogger(removeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(removeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(removeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(removeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new removeEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allempTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
