/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamanbarang;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author X441UV
 */
public class MenuFrame extends javax.swing.JFrame {

    private FacadeClass facadeClass;
    
    public MenuFrame() {
        SessionLogin sessionLogin = SessionLogin.getSessionLogin();
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        txtUsername.setText(sessionLogin.getUsername());
    }
    
    private void tampilBarang(){
         facadeClass = new FacadeClass();
        BarangTableModel barang = new BarangTableModel();
        barang.setData(facadeClass.lihatBarang());
        tableBarangBarang.setModel(barang);
    }
    
    private void tampilPenyewaan(){
         facadeClass = new FacadeClass();
        PenyewaanTableModel tabel = new PenyewaanTableModel();
        tabel.setData(facadeClass.lihatPenyewaan());
        tabelPenyewa1.setModel(tabel);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBeranda = new javax.swing.JButton();
        btnPenyewa = new javax.swing.JButton();
        btnBarang = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        headPanel = new javax.swing.JPanel();
        txtUsername = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        monitorPanel = new javax.swing.JPanel();
        berandaPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLaporan = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        penyewaPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnTambahPenyewa1 = new javax.swing.JLabel();
        btnRefreshPenyewa1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelPenyewa1 = new javax.swing.JTable();
        barangPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBarangBarang = new javax.swing.JTable();
        btnTambahBarang = new javax.swing.JLabel();
        btnRefreshBarang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/camera_1.png"))); // NOI18N

        btnBeranda.setBackground(new java.awt.Color(255, 255, 255));
        btnBeranda.setForeground(new java.awt.Color(255, 255, 255));
        btnBeranda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/btnBeranda.png"))); // NOI18N
        btnBeranda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBeranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBerandaActionPerformed(evt);
            }
        });

        btnPenyewa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/btnPenyewa.png"))); // NOI18N
        btnPenyewa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPenyewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenyewaActionPerformed(evt);
            }
        });

        btnBarang.setBackground(new java.awt.Color(255, 255, 255));
        btnBarang.setForeground(new java.awt.Color(255, 255, 255));
        btnBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/btnBarang.png"))); // NOI18N
        btnBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarangActionPerformed(evt);
            }
        });

        btnAbout.setBackground(new java.awt.Color(255, 255, 255));
        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/About Us.png"))); // NOI18N
        btnAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(42, 42, 42))
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPenyewa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(btnBarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnAbout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnBeranda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnBeranda, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnPenyewa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        headPanel.setBackground(new java.awt.Color(255, 255, 255));
        headPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102)));

        txtUsername.setFont(new java.awt.Font("Strike Fighter", 0, 18)); // NOI18N
        txtUsername.setText("Username");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/logoysc.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/boy_2.png"))); // NOI18N

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/error(2).png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(close)
                .addGap(14, 14, 14))
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(headPanelLayout.createSequentialGroup()
                        .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(close))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        monitorPanel.setBackground(new java.awt.Color(255, 255, 255));
        monitorPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102), new java.awt.Color(0, 204, 102)));
        monitorPanel.setLayout(new java.awt.CardLayout());

        berandaPanel.setBackground(new java.awt.Color(255, 255, 255));
        berandaPanel.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Strike Fighter", 0, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/beranda.png"))); // NOI18N
        berandaPanel.add(jLabel6);
        jLabel6.setBounds(21, 21, 168, 54);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/printer(1).png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        berandaPanel.add(jLabel1);
        jLabel1.setBounds(480, 370, 40, 40);

        btnLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/btnCetakLaporan.png"))); // NOI18N
        btnLaporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLaporanMouseClicked(evt);
            }
        });
        berandaPanel.add(btnLaporan);
        btnLaporan.setBounds(440, 410, 117, 50);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/LayoutBeranda.png"))); // NOI18N
        berandaPanel.add(jLabel12);
        jLabel12.setBounds(270, 20, 561, 470);

        monitorPanel.add(berandaPanel, "card2");

        penyewaPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Strike Fighter", 0, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/dataPenyewann.png"))); // NOI18N

        btnTambahPenyewa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/btnTambah.png"))); // NOI18N
        btnTambahPenyewa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambahPenyewa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahPenyewa1MouseClicked(evt);
            }
        });

        btnRefreshPenyewa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/btnRefresh.png"))); // NOI18N
        btnRefreshPenyewa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefreshPenyewa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshPenyewa1MouseClicked(evt);
            }
        });

        tabelPenyewa1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Penyewaan", "ID Penyewa", "Nama Penyewa", "Alamat", "Nomor Kontak", "Tanggal Sewa", "Tanggal Pengembalian", "Tanggal Dikembalikan", "Total Biaya Sewa", "Status", "Penanggung Jawab"
            }
        ));
        tabelPenyewa1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane4.setViewportView(tabelPenyewa1);

        javax.swing.GroupLayout penyewaPanelLayout = new javax.swing.GroupLayout(penyewaPanel);
        penyewaPanel.setLayout(penyewaPanelLayout);
        penyewaPanelLayout.setHorizontalGroup(
            penyewaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penyewaPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(penyewaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penyewaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 544, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(penyewaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTambahPenyewa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefreshPenyewa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69))
        );
        penyewaPanelLayout.setVerticalGroup(
            penyewaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penyewaPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(penyewaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(penyewaPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnTambahPenyewa1)
                        .addGap(28, 28, 28)
                        .addComponent(btnRefreshPenyewa1))
                    .addGroup(penyewaPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        monitorPanel.add(penyewaPanel, "card3");

        barangPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Strike Fighter", 0, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/DataBarang.png"))); // NOI18N

        tableBarangBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Harga Sewa Perhari"
            }
        ));
        jScrollPane1.setViewportView(tableBarangBarang);

        btnTambahBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/btnTambah.png"))); // NOI18N
        btnTambahBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambahBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahBarangMouseClicked(evt);
            }
        });

        btnRefreshBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peminjamanbarang/icon/btnRefresh.png"))); // NOI18N
        btnRefreshBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefreshBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshBarangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout barangPanelLayout = new javax.swing.GroupLayout(barangPanel);
        barangPanel.setLayout(barangPanelLayout);
        barangPanelLayout.setHorizontalGroup(
            barangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barangPanelLayout.createSequentialGroup()
                .addGroup(barangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barangPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
                        .addGap(39, 39, 39))
                    .addGroup(barangPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(barangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefreshBarang)
                    .addComponent(btnTambahBarang))
                .addGap(44, 44, 44))
        );
        barangPanelLayout.setVerticalGroup(
            barangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barangPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(barangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barangPanelLayout.createSequentialGroup()
                        .addComponent(btnTambahBarang)
                        .addGap(28, 28, 28)
                        .addComponent(btnRefreshBarang))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        monitorPanel.add(barangPanel, "card4");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(monitorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monitorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void btnBerandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBerandaActionPerformed
        monitorPanel.removeAll();
        monitorPanel.repaint();
        menuPanel.revalidate();
        
        monitorPanel.add(berandaPanel);
        monitorPanel.repaint();
        monitorPanel.revalidate();
    }//GEN-LAST:event_btnBerandaActionPerformed

    private void btnPenyewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenyewaActionPerformed
        monitorPanel.removeAll();
        monitorPanel.repaint();
        monitorPanel.revalidate();
        
        monitorPanel.add(penyewaPanel);
        monitorPanel.repaint();
        monitorPanel.revalidate();
        
        tampilPenyewaan();
    }//GEN-LAST:event_btnPenyewaActionPerformed

    private void btnBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarangActionPerformed
        monitorPanel.removeAll();
        monitorPanel.repaint();
        monitorPanel.revalidate();
        
        monitorPanel.add(barangPanel);
        monitorPanel.repaint();
        monitorPanel.revalidate();
        
        tampilBarang();
    }//GEN-LAST:event_btnBarangActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
       AboutFrame ab= new AboutFrame();
       ab.setVisible(true);
       tampilBarang();
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnTambahBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahBarangMouseClicked
        // TODO add your handling code here:
        FrameTambahBarang tmbh = new FrameTambahBarang(this, true);
        tmbh.setVisible(true);
       
    }//GEN-LAST:event_btnTambahBarangMouseClicked

    private void btnRefreshBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshBarangMouseClicked
        // TODO add your handling code here:
        tampilBarang();
    }//GEN-LAST:event_btnRefreshBarangMouseClicked

    private void btnTambahPenyewa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahPenyewa1MouseClicked
        // TODO add your handling code here:
        FrameTambahPenyewaan frm = new FrameTambahPenyewaan(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_btnTambahPenyewa1MouseClicked

    private void btnRefreshPenyewa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshPenyewa1MouseClicked
        // TODO add your handling code here:
        tampilPenyewaan();
    }//GEN-LAST:event_btnRefreshPenyewa1MouseClicked

    private void btnLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaporanMouseClicked
      
    
    }//GEN-LAST:event_btnLaporanMouseClicked

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
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barangPanel;
    private javax.swing.JPanel berandaPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnBarang;
    private javax.swing.JButton btnBeranda;
    private javax.swing.JLabel btnLaporan;
    private javax.swing.JButton btnPenyewa;
    private javax.swing.JLabel btnRefreshBarang;
    private javax.swing.JLabel btnRefreshPenyewa1;
    private javax.swing.JLabel btnTambahBarang;
    private javax.swing.JLabel btnTambahPenyewa1;
    private javax.swing.JLabel close;
    private javax.swing.JPanel headPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel monitorPanel;
    private javax.swing.JPanel penyewaPanel;
    private javax.swing.JTable tabelPenyewa1;
    private javax.swing.JTable tableBarangBarang;
    private javax.swing.JLabel txtUsername;
    // End of variables declaration//GEN-END:variables
}
