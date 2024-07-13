/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Ozmond
 */
public class DataSupplier extends javax.swing.JInternalFrame {
    private DefaultTableModel data;
    Connection conn;
    Statement stm;
    ResultSet rs;
    /**
     * Creates new form DataPelanggan
     */
    public DataSupplier() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI BUI = (BasicInternalFrameUI) this.getUI();
        BUI.setNorthPane(null);
        kosong();
        tabel_supplier();
        Tampil_ID();
    }
    
    private void kosong(){
        try {
            ResultSet rs = stm.executeQuery("SELECT * FROM data_supplier ORDER BY id_supplier DESC");

            if (rs.next()) {
                int lastID = Integer.parseInt(rs.getString("id_supplier").substring(3));
                int newID = lastID + 1;
                String AN = String.format("%04d", newID);
                id_supplier.setText("SPL" + AN);
            } else {
                id_supplier.setText("SPL0001");
            }
        } catch (Exception e) {
            id_supplier.setText("SPL0001");
        }
        nama_supplier.setText("");
        alamat.setText("");
        no_telp.setText("");
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id_supplier = new javax.swing.JTextField();
        nama_supplier = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        no_telp = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnInput = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cariData = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_supplier = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 60, 66));
        jLabel2.setText("Data Supplier");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Id Supplier");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Nama Supplier");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Alamat");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("No. Telp");

        id_supplier.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        id_supplier.setEnabled(false);

        nama_supplier.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        alamat.setColumns(20);
        alamat.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        no_telp.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(236, 50, 55));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-edit-30.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnInput.setBackground(new java.awt.Color(255, 255, 255));
        btnInput.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnInput.setForeground(new java.awt.Color(236, 50, 55));
        btnInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-input-30.png"))); // NOI18N
        btnInput.setText("Input");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(236, 50, 55));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-eraser-30.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(236, 50, 55));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-delete-30.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete)
                            .addGap(49, 49, 49)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(45, 45, 45)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nama_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(no_telp, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(id_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nama_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(no_telp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnInput)
                    .addComponent(btnEdit)
                    .addComponent(btnClear))
                .addGap(141, 141, 141))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 60, 66));
        jLabel3.setText("Tabel Data Supplier");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setText("Cari");

        cariData.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        btnCari.setBackground(new java.awt.Color(255, 255, 255));
        btnCari.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCari.setForeground(new java.awt.Color(236, 50, 55));
        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-search-30 (1).png"))); // NOI18N
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        tabel_supplier.setBackground(new java.awt.Color(204, 204, 204));
        tabel_supplier.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_supplierMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_supplier);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cariData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCari)))
                        .addGap(29, 29, 29))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCari)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cariData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
    
    public void tabel_supplier(){
        Object header[]={"ID SUPPLIER","NAMA SUPPLIER","ALAMAT","NO. TELEPON"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabel_supplier.setModel(data);
        setKoneksi();
        String sql="SELECT * FROM data_supplier";
        try {
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next())
            {
                String kolom1=rs.getString("id_supplier");
                String kolom2=rs.getString("nama_supplier");
                String kolom3=rs.getString("alamat");
                String kolom4=rs.getString("no_telp");
                
                String kolom[]={kolom1,kolom2,kolom3,kolom4};
                data.addRow(kolom);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Data Gagal Dipanggil"+e);
        }
    }
    
    public void Tampil_ID(){
        try {
            ResultSet rs = stm.executeQuery("SELECT * FROM data_supplier ORDER BY id_supplier DESC");

            if (rs.next()) {
                int lastID = Integer.parseInt(rs.getString("id_supplier").substring(3));
                int newID = lastID + 1;
                String AN = String.format("%04d", newID);
                id_supplier.setText("SPL" + AN);
            } else {
                id_supplier.setText("SPL0001");
            }
        } catch (Exception e) {
            id_supplier.setText("SPL0001");
        }
    }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        kosong();
        tabel_supplier();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        // TODO add your handling code here:
        String sql = "INSERT into data_supplier values (?,?,?,?)";
            try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, id_supplier.getText());
            stat.setString(2, nama_supplier.getText());
            stat.setString(3, alamat.getText());
            stat.setString(4, no_telp.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Data Akan Disimpan");
            kosong();
            id_supplier.requestFocus();
            tabel_supplier();
            }
            catch (SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Data Gagal Disimpan"+e);
            tabel_supplier();
            }
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE data_supplier set "
                    + "id_supplier=?,"
                    + "nama_supplier=?,"
                    + "alamat=?,"
                    + "no_telp=?"
                    + "where id_supplier='"+id_supplier.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, id_supplier.getText());
            stat.setString(2, nama_supplier.getText());
            stat.setString(3, alamat.getText());
            stat.setString(4, no_telp.getText());
    
            stat.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Data Akan Diubah");
            kosong();
            id_supplier.requestFocus();
            }
        catch (SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Data Gagal Diubah"+e);
            }
            tabel_supplier();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(rootPane,"Hapus Data Ini ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
         if (ok==0){
             String sql = "DELETE from data_supplier where id_supplier ='"+id_supplier.getText()+"'";
             try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Data Akan Dihapus Dari Sistem ?");
                kosong();
                id_supplier.requestFocus();
             }
                catch (SQLException e){
                JOptionPane.showMessageDialog(rootPane, "Data Gagal Dihapus"+e);
             }
         tabel_supplier();
         }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tabel_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_supplierMouseClicked
        // TODO add your handling code here:
        int baris = tabel_supplier.getSelectedRow();
        id_supplier.setText(tabel_supplier.getModel().getValueAt(baris, 0).toString());
        nama_supplier.setText(tabel_supplier.getModel().getValueAt(baris, 1).toString());
        alamat.setText(tabel_supplier.getModel().getValueAt(baris, 2).toString());
        no_telp.setText(tabel_supplier.getModel().getValueAt(baris, 3).toString());
    }//GEN-LAST:event_tabel_supplierMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        Object header[]={"ID SUPPLIER","NAMA SUPPLIER","ALAMAT","NO. TELEPON"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabel_supplier.setModel(data);
       
        setKoneksi();
        String sql="SELECT * FROM data_supplier WHERE id_supplier like '%" + cariData.getText() + "%'" 
                +"or nama_supplier like '%" + cariData.getText()+"%'";
       
          try {
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next())
            {
                String kolom1=rs.getString("id_supplier");
                String kolom2=rs.getString("nama_supplier");
                String kolom3=rs.getString("alamat");
                String kolom4=rs.getString("no_telp");
                
                String kolom[]={kolom1,kolom2,kolom3,kolom4};
                data.addRow(kolom);
            }
            kosong();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCariActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnInput;
    private javax.swing.JTextField cariData;
    private javax.swing.JTextField id_supplier;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nama_supplier;
    private javax.swing.JTextField no_telp;
    private javax.swing.JTable tabel_supplier;
    // End of variables declaration//GEN-END:variables
}
