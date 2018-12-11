/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasDatabase;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mesita Unyu
 */
public class FormUtama extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    private Connection connection;
    /**
     * Creates new form FormUtama
     */
    public FormUtama() {
        initComponents();
        initTable();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnim = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelbio = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtfakultas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtjurusan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbjk = new javax.swing.JComboBox();
        cmbakt = new javax.swing.JComboBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIODATA MAHASISWA");

        jLabel1.setText("NIM");

        jLabel2.setText("Nama ");

        jLabel3.setText("Jenis Kelamin");

        jLabel4.setText("Tanggal Lahir");

        jLabel6.setText("Alamat");

        txtTanggal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtTanggal.setValue(new java.util.Date());
        txtTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalActionPerformed(evt);
            }
        });

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        jLabel7.setText("Cari berdasarkan Nama Siswa");

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        tabelbio.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelbio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelbio);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jLabel8.setText("Fakultas");

        jLabel5.setText("Jurusan");

        jLabel9.setText("Angkatan");

        cmbjk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jenis Kelamin", "Laki-laki", "Perempuan" }));

        cmbakt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Angkatan", "2015", "2016", "2017", "2018" }));
        cmbakt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbaktActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel9))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtfakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(96, 96, 96)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbjk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal)))
                .addContainerGap(220, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBatal, btnHapus, btnRefresh, btnSimpan, btnUbah});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbjk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnBatal))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        int pilihan=0;
        int pilakt=0;
        //mengambil inputan dari form
        String nim = txtnim.getText();
        String nama = txtnama.getText();
        String jeniskelamin = "";
        pilihan=cmbjk.getSelectedIndex();
        if(pilihan==0){
            jeniskelamin="";
        }
        if(pilihan==1){
            jeniskelamin="Laki-laki";
        }
        if(pilihan==2){
            jeniskelamin="Perempuan";
        }
        
        Date tanggalLahir = (Date) txtTanggal.getValue();
        String alamat = txtalamat.getText();
        String fakultas = txtfakultas.getText();
        String jurusan = txtjurusan.getText();
        String angkatan ="";
        pilakt=cmbakt.getSelectedIndex();
        if(pilakt==0){
            angkatan="";
        }
        if(pilihan==1){
            angkatan="2015";
        }
        if(pilihan==2){
            angkatan="2016";
        }
        if(pilihan==3){
            angkatan="2017";
        }
        if(pilihan==4){
            angkatan="2018";
        }

        //masukkan data ke database
        connection = SekolahDatabase.getConnection();
        String query = "INSERT INTO biodata_mhs"
                + "(nim, nama, jenis_kelamin, tanggal_lahir, alamat, fakultas, jurusan, angkatan)"
                + "VALUES (?,?,?,?,?,?,?,?)";
        try {
          PreparedStatement statement= (PreparedStatement) connection.prepareStatement(query);
          
          statement.setString(1, nim);
          statement.setString(2, nama);
          statement.setString(3, jeniskelamin);
          statement.setDate(4, new java.sql.Date(tanggalLahir.getTime()));
          statement.setString(5, alamat);
          statement.setString(6, fakultas);
          statement.setString(7, jurusan);
          statement.setString(8, angkatan);
          
          statement.executeUpdate();
          JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
        } catch (SQLException ex){
          JOptionPane.showMessageDialog(this, "Terjadi error pada saat input data");
          
        } finally {
          loadData();
          reset();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        
        //method untuk menyeleksi data yg akan diubah
        int row = tabelbio.getSelectedRow();
        if (row==-1){
            return;
        }
        
        //mengambil inputan untuk data yg akan diubah
        int pilihan=0;
        int pilakt=0;
        
        String nim = (String) tableModel.getValueAt(row, 0);
        String nama = txtnama.getText();
        String jeniskelamin = "";
        pilihan=cmbjk.getSelectedIndex();
        if(pilihan==0){
            jeniskelamin="";
        }
        if(pilihan==1){
            jeniskelamin="Laki-laki";
        }
        if(pilihan==2){
            jeniskelamin="Perempuan";
        }
        Date tanggalLahir = (Date) txtTanggal.getValue();
        String alamat = txtalamat.getText();
        String fakultas = txtfakultas.getText();
        String jurusan = txtjurusan.getText();
        String angkatan = "";
        pilakt=cmbakt.getSelectedIndex();
        if(pilakt==0){
            angkatan="";
        }
        if(pilihan==1){
            angkatan="2015";
        }
        if(pilihan==2){
            angkatan="2016";
        }
        if(pilihan==3){
            angkatan="2017";
        }
        if(pilihan==4){
            angkatan="2018";
        }

        //lakukan perubahan data ke database
        connection = SekolahDatabase.getConnection();
        String query = "UPDATE biodata_mhs SET "
                + "nama=?, jenis_kelamin=?, tanggal_lahir=?, alamat=?, fakultas=?, jurusan=?, angkatan=?"
            + "WHERE nim=?";
        try {
            PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, nama);
            statement.setString(2, jeniskelamin);
            statement.setDate(3, new java.sql.Date(tanggalLahir.getTime()));
            statement.setString(4, alamat);
            statement.setString(5, fakultas);
            statement.setString(6, jurusan);
            statement.setString(7, angkatan);
            statement.setString(8, nim);
          
            statement.executeUpdate();
             JOptionPane.showMessageDialog(this, "Data Berhasil di Ubah");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi error pada saat update data");
        } finally {
            loadData();
            reset();
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        
        //method seleksi data yg akan diubah
        int row = tabelbio.getSelectedRow();
        if (row==-1){
            return;
        }
        
        //mengambil inputan untuk data yg akan diubah
        String nim = (String) tableModel.getValueAt(row, 0);
        
        //lakukan perubahan data ke db
        connection = SekolahDatabase.getConnection();
        String query = "DELETE FROM biodata_mhs WHERE nim=?";
        
        try {
            PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, nim);
            statement.executeUpdate();            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi error pada saat delete data");
        } finally {
          loadData();  
          reset();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        // TODO add your handling code here:
        
        tableModel.getDataVector().removeAllElements();
        
        //pemberitahuan bahwa tabel telah kosong
        tableModel.fireTableDataChanged();
        
        try {
          String cari = txtCari.getText();
          
          connection = SekolahDatabase.getConnection();
          String query = "SELECT * FROM biodata_mhs WHERE nama LIKE '%"+cari+"%'";
          
          Statement statement = (Statement) connection.createStatement();
          ResultSet resultSet = statement.executeQuery(query);
          
          while (resultSet.next()){
              Object[] biodata_mhs = new Object[8];
              biodata_mhs[0] = resultSet.getString("nim");
              biodata_mhs[1] = resultSet.getString("nama");
              biodata_mhs[2] = resultSet.getString("jenis_kelamin");
              biodata_mhs[3] = resultSet.getString("tanggal_lahir");
              biodata_mhs[4] = resultSet.getString("alamat");
              biodata_mhs[5] = resultSet.getString("fakultas");
              biodata_mhs[6] = resultSet.getString("jurusan");
              biodata_mhs[7] = resultSet.getString("angkatan");
              tableModel.addRow(biodata_mhs);
          }
          
          resultSet.close(); //menutup result set
          statement.close(); //menutup statement
          
        } catch (SQLException ex) {
          System.out.println(ex.getMessage());  
        }
    }//GEN-LAST:event_txtCariKeyReleased

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        
        loadData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void tabelbioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbioMouseClicked
        // TODO add your handling code here:
        try {
            //mendapatkan baris yang terseleksi
            int row=tabelbio.getSelectedRow();
            if (row==-1) {
                return;
            }
        
            //mengambil data dan ditampung
            String nim = (String) tableModel.getValueAt(row, 0);
            String nama = (String) tableModel.getValueAt(row, 1);
            String jeniskelamin = (String) tableModel.getValueAt(row, 2);
            String tanggal= (String) tableModel.getValueAt(row, 3);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date=sdf.parse(tanggal);
            String alamat = (String) tableModel.getValueAt(row, 4);
            String fakultas = (String) tableModel.getValueAt(row, 5);
            String jurusan = (String) tableModel.getValueAt(row, 6);
            String angkatan = (String) tableModel.getValueAt(row, 7);

            //memberi data di setiap inputan
            txtnim.setText(nim);
            txtnama.setText(nama);
            cmbjk.setSelectedItem(tableModel.getValueAt(row, 2).toString());
            txtTanggal.setValue(date);
            txtalamat.setText(alamat);
            txtfakultas.setText(fakultas);
            txtjurusan.setText(jurusan);
            cmbakt.setSelectedItem(tableModel.getValueAt(row, 7).toString());

        } catch (ParseException ex) {
            Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tabelbioMouseClicked

    private void txtTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalActionPerformed

    private void cmbaktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbaktActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbaktActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
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
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox cmbakt;
    private javax.swing.JComboBox cmbjk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelbio;
    private javax.swing.JTextField txtCari;
    private javax.swing.JFormattedTextField txtTanggal;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtfakultas;
    private javax.swing.JTextField txtjurusan;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    // End of variables declaration//GEN-END:variables

    private void initTable(){
        tableModel = new DefaultTableModel();
        tabelbio.setModel(tableModel);
        tableModel.addColumn("NIM");
        tableModel.addColumn("Nama Mahasiswa");
        tableModel.addColumn("Jenis Kelamin");
        tableModel.addColumn("Tanggal Lahir");
        tableModel.addColumn("Alamat");
        tableModel.addColumn("Fakultas");
        tableModel.addColumn("Jurusan");
        tableModel.addColumn("Angkatan");
    }
    
    private void loadData(){
        //menghapus seluruh data yg ada di tabel
        tableModel.getDataVector().removeAllElements();
        //pemberitahuan tabel telah kosong
        tableModel.fireTableDataChanged();
        
        try{
            connection = SekolahDatabase.getConnection();
            String query = "SELECT * FROM biodata_mhs";
            
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            //mengisi tabel dgn data hasil query
            while (resultSet.next()){
                Object[] biodata_mhs = new Object[8];
              biodata_mhs[0] = resultSet.getString("nim");
              biodata_mhs[1] = resultSet.getString("nama");
              biodata_mhs[2] = resultSet.getString("jenis_kelamin");
              biodata_mhs[3] = resultSet.getString("tanggal_lahir");
              biodata_mhs[4] = resultSet.getString("alamat");
              biodata_mhs[5] = resultSet.getString("fakultas");
              biodata_mhs[6] = resultSet.getString("jurusan");
              biodata_mhs[7] = resultSet.getString("angkatan");
                tableModel.addRow(biodata_mhs);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void reset(){
        txtnim.setText("");
        txtCari.setText("");
        txtnama.setText("");
        txtTanggal.setValue(new java.util.Date());
        cmbjk.setSelectedIndex(0);
        txtalamat.setText("");
        txtfakultas.setText("");
        txtjurusan.setText("");
        cmbakt.setSelectedIndex(0);
    }
}