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
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products() {
        initComponents();
        SelectProduct();
        GetCategory();
    }
    
    //database connection
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    //product read
    public void SelectProduct(){
        try{
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/supermarketDB", "User_1", "1234");
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM User_1.PRODUCTS");
            proList_tbl.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void GetCategory(){
        try{
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/supermarketDB", "User_1", "1234");
            st = conn.createStatement();
            String Query = "SELECT * FROM User_1.CATEGORIES";
            rs = st.executeQuery(Query);
            while(rs.next()){
                String cat = rs.getString("CATNAME");
                proCat_Cbox.addItem(cat);
            }
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
        proList_tbl = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        close_btn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        proCat_Cbox = new javax.swing.JComboBox<>();
        proName_txt = new javax.swing.JTextField();
        proID_txt = new javax.swing.JTextField();
        proQty_txt = new javax.swing.JTextField();
        proPrice_txt = new javax.swing.JTextField();
        add_btn = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        delete_btn = new javax.swing.JButton();
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

        proList_tbl.setBackground(new java.awt.Color(154, 161, 166));
        proList_tbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        proList_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        ));
        proList_tbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        proList_tbl.setRowHeight(25);
        proList_tbl.setSelectionBackground(new java.awt.Color(87, 145, 179));
        proList_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proList_tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(proList_tbl);

        jLabel8.setBackground(new java.awt.Color(255, 0, 0));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(87, 145, 179));
        jLabel8.setText("PRODUCTS LIST");

        close_btn.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        close_btn.setForeground(new java.awt.Color(0, 51, 255));
        close_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\OOP Project\\Icons\\close-box.png")); // NOI18N
        close_btn.setToolTipText("");
        close_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_btnMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(87, 145, 179));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("PRODUCT ID :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("NAME          :");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("QUANTITY :");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("PRICE       :");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("CATEGORY :");

        proCat_Cbox.setBackground(new java.awt.Color(51, 51, 51));
        proCat_Cbox.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        proCat_Cbox.setForeground(new java.awt.Color(87, 145, 179));
        proCat_Cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "Vegetable", "Meat" }));
        proCat_Cbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proCat_CboxActionPerformed(evt);
            }
        });

        proName_txt.setBackground(new java.awt.Color(87, 145, 179));
        proName_txt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        proName_txt.setForeground(new java.awt.Color(255, 255, 255));
        proName_txt.setBorder(null);
        proName_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proName_txtActionPerformed(evt);
            }
        });

        proID_txt.setBackground(new java.awt.Color(87, 145, 179));
        proID_txt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        proID_txt.setForeground(new java.awt.Color(255, 255, 255));
        proID_txt.setBorder(null);
        proID_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proID_txtActionPerformed(evt);
            }
        });

        proQty_txt.setBackground(new java.awt.Color(87, 145, 179));
        proQty_txt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        proQty_txt.setForeground(new java.awt.Color(255, 255, 255));
        proQty_txt.setBorder(null);

        proPrice_txt.setBackground(new java.awt.Color(87, 145, 179));
        proPrice_txt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        proPrice_txt.setForeground(new java.awt.Color(255, 255, 255));
        proPrice_txt.setBorder(null);

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
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
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
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
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

        jSeparator5.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator5.setForeground(new java.awt.Color(51, 51, 51));

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator6.setForeground(new java.awt.Color(51, 51, 51));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(proID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(proCat_Cbox, 0, 250, Short.MAX_VALUE)
                                        .addComponent(proName_txt))
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(proQty_txt)
                                .addComponent(proPrice_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clear_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(proID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(proName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proQty_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proPrice_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proCat_Cbox))
                .addGap(45, 45, 45))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addGap(62, 62, 62))
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
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(87, 145, 179));

        jLabel9.setBackground(new java.awt.Color(255, 0, 0));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PRODUCTS");

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
                        .addGap(0, 107, Short.MAX_VALUE)))
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
                .addGap(38, 38, 38))
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

    private void proList_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proList_tblMouseClicked
        //product select
        DefaultTableModel model = (DefaultTableModel)proList_tbl.getModel();
        int Index = proList_tbl.getSelectedRow();
        proID_txt.setText(model.getValueAt(Index, 0).toString());
        proName_txt.setText(model.getValueAt(Index, 1).toString());
        proQty_txt.setText(model.getValueAt(Index, 2).toString());
        proPrice_txt.setText(model.getValueAt(Index, 3).toString());
        proCat_Cbox.setSelectedItem(model.getValueAt(Index, 4).toString());
    }//GEN-LAST:event_proList_tblMouseClicked

    private void back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseClicked
        //navigate to admin menu
        new AdminMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnMouseClicked

    private void close_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseClicked
        //close button
        System.exit(0);
    }//GEN-LAST:event_close_btnMouseClicked

    private void clear_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_btnMouseClicked
        //fields clear
        proID_txt.setText("");
        proName_txt.setText("");
        proQty_txt.setText("");
        proPrice_txt.setText("");
    }//GEN-LAST:event_clear_btnMouseClicked

    private void edit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_btnMouseClicked
        //product edit

        if(proID_txt.getText().isEmpty()||proName_txt.getText().isEmpty()||proQty_txt.getText().isEmpty()||proPrice_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Fields cannot be EMPTY!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/supermarketDB", "User_1", "1234");
                String Query = "UPDATE User_1.PRODUCTS SET PRONAME='"+proName_txt.getText()+"'"+",PROQTY="+proQty_txt.getText()+""+",PROPRICE="+proPrice_txt.getText()+""+",PROCAT='"+proCat_Cbox.getSelectedItem().toString()+"'"+"WHERE PROID="+proID_txt.getText();
                Statement EDIT = conn.createStatement();
                EDIT.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Product Updated Successfully!");
                SelectProduct();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_edit_btnMouseClicked

    private void delete_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseClicked
        //product delete
        if(proID_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Select a product to DELETE!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/supermarketDB", "User_1", "1234");
                String PID = proID_txt.getText();
                String Query = "DELETE FROM User_1.PRODUCTS WHERE PROID=" + PID;
                Statement DEL = conn.createStatement();
                DEL.executeUpdate(Query);
                SelectProduct();
                JOptionPane.showMessageDialog(this, "Product Deleted Successfully!");
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_delete_btnMouseClicked

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_btnActionPerformed

    private void add_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMouseClicked
        //product add
        if(proID_txt.getText().isEmpty()||proName_txt.getText().isEmpty()||proQty_txt.getText().isEmpty()||proPrice_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Fields cannot be EMPTY!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/supermarketDB", "User_1", "1234");
                PreparedStatement ADD = conn.prepareStatement("INSERT INTO PRODUCTS VALUES (?,?,?,?,?)");
                ADD.setInt(1, Integer.valueOf(proID_txt.getText()));
                ADD.setString(2, proName_txt.getText());
                ADD.setString(3, proQty_txt.getText());
                ADD.setString(4, proPrice_txt.getText());
                ADD.setString(5, proCat_Cbox.getSelectedItem().toString());
                int row = ADD.executeUpdate();
                JOptionPane.showMessageDialog(this, "Product added successfully!");
                conn.close();
                SelectProduct();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_add_btnMouseClicked

    private void proID_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proID_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proID_txtActionPerformed

    private void proName_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proName_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proName_txtActionPerformed

    private void proCat_CboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proCat_CboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proCat_CboxActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JComboBox<String> proCat_Cbox;
    private javax.swing.JTextField proID_txt;
    private javax.swing.JTable proList_tbl;
    private javax.swing.JTextField proName_txt;
    private javax.swing.JTextField proPrice_txt;
    private javax.swing.JTextField proQty_txt;
    // End of variables declaration//GEN-END:variables
}
