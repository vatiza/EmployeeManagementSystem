
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
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
public class salary extends javax.swing.JFrame {

    /**
     * Creates new form salary
     */
    public salary() {
        initComponents();
        showAllEmpl();
    }

    public void totalSalaryCal() {
        int getAmount = Integer.parseInt(mainSalary.getText());
        int getBonus = Integer.parseInt(bonus.getText());
        String totalCal = String.valueOf(getAmount + getBonus);
        if (getBonus == 0) {
            totalSalarySum.setText(String.valueOf(getAmount));
        } else {
            totalSalarySum.setText(totalCal);
        }

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
                    rs.getString(8), rs.getString(12), rs.getString(13)});
            }
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }

    public void setTextFromTable() {
        DefaultTableModel model = (DefaultTableModel) allempTable.getModel();
        int selectrowindex = allempTable.getSelectedRow();
        empId.setText(model.getValueAt(selectrowindex, 1).toString());
        empFname.setText(model.getValueAt(selectrowindex, 2).toString());
      empLname.setText(model.getValueAt(selectrowindex, 3).toString());
        dept.setText(model.getValueAt(selectrowindex, 0).toString());
        getPhone.setText(model.getValueAt(selectrowindex, 4).toString());
        getMail.setText(model.getValueAt(selectrowindex, 5).toString());
        getBankName.setText(model.getValueAt(selectrowindex, 6).toString());
        getBankAccount.setText(model.getValueAt(selectrowindex, 7).toString());
    }
    public void searchemployee(){
    DefaultTableModel ob=(DefaultTableModel) allempTable.getModel();
        TableRowSorter<DefaultTableModel>obj=new TableRowSorter<>(ob);
        allempTable.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchempl.getText()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        empId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dept = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        months = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        getBankName = new javax.swing.JTextField();
        getBankAccount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        empFname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        allempTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        getPhone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        getMail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        mainSalary = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bonus = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        totalSalarySum = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        sentPayroll = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        searchempl = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        trans_Id = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        empLname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salary Window");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        jLabel1.setText("Salary Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Employe Id");

        jLabel3.setText("Dept");

        jLabel4.setText("Salary of Months");

        months.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jLabel5.setText("Bank Name");

        jLabel6.setText("Account Number ");

        jLabel7.setText("First Name");

        allempTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Dept", "EmpId", "Fist Name", "Last Name", "Phone", "Email", "Bank", "Account Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, true
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

        jLabel9.setText("Phone Number");

        jLabel10.setText("Email");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Amount");

        mainSalary.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mainSalaryFocusGained(evt);
            }
        });
        mainSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mainSalaryKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mainSalaryKeyReleased(evt);
            }
        });

        jLabel11.setText("Bonus");

        bonus.setText("0");
        bonus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bonusFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bonusFocusLost(evt);
            }
        });
        bonus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bonusKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bonusKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bonusKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Kinnari", 0, 10)); // NOI18N
        jLabel12.setText("TK");

        jLabel13.setFont(new java.awt.Font("Kinnari", 0, 10)); // NOI18N
        jLabel13.setText("TK");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Likhan", 3, 15)); // NOI18N
        jLabel14.setText("Totals Salary");

        jLabel15.setFont(new java.awt.Font("Khmer OS System", 0, 10)); // NOI18N
        jLabel15.setText("(BDT)");

        jLabel16.setFont(new java.awt.Font("Kinnari", 0, 10)); // NOI18N
        jLabel16.setText("TK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mainSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(bonus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(totalSalarySum, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(bonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(totalSalarySum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sentPayroll.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        sentPayroll.setText("Sent Salary");
        sentPayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sentPayrollActionPerformed(evt);
            }
        });

        jLabel17.setText("Search");

        searchempl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchemplActionPerformed(evt);
            }
        });
        searchempl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchemplKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchemplKeyReleased(evt);
            }
        });

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel18.setText("Transaction Id");

        trans_Id.setFocusable(false);

        jLabel20.setText("Last Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(126, 126, 126)
                                    .addComponent(months, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel3))
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(getBankName)
                                        .addComponent(dept)
                                        .addComponent(getMail)
                                        .addComponent(empId)
                                        .addComponent(empFname)
                                        .addComponent(getPhone)
                                        .addComponent(empLname, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel18))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(getBankAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addComponent(trans_Id)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)))
                            .addComponent(jLabel20)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(sentPayroll)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(searchempl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel17))
                                .addGap(152, 152, 152)
                                .addComponent(jButton1)
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(empId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(empLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(getPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(getMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(getBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(trans_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(getBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(months, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchempl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel17))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sentPayroll)))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sentPayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentPayrollActionPerformed
        // TODO add your handling code here:
        String getMonths = months.getSelectedItem().toString();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empmange", "vatiza", "admin");
            String sql = "INSERT INTO salary VALUES (?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, empId.getText());
            stmt.setString(2, getMonths);
            stmt.setInt(3, Integer.parseInt(mainSalary.getText()));
            stmt.setInt(4, Integer.parseInt(bonus.getText()));
            stmt.setInt(5, Integer.parseInt(totalSalarySum.getText()));
            stmt.setString(6,dept.getText());
            stmt.setString(7,getBankName.getText());
            stmt.setInt(8,Integer.parseInt(getBankAccount.getText()));
            stmt.setString(9,trans_Id.getText());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salary Successfully sent");
            con.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Someting Wrong!");
        }
    }//GEN-LAST:event_sentPayrollActionPerformed

    private void searchemplKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchemplKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_searchemplKeyPressed

    private void searchemplKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchemplKeyReleased
        // TODO add your handling code here:
          searchemployee();
    }//GEN-LAST:event_searchemplKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchemplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchemplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchemplActionPerformed

    private void mainSalaryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mainSalaryFocusGained
        // TODO add your handling code here:
         Random random = new Random();
        long randomNumber = random.nextLong() % 1000000000000L + 1000000000000L;
        trans_Id.setText(Long.toString(randomNumber));
    }//GEN-LAST:event_mainSalaryFocusGained

    private void allempTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_allempTableMouseClicked
        // TODO add your handling code here:
        setTextFromTable();

    }// GEN-LAST:event_allempTableMouseClicked

    private void bonusKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_bonusKeyPressed

    }// GEN-LAST:event_bonusKeyPressed

    private void mainSalaryKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_mainSalaryKeyPressed
        // TODO add your handling code here:
    }// GEN-LAST:event_mainSalaryKeyPressed

    private void bonusKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_bonusKeyTyped
        // TODO add your handling code here:
    }// GEN-LAST:event_bonusKeyTyped

    private void bonusKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_bonusKeyReleased
        // TODO add your handling code here:
        totalSalaryCal();
    }// GEN-LAST:event_bonusKeyReleased

    private void mainSalaryKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_mainSalaryKeyReleased
        // TODO add your handling code here:
        totalSalaryCal();
    }// GEN-LAST:event_mainSalaryKeyReleased

    private void bonusFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_bonusFocusGained

        bonus.setText("");
    }// GEN-LAST:event_bonusFocusGained

    private void bonusFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_bonusFocusLost
        // int getValue=Integer.parseInt(bonus.getText());
        if (bonus.getText().length() == 0) {
            bonus.setText("0");
        } // TODO add your handling code here:
    }// GEN-LAST:event_bonusFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allempTable;
    private javax.swing.JTextField bonus;
    private javax.swing.JTextField dept;
    private javax.swing.JTextField empFname;
    private javax.swing.JTextField empId;
    private javax.swing.JTextField empLname;
    private javax.swing.JTextField getBankAccount;
    private javax.swing.JTextField getBankName;
    private javax.swing.JTextField getMail;
    private javax.swing.JTextField getPhone;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mainSalary;
    private javax.swing.JComboBox<String> months;
    private javax.swing.JTextField searchempl;
    private javax.swing.JButton sentPayroll;
    private javax.swing.JTextField totalSalarySum;
    private javax.swing.JTextField trans_Id;
    // End of variables declaration//GEN-END:variables
}
