package proje;
import java.awt.Color;
import java.awt.Toolkit;



public class FMHome extends javax.swing.JFrame {
    //Burada veritabanı bağlantısı sağladım
   VeriBaglantı baglanti=new VeriBaglantı();
   //Burada kullanıcı adını tanımladım,
   public static String kullanıcı="";
  

public Object[] bilgiler;
   
    public FMHome() {
        initComponents();
        //Burada ikonu ayarladım.
        seticon();
        //kullanıcı adını buraya getirttim
      kullanıcı=FMLogin.kullanıcıadı;
//Oluşturduğum tabloyu veritabanından bilgileri alarak diziyorum.
        baglanti.iceridekiaraclistele(table_tablo);
  //Tabloda kaç tane satır var onu yazdırıyorum.
              int sayı=table_tablo.getRowCount();
      label_aracsayisi.setText("İçeride Bulunan Toplam Araç Sayısı:"+String.valueOf(sayı));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_tablo = new javax.swing.JTable();
        b_giris = new javax.swing.JButton();
        b_cikis = new javax.swing.JButton();
        b_rapor = new javax.swing.JButton();
        label_aracsayisi = new javax.swing.JLabel();
        b_sorgula = new javax.swing.JButton();
        label_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kantar Uygulaması");
        setPreferredSize(new java.awt.Dimension(1080, 720));

        table_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plaka", "Giris Tarih", "Giriş Ağırlık", "Kullanıcı Adı", "Şoför Adı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_tablo.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(table_tablo);
        if (table_tablo.getColumnModel().getColumnCount() > 0) {
            table_tablo.getColumnModel().getColumn(0).setResizable(false);
            table_tablo.getColumnModel().getColumn(1).setResizable(false);
            table_tablo.getColumnModel().getColumn(2).setResizable(false);
            table_tablo.getColumnModel().getColumn(3).setResizable(false);
            table_tablo.getColumnModel().getColumn(4).setResizable(false);
        }

        b_giris.setText("Giriş");
        b_giris.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b_girisMouseMoved(evt);
            }
        });
        b_giris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_girisMouseExited(evt);
            }
        });
        b_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_girisActionPerformed(evt);
            }
        });

        b_cikis.setText("Çıkış");
        b_cikis.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b_cikisMouseMoved(evt);
            }
        });
        b_cikis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_cikisMouseExited(evt);
            }
        });
        b_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cikisActionPerformed(evt);
            }
        });

        b_rapor.setText("Raporla");
        b_rapor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b_raporMouseMoved(evt);
            }
        });
        b_rapor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_raporMouseExited(evt);
            }
        });
        b_rapor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_raporActionPerformed(evt);
            }
        });

        label_aracsayisi.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        label_aracsayisi.setText("İçeride Bulunan Toplam Araç Sayısı:");

        b_sorgula.setText("Sorgula");
        b_sorgula.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b_sorgulaMouseMoved(evt);
            }
        });
        b_sorgula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_sorgulaMouseExited(evt);
            }
        });
        b_sorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sorgulaActionPerformed(evt);
            }
        });

        label_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje/tır.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_aracsayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(274, 274, 274))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label_image, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b_sorgula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(b_rapor, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addComponent(b_cikis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(b_giris, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(label_image, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_giris, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(b_cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(b_rapor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(b_sorgula, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_aracsayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_girisActionPerformed
       //FMGiriş formu geliyor.
        FMGiris fmg=new FMGiris();
       fmg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_b_girisActionPerformed

    private void b_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cikisActionPerformed
       //FMÇıkış formu geliyor.
        FMCıkıs fmc=new FMCıkıs();
        fmc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_b_cikisActionPerformed

    private void b_sorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_sorgulaActionPerformed
   //FMSorgula formu geliyor.
        FMSorgula fms=new FMSorgula();
   fms.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_b_sorgulaActionPerformed

    private void b_raporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_raporActionPerformed
   FMRapor fmr=new FMRapor();
        setVisible(false);
        fmr.setVisible(true);
    }//GEN-LAST:event_b_raporActionPerformed
//Mouse klavye eventleri.
    private void b_girisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_girisMouseExited
        b_giris.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_b_girisMouseExited

    private void b_girisMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_girisMouseMoved
     b_giris.setBackground(Color.red);
    }//GEN-LAST:event_b_girisMouseMoved

    private void b_cikisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cikisMouseExited
        b_cikis.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_b_cikisMouseExited

    private void b_cikisMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cikisMouseMoved
        b_cikis.setBackground(Color.red);
    }//GEN-LAST:event_b_cikisMouseMoved

    private void b_raporMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_raporMouseExited
       b_rapor.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_b_raporMouseExited

    private void b_raporMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_raporMouseMoved
       b_rapor.setBackground(Color.red);
    }//GEN-LAST:event_b_raporMouseMoved

    private void b_sorgulaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_sorgulaMouseExited
        b_sorgula.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_b_sorgulaMouseExited

    private void b_sorgulaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_sorgulaMouseMoved
       b_sorgula.setBackground(Color.red);
    }//GEN-LAST:event_b_sorgulaMouseMoved

 //İkon getirme metodu
    private void seticon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("transport.png")));
}
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cikis;
    private javax.swing.JButton b_giris;
    private javax.swing.JButton b_rapor;
    private javax.swing.JButton b_sorgula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_aracsayisi;
    private javax.swing.JLabel label_image;
    private javax.swing.JTable table_tablo;
    // End of variables declaration//GEN-END:variables
}




    
