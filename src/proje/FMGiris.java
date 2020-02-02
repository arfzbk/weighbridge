
package proje;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;




public class FMGiris extends javax.swing.JFrame {
    //Veritabanına bağlandım.
    VeriBaglantı baglanti=new VeriBaglantı();
 
    public FMGiris() {
        initComponents();
        //İkon ayarlama
    seticon();
       label_agirlikgoster.setText("Ağırlık:");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_plaka = new javax.swing.JLabel();
        label_sofor = new javax.swing.JLabel();
        label_agirlik = new javax.swing.JLabel();
        b_kaydet = new javax.swing.JButton();
        tf_plaka = new javax.swing.JTextField();
        tf_sofor = new javax.swing.JTextField();
        tf_agirlik = new javax.swing.JTextField();
        label_agirlikgoster = new javax.swing.JLabel();
        b_geri = new javax.swing.JButton();
        label_kg = new javax.swing.JLabel();
        label_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kantar Uygulaması");
        setPreferredSize(new java.awt.Dimension(1080, 720));

        label_plaka.setText("Plaka:");

        label_sofor.setText("Şoför:");

        label_agirlik.setText("Ağırlık:");

        b_kaydet.setText("Kaydet");
        b_kaydet.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b_kaydetMouseMoved(evt);
            }
        });
        b_kaydet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_kaydetMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_kaydetMouseExited(evt);
            }
        });
        b_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_kaydetActionPerformed(evt);
            }
        });

        tf_plaka.setText("Örnek:07ant44");
        tf_plaka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_plakaMouseClicked(evt);
            }
        });
        tf_plaka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_plakaKeyReleased(evt);
            }
        });

        tf_agirlik.setText("Sayı giriniz...");
        tf_agirlik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_agirlikMouseClicked(evt);
            }
        });
        tf_agirlik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_agirlikKeyReleased(evt);
            }
        });

        label_agirlikgoster.setBackground(new java.awt.Color(153, 255, 153));
        label_agirlikgoster.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        label_agirlikgoster.setForeground(new java.awt.Color(255, 0, 51));

        b_geri.setText("Geri");
        b_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_geriActionPerformed(evt);
            }
        });

        label_kg.setText("kg");

        label_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje/tır.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(label_agirlikgoster, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_sofor)
                            .addComponent(label_plaka)
                            .addComponent(label_agirlik))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tf_sofor, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(tf_plaka)
                                    .addComponent(tf_agirlik))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_kg))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(b_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(label_image, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(label_agirlikgoster, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_plaka)
                                    .addComponent(tf_plaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_sofor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_sofor))))
                    .addComponent(label_image, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_agirlik)
                    .addComponent(tf_agirlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_kg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(b_kaydet)
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_kaydetActionPerformed
       //Burada plakadan boşluk bırakmaması için uyarıyorum.
        String[] bosluksorgu=tf_plaka.getText().split(" ");
        if (bosluksorgu.length>1) {
            JOptionPane.showMessageDialog(this, "Plakada Boşluk Bırakmadan Giriniz");
            return;
        }
        //Burada eğer bir alan boş girerse uyarıyorum.
        if (tf_agirlik.getText().equals("")||tf_plaka.getText().equals("")||tf_sofor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen Alanları Tam Doldurunuz.");
        }else{
            //Burada eklenecek değerler için boolean tanımladım.
        boolean ekle=false;
        //Eklenen andaki tarihi aldım.
        Date d=new Date();
        DateFormat df=new SimpleDateFormat("MM-dd-yyyy");
        String tarih=df.format(d);
        //Eklemeyi liste göndererek yapıyorum.
        Map<Object,Object> liste=new HashMap<>();
        liste.put("tarih", tarih);
        liste.put("ağırlık", tf_agirlik.getText().trim().toLowerCase());
        liste.put("plaka", tf_plaka.getText().trim().toLowerCase());
        liste.put("şofor", tf_sofor.getText().trim().toLowerCase());
        //Burada listeyi gönderiyorum eğer eklerse true eklemez ise false döndürüyor.
       ekle= baglanti.ekle(liste);
            if (ekle) {
                //True ise bildirim gönderiyorum.
                JOptionPane.showMessageDialog(this, "Başarıyla Eklendi");
            }
            else{
                //False ise bildirim gönderiyorum.
                     JOptionPane.showMessageDialog(this, "Eklenemedi");
            }
        //Daha sonra içerisi dolu olan textfieldları boşaltıyorum.
        tf_agirlik.setText("");
        tf_plaka.setText("");
        tf_sofor.setText("");
  label_agirlikgoster.setText("Ağırlık:");
        }
      
    }//GEN-LAST:event_b_kaydetActionPerformed

    private void b_geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_geriActionPerformed
      //FMHome formuna gitmek için
        FMHome fmh=new FMHome();
        setVisible(false);
        fmh.setVisible(true);
    }//GEN-LAST:event_b_geriActionPerformed

    private void tf_agirlikKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_agirlikKeyReleased
       //Ağrlık textfieldını dinliyorum.
        if (tf_agirlik.getText().equals("")) {
            label_agirlikgoster.setText("Ağırlık:0 kg");
        }else{
        label_agirlikgoster.setText("Ağırlık:"+tf_agirlik.getText()+" kg");
        }
    }//GEN-LAST:event_tf_agirlikKeyReleased
//Zevki eklediğim metodlar
    private void b_kaydetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_kaydetMouseExited
      
        b_kaydet.setBackground(Color.lightGray);
    }//GEN-LAST:event_b_kaydetMouseExited

    private void b_kaydetMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_kaydetMouseMoved
        b_kaydet.setBackground(Color.red);
    }//GEN-LAST:event_b_kaydetMouseMoved

    private void b_kaydetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_kaydetMouseClicked
        b_kaydet.setBackground(Color.green);
    }//GEN-LAST:event_b_kaydetMouseClicked

    private void tf_plakaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_plakaKeyReleased
       //Plakayı girerken boşluk girdiği an bildirim yolluyorum.
        if (evt.getKeyCode()==KeyEvent.VK_SPACE) {
            JOptionPane.showMessageDialog(this, "Plakayı Lütfen Boşluk Koymadan Girin");
        }
    }//GEN-LAST:event_tf_plakaKeyReleased
public int sayac_agırlık=0;
    private void tf_agirlikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_agirlikMouseClicked
      //Mouse ile textfielda bastığımızda oradaki yazıyı boşaltıyor.
        sayac_agırlık++;
        if (sayac_agırlık==1) {
            tf_agirlik.setText("");
        }
    }//GEN-LAST:event_tf_agirlikMouseClicked
public int sayac_plaka=0;
    private void tf_plakaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_plakaMouseClicked
        //Mouse ile textfielda bastığımızda oradaki yazıyı boşaltıyor.
        sayac_plaka++;
        if (sayac_plaka==1) {
            tf_plaka.setText("");
        }
    }//GEN-LAST:event_tf_plakaMouseClicked
//İkon ayarlama metodu.
    private void seticon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("transport.png")));
}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMGiris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_geri;
    private javax.swing.JButton b_kaydet;
    private javax.swing.JLabel label_agirlik;
    private javax.swing.JLabel label_agirlikgoster;
    private javax.swing.JLabel label_image;
    private javax.swing.JLabel label_kg;
    private javax.swing.JLabel label_plaka;
    private javax.swing.JLabel label_sofor;
    private javax.swing.JTextField tf_agirlik;
    private javax.swing.JTextField tf_plaka;
    private javax.swing.JTextField tf_sofor;
    // End of variables declaration//GEN-END:variables

}

    


