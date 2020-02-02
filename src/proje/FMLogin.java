package proje;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class FMLogin extends javax.swing.JFrame {
    //Veritabanını bağlıyorum
VeriBaglantı baglantı=new VeriBaglantı();
    public static String kullanıcıadı="";
private String parola;


FMHome fhome=new FMHome();
  
    public FMLogin() {
        initComponents();
      //Uygulamanın ikonu için metod
        seticon();
     
        //Ekrana tarih yazdırmak için bugünün tarihini aldım.
            Date simdikizaman=new Date();
        DateFormat df=new SimpleDateFormat("MM/dd/yyyy HH:mm");
            label_tarih.setText(df.format(simdikizaman));

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_kullaniciad = new javax.swing.JLabel();
        tf_kullanıcı = new javax.swing.JTextField();
        label_parola = new javax.swing.JLabel();
        b_giris = new javax.swing.JButton();
        label_isim = new javax.swing.JLabel();
        label_tarih = new javax.swing.JLabel();
        tf_parola = new javax.swing.JPasswordField();
        label_icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kantar Uygulaması");
        setPreferredSize(new java.awt.Dimension(1080, 720));

        label_kullaniciad.setText("Kullanıcı Adı:");

        label_parola.setText("Parola:");

        b_giris.setText("Giriş");
        b_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_girisActionPerformed(evt);
            }
        });

        label_isim.setBackground(new java.awt.Color(0, 0, 0));
        label_isim.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label_isim.setForeground(new java.awt.Color(0, 0, 0));
        label_isim.setText("Kapı Kantar Uygulaması");

        label_tarih.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        tf_parola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_parolaActionPerformed(evt);
            }
        });

        label_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\arfzbk\\tır.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_kullaniciad, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label_parola, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_parola, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_kullanıcı, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(b_giris, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                .addComponent(label_icon)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(label_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(label_icon))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_kullaniciad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_kullanıcı, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_parola, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_parola, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43)
                        .addComponent(b_giris, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void b_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_girisActionPerformed
     //Giriş butonu hareketi
        kullanıcıadı=tf_kullanıcı.getText();  
        parola=tf_parola.getText();
        //Burada veritabanı üzerinden kullanıcı kontrol ettiriyorum
        if (baglantı.kullanicikontrol(kullanıcıadı, parola)) {
            JOptionPane.showMessageDialog(this, "Bağlantı Başarılı.");
            fhome.setVisible(true);
            setVisible(false);
        }else{
        JOptionPane.showMessageDialog(this, "Lütfen tekrar deneyin");
        return;
        }
      
    }//GEN-LAST:event_b_girisActionPerformed

    private void tf_parolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_parolaActionPerformed
        //Giriş butonu hareketi
        kullanıcıadı=tf_kullanıcı.getText();  
        parola=tf_parola.getText();
        if (baglantı.kullanicikontrol(kullanıcıadı, parola)) {
            JOptionPane.showMessageDialog(this, "Bağlantı Başarılı.");
            fhome.setVisible(true);
            setVisible(false);
        }else{
        JOptionPane.showMessageDialog(this, "Lütfen tekrar deneyin");
        return;
        }
        
    }//GEN-LAST:event_tf_parolaActionPerformed

    
private void seticon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("transport.png")));
}
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
                new FMLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_giris;
    private javax.swing.JLabel label_icon;
    private javax.swing.JLabel label_isim;
    private javax.swing.JLabel label_kullaniciad;
    private javax.swing.JLabel label_parola;
    private javax.swing.JLabel label_tarih;
    private javax.swing.JTextField tf_kullanıcı;
    private javax.swing.JPasswordField tf_parola;
    // End of variables declaration//GEN-END:variables
}
