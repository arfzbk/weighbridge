package proje;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FMCıkıs extends javax.swing.JFrame {
FMHome fmg=new FMHome();
VeriBaglantı baglanti=new VeriBaglantı();
public static int gagırlık;
  
    public FMCıkıs() {
        initComponents();
        //İkon ayarlama
        seticon();
       //tabloyu veritabanı üzerinden listeliyorum.
       tablo=baglanti.iceridekiaraclistele(tablo);
     
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        label_plaka = new javax.swing.JLabel();
        tf_plaka = new javax.swing.JTextField();
        label_sofor = new javax.swing.JLabel();
        tf_sofor = new javax.swing.JTextField();
        label_gagirlik = new javax.swing.JLabel();
        tf_girisagirlik = new javax.swing.JTextField();
        label_cagirlik = new javax.swing.JLabel();
        tf_cıkısagirlik = new javax.swing.JTextField();
        label_urunagirlik = new javax.swing.JLabel();
        tf_urunagirlik = new javax.swing.JTextField();
        label_cikisislem = new javax.swing.JLabel();
        label_iceridekiarac = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        agırlık_label = new javax.swing.JLabel();
        b_geri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kantar Uygulaması");
        setForeground(new java.awt.Color(255, 0, 51));
        setPreferredSize(new java.awt.Dimension(1080, 720));

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plaka", "Giriş Tarihi", "Ağırlık", "Kayıt Eden", "Şoför Adı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo);
        if (tablo.getColumnModel().getColumnCount() > 0) {
            tablo.getColumnModel().getColumn(0).setResizable(false);
            tablo.getColumnModel().getColumn(1).setResizable(false);
            tablo.getColumnModel().getColumn(2).setResizable(false);
            tablo.getColumnModel().getColumn(3).setResizable(false);
            tablo.getColumnModel().getColumn(4).setResizable(false);
        }

        label_plaka.setText("Plaka:");

        tf_plaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_plakaActionPerformed(evt);
            }
        });
        tf_plaka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_plakaKeyReleased(evt);
            }
        });

        label_sofor.setText("Şoför:");

        label_gagirlik.setText("Giriş Ağırlığı:");

        label_cagirlik.setText("Çıkış Ağırlığı:");

        tf_cıkısagirlik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_cıkısagirlikKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cıkısagirlikKeyTyped(evt);
            }
        });

        label_urunagirlik.setText("Ürün Ağırlığı:");

        tf_urunagirlik.setEditable(false);

        label_cikisislem.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label_cikisislem.setText("Çıkış İşlemi");

        label_iceridekiarac.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        label_iceridekiarac.setText("İçerideki Araçlar");

        jButton1.setText("Kaydet");
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        agırlık_label.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        agırlık_label.setForeground(new java.awt.Color(255, 0, 51));

        b_geri.setText("Geri");
        b_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_geriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_iceridekiarac)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_sofor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_gagirlik))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_girisagirlik, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_plaka, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_sofor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(label_plaka, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_cagirlik, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(label_urunagirlik, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_urunagirlik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_cıkısagirlik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(agırlık_label, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label_cikisislem, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(b_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(label_cikisislem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(agırlık_label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_plaka)
                            .addComponent(tf_plaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_sofor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_sofor))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_girisagirlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_gagirlik))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_cıkısagirlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_cagirlik))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_urunagirlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_urunagirlik))
                        .addGap(60, 60, 60)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_iceridekiarac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addGap(49, 49, 49))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //Eğer ağırlık kısmını boşaltırsa bildirim yolluyorum.
        if (tf_cıkısagirlik.getText().equals("")||tf_cıkısagirlik.getText().equals(" ")) {
            JOptionPane.showMessageDialog(this, "Lütfen Ağırlık Giriniz!!");
        }else{
            boolean silme=false;
           //Çıkış yaptığı tarihi almak için aldım 
        Date tarih=new Date();
        DateFormat df=new SimpleDateFormat("MM-dd-yyyy");
       //Burada tablodan gerekli olan verileri alıyorum
       String plaka=tf_plaka.getText();
String ctarih=df.format(tarih);
String cagırlık=tf_cıkısagirlik.getText();

//Bilgileri gönderiyorum
       silme =baglanti.guncelle(ctarih, cagırlık, plaka,FMHome.kullanıcı);
            if (silme) {
                
        tf_cıkısagirlik.setText("");
tf_girisagirlik.setText("");
tf_plaka.setText("");
tf_urunagirlik.setText("");
tf_sofor.setText("");

        JOptionPane.showMessageDialog(this, "Başarıyla Çıkıldı");
        baglanti.iceridekiaraclistele(tablo);
            }
            else{
                JOptionPane.showMessageDialog(this, "Çıkılamadı");
            }
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed
//Ağırlık çıkış textfieldini okuyorum.
    private void tf_cıkısagirlikKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cıkısagirlikKeyReleased
       int cıkıs;
       int son;
        try {
            if (tf_cıkısagirlik.getText().equals("")) {
                cıkıs=0;
        son=cıkıs-gagırlık;
        tf_urunagirlik.setText(String.valueOf(son));
       agırlık_label.setText("Ağırlık:"+String.valueOf(cıkıs));
            }else{
            cıkıs=Integer.valueOf(tf_cıkısagirlik.getText());
        son=cıkıs-gagırlık;
        tf_urunagirlik.setText(String.valueOf(son));
       agırlık_label.setText("Ağırlık:"+tf_cıkısagirlik.getText());
            
      
            }
              
       
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_tf_cıkısagirlikKeyReleased

    private void tf_cıkısagirlikKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cıkısagirlikKeyTyped
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c))||(c ==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_cıkısagirlikKeyTyped

    private void b_geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_geriActionPerformed
        FMHome fmh=new FMHome();
        fmh.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_b_geriActionPerformed
//Burada tabloda basılan yeri textfieldlara aktarıyorum.
    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
          DefaultTableModel model=(DefaultTableModel) tablo.getModel();
      int secili_row=tablo.getSelectedRow();
  String plaka=(String) model.getValueAt(secili_row, 0);
       tf_plaka.setText(plaka);
       String sofor=model.getValueAt(secili_row, 4).toString();
       tf_sofor.setText(sofor);
       String gıagırlık=model.getValueAt(secili_row, 2).toString();
       tf_girisagirlik.setText(gıagırlık);
      FMCıkıs.gagırlık=Integer.valueOf(gıagırlık);
    }//GEN-LAST:event_tabloMouseClicked

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
       jButton1.setBackground(Color.lightGray);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
  jButton1.setBackground(Color.red);
    }//GEN-LAST:event_jButton1MouseMoved
