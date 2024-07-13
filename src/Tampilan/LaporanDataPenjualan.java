/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

import java.io.File;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Ozmond
 */
public class LaporanDataPenjualan extends javax.swing.JInternalFrame {
    JasperReport JasperReport;
    JasperDesign JasperDesign;
    JasperPrint JasperPrint;
    Map<String, Object> param = new HashMap<>();
    private DefaultTableModel data;
    Connection conn;
    Statement stm;
    ResultSet rs;
    /**
     * Creates new form DataPelanggan
     */
    public LaporanDataPenjualan() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI BUI = (BasicInternalFrameUI) this.getUI();
        BUI.setNorthPane(null);
        tabel_karyawan();
        tabel_penjualan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnCetakInvoice = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_penjualan = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cariInvoice = new javax.swing.JTextField();
        btnCari1 = new javax.swing.JButton();
        date1 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        date2 = new com.toedter.calendar.JDateChooser();
        btnCetakPenjualan = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKaryawan = new javax.swing.JTable();
        cariKaryawan = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 60, 66));
        jLabel6.setText("Cetak Laporan Data Penjualan");

        btnCetakInvoice.setBackground(new java.awt.Color(255, 255, 255));
        btnCetakInvoice.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCetakInvoice.setForeground(new java.awt.Color(236, 50, 55));
        btnCetakInvoice.setText("Cetak");
        btnCetakInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakInvoicebtnCariActionPerformed(evt);
            }
        });

        tabel_penjualan.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_penjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_penjualanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_penjualan);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 60, 66));
        jLabel7.setText("Cetak Invoice Pelanggan");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setText("Cari");

        btnCari1.setBackground(new java.awt.Color(255, 255, 255));
        btnCari1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCari1.setForeground(new java.awt.Color(236, 50, 55));
        btnCari1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-search-30 (1).png"))); // NOI18N
        btnCari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCari1btnCariActionPerformed(evt);
            }
        });

        date1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setText("Pilih Periode");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setText("S / D");

        date2.setBackground(new java.awt.Color(255, 255, 255));

        btnCetakPenjualan.setBackground(new java.awt.Color(255, 255, 255));
        btnCetakPenjualan.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCetakPenjualan.setForeground(new java.awt.Color(236, 50, 55));
        btnCetakPenjualan.setText("Cetak");
        btnCetakPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakPenjualanbtnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel12)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cariInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnCari1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCetakInvoice)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCetakPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(47, 47, 47)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(52, 52, 52)
                .addComponent(btnCetakPenjualan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(cariInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCari1)
                    .addComponent(btnCetakInvoice))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 60, 66));
        jLabel5.setText("Cari Data Karyawan");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setText("Cari");

        btnCari.setBackground(new java.awt.Color(255, 255, 255));
        btnCari.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCari.setForeground(new java.awt.Color(236, 50, 55));
        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-search-30 (1).png"))); // NOI18N
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaribtnCariActionPerformed(evt);
            }
        });

        tabelKaryawan.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelKaryawan);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cariKaryawan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(95, 95, 95)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCari)
                    .addComponent(jLabel10)
                    .addComponent(cariKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCaribtnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaribtnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCaribtnCariActionPerformed

    private void btnCetakInvoicebtnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakInvoicebtnCariActionPerformed
        // TODO add your handling code here:
        Connection koneksi;
            param.put("id_transaksi",cariInvoice.getText());
            param.put("nama_karyawan",cariKaryawan.getText());
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/kickerz","root","");
            File file = new File("src/Tampilan/invoice.jrxml");
            JasperDesign = JRXmlLoader.load(file);
            JasperReport = JasperCompileManager.compileReport(JasperDesign);
            JasperPrint = JasperFillManager.fillReport(JasperReport,param,koneksi);
            JasperViewer.viewReport(JasperPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnCetakInvoicebtnCariActionPerformed

    private void tabelKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKaryawanMouseClicked
        // TODO add your handling code here:
        int baris = tabelKaryawan.getSelectedRow();
        cariKaryawan.setText(tabelKaryawan.getModel().getValueAt(baris, 1).toString());
    }//GEN-LAST:event_tabelKaryawanMouseClicked

    private void btnCari1btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCari1btnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCari1btnCariActionPerformed

    private void btnCetakPenjualanbtnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakPenjualanbtnCariActionPerformed
        // TODO add your handling code here:
        Connection koneksi;
            HashMap hash = new HashMap(2);
            hash.put("nama_karyawan",cariKaryawan.getText());
            hash.put("date1",date1.getDate());
            hash.put("date2",date2.getDate());
        try{
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/kickerz","root","");
            File file2 = new File("src/Tampilan/reportPenjualan.jrxml");
            JasperDesign = JRXmlLoader.load(file2);
            JasperReport = JasperCompileManager.compileReport(JasperDesign);
            JasperPrint = JasperFillManager.fillReport(JasperReport, hash, koneksi);
            JasperViewer.viewReport(JasperPrint, false);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnCetakPenjualanbtnCariActionPerformed

    private void tabel_penjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_penjualanMouseClicked
        // TODO add your handling code here:
        int baris = tabel_penjualan.getSelectedRow();
        cariInvoice.setText(tabel_penjualan.getModel().getValueAt(baris, 0).toString());
    }//GEN-LAST:event_tabel_penjualanMouseClicked

    public Connection setKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/kickerz","root","");
            stm=conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Koneksi Gagal :" +e);
        }
       return conn; 
    }
    
    public void tabel_karyawan(){
        Object header[]={"ID KARYAWAN","NAMA KARYAWAN","ALAMAT","NO. TELP"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabelKaryawan.setModel(data);
        setKoneksi();
        String sql="SELECT * FROM data_karyawan";
        try {
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next())
            {
                String kolom1=rs.getString("id_karyawan");
                String kolom2=rs.getString("nama_karyawan");
                String kolom3=rs.getString("alamat");
                String kolom4=rs.getString("no_telp");
                
                String kolom[]={kolom1,kolom2,kolom3,kolom4};
                data.addRow(kolom);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Data Gagal Dipanggil"+e);
        }
    }
    
    public void tabel_penjualan(){
        Object header[]={"Id Transaksi","Tgl Transaksi","Id_Pelanggan","Nama Pelanggan","Alamat","No. Telepon","Id Barang","Jenis Baju","Warna","Biaya /Pcs","Jumlah Pesanan","Total Biaya","Pembayaran","Total Bayar","SRC DESAIN"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabel_penjualan.setModel(data);
        setKoneksi();
        String sql="SELECT * FROM data_penjualan";
        try {
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next())
            {
                String kolom1=rs.getString("id_transaksi");
                String kolom2=rs.getString("tgl_transaksi");
                String kolom3=rs.getString("id_pelanggan");
                String kolom4=rs.getString("nama_pelanggan");
                String kolom5=rs.getString("alamat");
                String kolom6=rs.getString("no_telp");
                String kolom7=rs.getString("id_barang");
                String kolom8=rs.getString("jenis_baju");
                String kolom9=rs.getString("warna");
                String kolom10=rs.getString("biaya_persatuan");
                String kolom11=rs.getString("jumlah_pesanan");
                String kolom12=rs.getString("total_biaya");
                String kolom13=rs.getString("pembayaran");
                String kolom14=rs.getString("total_bayar");
                String kolom15=rs.getString("foto_desain");
                
                String kolom[]={kolom1,kolom2,kolom3,kolom4,kolom5,kolom6,kolom7,kolom8,kolom9,kolom10,kolom11,kolom12,kolom13,kolom14,kolom15};
                data.addRow(kolom);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Data Gagal Dipanggil"+e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCari1;
    private javax.swing.JButton btnCetakInvoice;
    private javax.swing.JButton btnCetakPenjualan;
    private javax.swing.JTextField cariInvoice;
    private javax.swing.JTextField cariKaryawan;
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser date2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelKaryawan;
    private javax.swing.JTable tabel_penjualan;
    // End of variables declaration//GEN-END:variables
}
