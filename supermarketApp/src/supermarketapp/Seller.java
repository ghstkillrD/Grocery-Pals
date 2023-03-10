/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarketapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ASUS
 */
public class Seller extends javax.swing.JFrame {

    /**
     * Creates new form seller
     */
    public Seller() {
        initComponents();
        SelectSeller();
    }

    //database connection
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    //seller read
    public void SelectSeller(){
        try{
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/supermarketDB", "User_1", "1234");
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM User_1.SELLER");
            selList_tbl.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception ex){
            ex.printStackTrace();
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        selList_tbl = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        close_btn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        selSex_Cbox = new javax.swing.JComboBox<>();
        selName_txt = new javax.swing.JTextField();
        selID_txt = new javax.swing.JTextField();
        selPass_txt = new javax.swing.JTextField();
        add_btn = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        back_btn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        selList_tbl.setBackground(new java.awt.Color(154, 161, 166));
        selList_tbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        selList_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "PASSWORD", "GENDER"
            }
        ));
        selList_tbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        selList_tbl.setRowHeight(25);
        selList_tbl.setSelectionBackground(new java.awt.Color(87, 145, 179));
        selList_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selList_tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(selList_tbl);

        jLabel8.setBackground(new java.awt.Color(255, 0, 0));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(87, 145, 179));
        jLabel8.setText("SELLERS LIST");

        close_btn.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        close_btn.setForeground(new java.awt.Color(0, 51, 255));
        close_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\OOP Project\\Icons\\close-box.png")); // NOI18N
        close_btn.setToolTipText("");
        close_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_btnMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(87, 145, 179));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("SELLER ID   :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("NAME           :");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("PASSWORD :");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("GENDER      :");

        selSex_Cbox.setBackground(new java.awt.Color(51, 51, 51));
        selSex_Cbox.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        selSex_Cbox.setForeground(new java.awt.Color(87, 145, 179));
        selSex_Cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        selSex_Cbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selSex_CboxActionPerformed(evt);
            }
        });

        selName_txt.setBackground(new java.awt.Color(87, 145, 179));
        selName_txt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        selName_txt.setForeground(new java.awt.Color(255, 255, 255));
        selName_txt.setBorder(null);
        selName_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selName_txtActionPerformed(evt);
            }
        });

        selID_txt.setBackground(new java.awt.Color(87, 145, 179));
        selID_txt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        selID_txt.setForeground(new java.awt.Color(255, 255, 255));
        selID_txt.setBorder(null);
        selID_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selID_txtActionPerformed(evt);
            }
        });

        selPass_txt.setBackground(new java.awt.Color(87, 145, 179));
        selPass_txt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        selPass_txt.setForeground(new java.awt.Color(255, 255, 255));
        selPass_txt.setBorder(null);

        add_btn.setBackground(new java.awt.Color(51, 51, 51));
        add_btn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        add_btn.setForeground(new java.awt.Color(87, 145, 179));
        add_btn.setText("ADD");
        add_btn.setBorder(null);
        add_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_btnMouseClicked(evt);
            }
        });

        edit_btn.setBackground(new java.awt.Color(51, 51, 51));
        edit_btn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        edit_btn.setForeground(new java.awt.Color(87, 145, 179));
        edit_btn.setText("EDIT");
        edit_btn.setBorder(null);
        edit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_btnMouseClicked(evt);
            }
        });

        delete_btn.setBackground(new java.awt.Color(51, 51, 51));
        delete_btn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(87, 145, 179));
        delete_btn.setText("DELETE");
        delete_btn.setBorder(null);
        delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_btnMouseClicked(evt);
            }
        });
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        clear_btn.setBackground(new java.awt.Color(51, 51, 51));
        clear_btn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        clear_btn.setForeground(new java.awt.Color(87, 145, 179));
        clear_btn.setText("CLEAR");
        clear_btn.setBorder(null);
        clear_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear_btnMouseClicked(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selName_txt)
                            .addComponent(selPass_txt)
                            .addComponent(selSex_Cbox, 0, 300, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(selID_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                .addGap(268, 268, 268)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(selID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(selName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selPass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selSex_Cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\OOP Project\\Icons\\grocerypals_small.png")); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\OOP Project\\Icons\\cart_small.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close_btn)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(close_btn)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14)
                        .addComponent(jLabel10)))
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(87, 145, 179));

        jLabel9.setBackground(new java.awt.Color(255, 0, 0));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SELLERS");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        back_btn.setBackground(new java.awt.Color(255, 0, 0));
        back_btn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\OOP Project\\Icons\\back.png")); // NOI18N
        back_btn.setText("BACK");
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back_btn)
                            .addComponent(jLabel9))
                        .addGap(0, 159, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selID_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selID_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selID_txtActionPerformed

    private void selName_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selName_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selName_txtActionPerformed

    private void selSex_CboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selSex_CboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selSex_CboxActionPerformed

    private void add_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMouseClicked
        //seller add
        if(selID_txt.getText().isEmpty()||selName_txt.getText().isEmpty()||selPass_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Fields cannot be EMPTY!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/supermarketDB", "User_1", "1234");
            PreparedStatement ADD = conn.prepareStatement("INSERT INTO SELLER VALUES (?,?,?,?)");
            ADD.setInt(1, Integer.valueOf(selID_txt.getText()));
            ADD.setString(2, selName_txt.getText());
            ADD.setString(3, selPass_txt.getText());
            ADD.setString(4, selSex_Cbox.getSelectedItem().toString());
            int row = ADD.executeUpdate();
            JOptionPane.showMessageDialog(this, "Seller added successfully!");
            conn.close();
            SelectSeller();
            }catch(Exception ex){
            ex.printStackTrace();
            }
        }       
    }//GEN-LAST:event_add_btnMouseClicked

    private void selList_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selList_tblMouseClicked
        //seller select
        DefaultTableModel model = (DefaultTableModel)selList_tbl.getModel();
        int Index = selList_tbl.getSelectedRow();
        selID_txt.setText(model.getValueAt(Index, 0).toString());
        selName_txt.setText(model.getValueAt(Index, 1).toString());
        selPass_txt.setText(model.getValueAt(Index, 2).toString());
        selSex_Cbox.setSelectedItem(model.getValueAt(Index, 3).toString());
    }//GEN-LAST:event_selList_tblMouseClicked

    private void clear_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_btnMouseClicked
        //fields clear
        selID_txt.setText("");
        selName_txt.setText("");
        selPass_txt.setText(""); 
    }//GEN-LAST:event_clear_btnMouseClicked

    private void delete_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseClicked
        //seller delete
        if(selID_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Select a seller to DELETE!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/supermarketDB", "User_1", "1234");
                String SID = selID_txt.getText();
                String Query = "DELETE FROM User_1.SELLER WHERE SELLERID=" + SID;
                Statement DEL = conn.createStatement();
                DEL.executeUpdate(Query);
                SelectSeller();
                JOptionPane.showMessageDialog(this, "Seller Deleted Successfully!");
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_delete_btnMouseClicked

    private void edit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_btnMouseClicked
        //seller edit
        if(selID_txt.getText().isEmpty()||selName_txt.getText().isEmpty()||selPass_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Fields cannot be EMPTY!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/supermarketDB", "User_1", "1234");
                String Query = "UPDATE User_1.SELLER SET SELLERNAME='"+selName_txt.getText()+"'"+",SELLERPASS='"+selPass_txt.getText()+"'"+",SELLERSEX='"+selSex_Cbox.getSelectedItem().toString()+"'"+"WHERE SELLERID="+selID_txt.getText();
                Statement EDIT = conn.createStatement();
                EDIT.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Seller Updated Successfully!");
                SelectSeller();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }   
    }//GEN-LAST:event_edit_btnMouseClicked

    private void back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseClicked
        //navigate to admin menu
        new AdminMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnMouseClicked

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_btnActionPerformed

    private void close_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseClicked
        //close button
        System.exit(0);
    }//GEN-LAST:event_close_btnMouseClicked

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
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JLabel back_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JLabel close_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton edit_btn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField selID_txt;
    private javax.swing.JTable selList_tbl;
    private javax.swing.JTextField selName_txt;
    private javax.swing.JTextField selPass_txt;
    private javax.swing.JComboBox<String> selSex_Cbox;
    // End of variables declaration//GEN-END:variables
}