//Burada basılan her plaka karakterine göre arama yapıyorum
    private void tf_plakaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_plakaKeyReleased
        if (tf_plaka.getText().equals("")) {
            tf_girisagirlik.setText("");
            tf_sofor.setText("");
        }
           tablo=baglanti.cıkısplakasearch(tf_plaka.getText(), tablo);
        
        
    }//GEN-LAST:event_tf_plakaKeyReleased

    private void tf_plakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_plakaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_plakaActionPerformed

    private void seticon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("transport.png")));
}
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMCıkıs().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agırlık_label;
    private javax.swing.JButton b_geri;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_cagirlik;
    private javax.swing.JLabel label_cikisislem;
    private javax.swing.JLabel label_gagirlik;
    private javax.swing.JLabel label_iceridekiarac;
    private javax.swing.JLabel label_plaka;
    private javax.swing.JLabel label_sofor;
    private javax.swing.JLabel label_urunagirlik;
    private javax.swing.JTable tablo;
    private javax.swing.JTextField tf_cıkısagirlik;
    private javax.swing.JTextField tf_girisagirlik;
    private javax.swing.JTextField tf_plaka;
    private javax.swing.JTextField tf_sofor;
    private javax.swing.JTextField tf_urunagirlik;
    // End of variables declaration//GEN-END:variables
}
