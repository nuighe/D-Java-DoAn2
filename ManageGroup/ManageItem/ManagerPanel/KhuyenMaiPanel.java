/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.ManageGroup.ManageItem.ManagerPanel;

import BUS.BusAccessor.GiamGiaSPBUS;
import BUS.BusAccessor.SanPhamBUS;
import BUS.BusAccessor.VoucherBUS;
import DTO.GiamGiaSP;
import DTO.SanPham;
import DTO.Voucher;
import GUI.ManageGroup.ManageItem.FrameAdd.FrameAdd.GiamGiaSanPhamAdd;
import GUI.ManageGroup.ManageItem.FrameAdd.FrameAdd.VoucherAdd;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.regex.PatternSyntaxException;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ACER, TUANMINH
 */
public class KhuyenMaiPanel extends javax.swing.JPanel {

 
    public KhuyenMaiPanel() {
        FlatLightLaf.setup();
        initComponents();
        init();
        loadAllTable();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtSearchVoucher = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        button2 = new GUI.SaleGroup.LoginGui.Component.Button();
        button3 = new GUI.SaleGroup.LoginGui.Component.Button();
        shape9 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        imagePanel2 = new GUI.ManageGroup.ComponentPanel.ImagePanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSearchProduct = new javax.swing.JTextField();
        button9 = new GUI.SaleGroup.LoginGui.Component.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduct = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbVoucher = new javax.swing.JTable();
        button5 = new GUI.SaleGroup.LoginGui.Component.Button();
        jLabel47 = new javax.swing.JLabel();
        shape10 = new GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape();
        lbMaVoucher = new javax.swing.JLabel();
        lbSoVoucher = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtMota = new javax.swing.JTextArea();
        jLabel59 = new javax.swing.JLabel();
        lbNgayBD = new javax.swing.JLabel();
        lbGiaTriToiThieu = new javax.swing.JLabel();
        lbPtGiam = new javax.swing.JLabel();
        lbLuotSD = new javax.swing.JLabel();
        lbNgayKT = new javax.swing.JLabel();
        lbKMToiDa = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        button6 = new GUI.SaleGroup.LoginGui.Component.Button();
        button7 = new GUI.SaleGroup.LoginGui.Component.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(42, 148, 208));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/info.png"))); // NOI18N
        jLabel45.setText("Thông tin chi tiết");
        add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 520, 30));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(42, 148, 208));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel46.setText("Danh sách voucher");
        add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 210, 40));

        txtSearchVoucher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearchVoucher.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSearchVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchVoucherActionPerformed(evt);
            }
        });
        add(txtSearchVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 250, 30));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(42, 148, 208));
        jLabel80.setText("QUẢN LÝ KHUYẾN MÃI");
        add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 50));

        jPanel4.setBackground(new java.awt.Color(42, 148, 208));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 10, 30));

        button2.setBackground(new java.awt.Color(0, 150, 200));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("+THÊM KHUYẾN MÃI");
        button2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 160, 30));

        button3.setBackground(new java.awt.Color(0, 150, 200));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("SEARCH");
        button3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, 100, 30));

        shape9.setBackground(new java.awt.Color(0, 150, 200));
        shape9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setBackground(new java.awt.Color(0, 0, 0));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("TÊN SẢN PHẨM");
        shape9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 230, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Số khuyến mãi");
        shape9.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 180, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Ngày kết thúc :");
        shape9.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 120, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Giá gốc :");
        shape9.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 100, -1));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        shape9.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 156, 122, -1));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("% Giảm :");
        shape9.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 70, -1));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Giá khuyến mãi:");
        shape9.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 120, -1));

        imagePanel2.setBackground(new java.awt.Color(0, 150, 200));
        imagePanel2.setImage(new javax.swing.ImageIcon(getClass().getResource("/Assets/Image/no-product.png"))); // NOI18N

        javax.swing.GroupLayout imagePanel2Layout = new javax.swing.GroupLayout(imagePanel2);
        imagePanel2.setLayout(imagePanel2Layout);
        imagePanel2Layout.setHorizontalGroup(
            imagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        imagePanel2Layout.setVerticalGroup(
            imagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        shape9.add(imagePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 160, 140));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 86, 125));
        shape9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 110, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(17, 86, 125));
        shape9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 110, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(17, 86, 125));
        shape9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 110, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(17, 86, 125));
        shape9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 110, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 86, 125));
        shape9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 110, 20));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Ngày bắt đầu :");
        shape9.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        shape9.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        add(shape9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 520, 240));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(42, 148, 208));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Danh sách giảm giá sản phẩm");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 300, 40));

        txtSearchProduct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearchProduct.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchProductActionPerformed(evt);
            }
        });
        add(txtSearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 250, 30));

        button9.setBackground(new java.awt.Color(0, 150, 200));
        button9.setForeground(new java.awt.Color(255, 255, 255));
        button9.setText("SEARCH");
        button9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        add(button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 470, 100, 30));

        tbProduct.setBackground(new java.awt.Color(0, 150, 200));
        tbProduct.setForeground(new java.awt.Color(255, 255, 255));
        tbProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Giảm", "Mã SP", "% Giảm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProduct.setSelectionBackground(new java.awt.Color(224, 224, 224));
        tbProduct.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbProduct.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProduct);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 370, 210));

        tbVoucher.setBackground(new java.awt.Color(0, 150, 200));
        tbVoucher.setForeground(new java.awt.Color(255, 255, 255));
        tbVoucher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số voucher", "Mã voucher", "% Giảm", "Số lượng"
            }
        ));
        tbVoucher.setSelectionBackground(new java.awt.Color(224, 224, 224));
        tbVoucher.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbVoucher.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVoucherMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbVoucher);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 370, 220));

        button5.setBackground(new java.awt.Color(0, 150, 200));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("Refresh");
        button5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 90, 30));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(42, 148, 208));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/info.png"))); // NOI18N
        jLabel47.setText("Thông tin chi tiết");
        add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 520, 30));

        shape10.setBackground(new java.awt.Color(0, 150, 200));
        shape10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbMaVoucher.setBackground(new java.awt.Color(0, 0, 0));
        lbMaVoucher.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMaVoucher.setForeground(new java.awt.Color(255, 255, 255));
        lbMaVoucher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMaVoucher.setText("MÃ VOUCHER");
        shape10.add(lbMaVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 180, -1));

        lbSoVoucher.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbSoVoucher.setForeground(new java.awt.Color(255, 255, 255));
        lbSoVoucher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSoVoucher.setText("Số voucher");
        shape10.add(lbSoVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 180, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Ngày bắt đầu :");
        shape10.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 100, -1));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Ngày kết thúc :");
        shape10.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 120, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Giá trị tối thiểu :");
        shape10.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 120, -1));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        shape10.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 156, 122, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Khuyến mãi tối đa :");
        shape10.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 140, -1));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("% Giảm :");
        shape10.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 70, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Mô tả");
        shape10.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, -1));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        shape10.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        txtMota.setEditable(false);
        txtMota.setBackground(new java.awt.Color(255, 255, 255));
        txtMota.setColumns(20);
        txtMota.setLineWrap(true);
        txtMota.setRows(5);
        jScrollPane7.setViewportView(txtMota);

        shape10.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, -1));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Số lượt sử dụng:");
        shape10.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 120, -1));

        lbNgayBD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNgayBD.setForeground(new java.awt.Color(17, 86, 125));
        shape10.add(lbNgayBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 100, 20));

        lbGiaTriToiThieu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbGiaTriToiThieu.setForeground(new java.awt.Color(17, 86, 125));
        shape10.add(lbGiaTriToiThieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 100, 20));

        lbPtGiam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbPtGiam.setForeground(new java.awt.Color(17, 86, 125));
        shape10.add(lbPtGiam, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 100, 20));

        lbLuotSD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbLuotSD.setForeground(new java.awt.Color(17, 86, 125));
        shape10.add(lbLuotSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 100, 20));

        lbNgayKT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNgayKT.setForeground(new java.awt.Color(17, 86, 125));
        shape10.add(lbNgayKT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 100, 20));

        lbKMToiDa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbKMToiDa.setForeground(new java.awt.Color(17, 86, 125));
        shape10.add(lbKMToiDa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 100, 20));

        add(shape10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 520, 240));
        add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 50, 750));

        button6.setBackground(new java.awt.Color(0, 150, 200));
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("+THÊM VOUCHER");
        button6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 160, 30));

        button7.setBackground(new java.awt.Color(0, 150, 200));
        button7.setForeground(new java.awt.Color(255, 255, 255));
        button7.setText("Refresh");
        button7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 90, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchVoucherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchVoucherActionPerformed

    private void txtSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchProductActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        String text = this.txtSearchVoucher.getText();
        if(text.length() == 0){
            JOptionPane.showConfirmDialog(this, "Vui lòng nhập thông tin vào ô tìm kiếm", "Nhắc nhở nhẹ", JOptionPane.CLOSED_OPTION);
        }else{
            try{
            this.sorterVoucher.setRowFilter(RowFilter.regexFilter(text));
            }catch(PatternSyntaxException ex){
                System.out.println("Bad regex!");

            }
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void tbProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductMouseClicked
        // TODO add your handling code here:
        int row = tbProduct.getSelectedRow();
        this.sp = sanPhamBus.get(Integer.valueOf(tbProduct.getValueAt(row, 1) + ""));
        this.giamGiaSP = giamGiaSPBus.get(Integer.valueOf(tbProduct.getValueAt(row, 0) + ""));
        this.pushDataToGuiDiscountProduct(sp, giamGiaSP);
    }//GEN-LAST:event_tbProductMouseClicked

    private void tbVoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVoucherMouseClicked
        // TODO add your handling code here:
        int row = tbVoucher.getSelectedRow();
        this.voucher = voucherBus.get(tbVoucher.getValueAt(row, 1) + "");
        this.pushDataToGuiVoucher(voucher);
    }//GEN-LAST:event_tbVoucherMouseClicked

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
        String text = this.txtSearchProduct.getText();
                
        if(text.length() == 0){
            JOptionPane.showConfirmDialog(this, "Vui lòng nhập thông tin vào ô tìm kiếm", "Nhắc nhở nhẹ", JOptionPane.CLOSED_OPTION);
        }else{
            try{
            this.sorterProduct.setRowFilter(RowFilter.regexFilter(text));
            }catch(PatternSyntaxException ex){
                System.out.println("Bad regex!");

            }
        }
    }//GEN-LAST:event_button9ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        this.loadDataTableDiscountProduct();
    }//GEN-LAST:event_button5ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
        this.loadDataTableVoucher();
    }//GEN-LAST:event_button7ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
        new VoucherAdd("<html>THÊM VOUCHER","" , true).setVisible(true);
        
    }//GEN-LAST:event_button6ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        new GiamGiaSanPhamAdd("<html>THÊM GIẢM GIÁ SẢN PHẨM", 0, true).setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.SaleGroup.LoginGui.Component.Button button2;
    private GUI.SaleGroup.LoginGui.Component.Button button3;
    private GUI.SaleGroup.LoginGui.Component.Button button5;
    private GUI.SaleGroup.LoginGui.Component.Button button6;
    private GUI.SaleGroup.LoginGui.Component.Button button7;
    private GUI.SaleGroup.LoginGui.Component.Button button9;
    private javax.swing.Box.Filler filler1;
    private GUI.ManageGroup.ComponentPanel.ImagePanel imagePanel2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lbGiaTriToiThieu;
    private javax.swing.JLabel lbKMToiDa;
    private javax.swing.JLabel lbLuotSD;
    private javax.swing.JLabel lbMaVoucher;
    private javax.swing.JLabel lbNgayBD;
    private javax.swing.JLabel lbNgayKT;
    private javax.swing.JLabel lbPtGiam;
    private javax.swing.JLabel lbSoVoucher;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape10;
    private GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd.Shape shape9;
    private javax.swing.JTable tbProduct;
    private javax.swing.JTable tbVoucher;
    private javax.swing.JTextArea txtMota;
    private javax.swing.JTextField txtSearchProduct;
    private javax.swing.JTextField txtSearchVoucher;
    // End of variables declaration//GEN-END:variables
    private TableModel model;
    private TableRowSorter<TableModel> sorterVoucher, sorterProduct;
    private final VoucherBUS voucherBus = new VoucherBUS();
    private final GiamGiaSPBUS giamGiaSPBus = new GiamGiaSPBUS();
    private final SanPhamBUS sanPhamBus = new SanPhamBUS();
    private Voucher voucher;
    private SanPham sp;
    private GiamGiaSP giamGiaSP;
    private final SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");


    public void loadDataTableVoucher(){
        String[] voucherHeader = new String[]{"Số voucher", "Mã voucher", "% Giảm", "Số lượng"};
        this.model = new DefaultTableModel(voucherBus.convertToStringList(), voucherHeader);
        sorterVoucher = new TableRowSorter<TableModel>(model);
        tbVoucher.setModel(model);
        tbVoucher.setRowSorter(sorterVoucher);

    }
    
    public void loadDataTableDiscountProduct(){
        String[] productHeader = new String[]{"Mã Giảm", "Mã SP", "% Giảm"};
        this.model = new DefaultTableModel(giamGiaSPBus.convertToStringList(), productHeader);
        sorterProduct = new TableRowSorter<TableModel>(model);
        tbProduct.setModel(model);
        tbProduct.setRowSorter(sorterProduct);

    }
    
    public void loadAllTable(){
        loadDataTableVoucher();
        loadDataTableDiscountProduct();
    }
    
    public void init(){
        //popUp menu cho table giảm giá sản phẩm
        JPopupMenu popUp1 = new JPopupMenu();
        JMenuItem item11 = new JMenuItem("Xem/Sửa khuyến mãi sản phẩm");
        item11.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tbProduct.getSelectedRowCount() != 0){
                    int row = tbProduct.getSelectedRow();
                    int maKM = Integer.parseInt((String) tbProduct.getValueAt(row, 0));
                    System.out.println("Mã giảm: " + maKM);
                    new GiamGiaSanPhamAdd("<html>SỬA GIẢM GIÁ SẢN PHẨM", maKM, false).setVisible(true);
                }else{
                    JOptionPane.showConfirmDialog(tbProduct, "Vui lòng chọn 1 phiếu để sửa!!!","Cảnh báo",JOptionPane.CLOSED_OPTION);
                }
            }
            
        });
        JMenuItem item12 = new JMenuItem("Xóa");
        item12.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tbProduct.getSelectedRowCount() != 0){
                    int[] rows = tbProduct.getSelectedRows();
                    int maKM;
                    for(int ma : rows){
                        maKM = Integer.parseInt((String) tbProduct.getValueAt(ma, 0));
                        System.out.println("Removed discount product: " + maKM);
                        giamGiaSPBus.remove(maKM);
                    }
                    loadDataTableDiscountProduct();
                }else{
                    JOptionPane.showConfirmDialog(tbProduct, "Vui lòng chọn 1 phiếu để xóa!!!","Cảnh báo",JOptionPane.CLOSED_OPTION);
                }
            }
            
        });
        popUp1.add(item11);
        popUp1.add(item12);
        tbProduct.setComponentPopupMenu(popUp1);
        
        //popUp menu cho table voucher
        JPopupMenu popUp2 = new JPopupMenu();
        JMenuItem item21 = new JMenuItem("Xem/Sửa thông tin Voucher");
        JMenuItem item22 = new JMenuItem("Xóa");
        item21.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tbVoucher.getSelectedRowCount()!= 0){
                    int row = tbVoucher.getSelectedRow();
                    String maVoucher = (String) tbVoucher.getValueAt(row, 1);
                    new VoucherAdd("<html>SỬA THÔNG TIN VOUCHER", maVoucher, false).setVisible(true);
                }else{
                    JOptionPane.showConfirmDialog(tbVoucher, "Vui lòng chọn 1 voucher để sửa!!!","Cảnh báo",JOptionPane.CLOSED_OPTION);
                }
            }
            
        });
        item22.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tbVoucher.getSelectedRowCount()!= 0){
                    int[] rows = tbVoucher.getSelectedRows();
                    String maVoucher;
                    for(int ma : rows){
                        maVoucher = (String) tbVoucher.getValueAt(ma, 1);
                        voucherBus.remove(maVoucher);
                        System.out.println("Removed voucher: " + maVoucher);
                    }
                    loadDataTableVoucher();
                }else{
                    JOptionPane.showConfirmDialog(tbVoucher, "Vui lòng chọn 1 voucher để xóa!!!","Cảnh báo",JOptionPane.CLOSED_OPTION);
                }
            }
            
        });
        popUp2.add(item21);
        popUp2.add(item22);
        tbVoucher.setComponentPopupMenu(popUp2);
    }
    
   
    public void pushDataToGuiVoucher(Voucher voucher){
        this.lbNgayBD.setText(df.format(voucher.getNgayBD()));
        this.lbGiaTriToiThieu.setText(voucher.getGiaTriToiThieu()+"");
        this.lbPtGiam.setText(voucher.getPtGiam()+"%");
        this.lbLuotSD.setText(voucher.getSoLuotSD()+"");
        this.lbKMToiDa.setText(voucher.getKmToiDa()+"");
        this.lbNgayKT.setText(df.format(voucher.getNgayKT()));
        this.lbSoVoucher.setText("Số voucher: " + voucher.getSoVoucher());
        this.lbMaVoucher.setText("" + voucher.getMaVoucher()+"");
        this.txtMota.setText(voucher.getMoTa());
    }
    
    public void pushDataToGuiDiscountProduct(SanPham sp, GiamGiaSP giamGiaSP ){
        this.jLabel38.setText("Số khuyến mãi: "+ giamGiaSP.getSoPhieu());
        this.jLabel37.setText("<html>" + sp.getTenSP().toUpperCase());
        this.jLabel10.setText(df.format(giamGiaSP.getNgayBD())+"");
        this.jLabel9.setText(sp.getGiaTien()+"");
        this.jLabel11.setText(giamGiaSP.getPtGiam()+"%");
        this.jLabel12.setText((double) sp.getGiaTien()*(100 - giamGiaSP.getPtGiam())/100+"");
        this.jLabel13.setText(df.format(giamGiaSP.getNgayKT())+"");
        this.imagePanel2.setPath(sp.getHinhAnh());
    }
    
    
    public static void main(String[] argv){
        JFrame f = new JFrame();
        KhuyenMaiPanel km = new KhuyenMaiPanel();
        f.add(km);
        f.setLayout(new FlowLayout());
        f.setSize(1100,800);
        f.setVisible(true);
        f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
    }
}
