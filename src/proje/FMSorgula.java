package proje;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class FMSorgula extends javax.swing.JFrame {
FMHome fmh=new FMHome();
VeriBaglantı b=new VeriBaglantı();
public static boolean butuntarih;
    public FMSorgula() {
        initComponents();
        seticon();
        //Tabloyu getiriyorum.
       sorgulama_tablosu= b.listele(sorgulama_tablosu);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        sorgulama_tablosu = new javax.swing.JTable();
        label_ikitarih = new javax.swing.JLabel();
        label_ilktarihigir = new javax.swing.JLabel();
        tf_ilktarih = new javax.swing.JTextField();
        label_ornek1 = new javax.swing.JLabel();
        label_ikincitarihigir = new javax.swing.JLabel();
        tf_ikincitarih = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label_plakasorgu = new javax.swing.JLabel();
        tf_plaka = new javax.swing.JTextField();
        label_plaka = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        label_sorgula = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kantar Uygulaması");
        setPreferredSize(new java.awt.Dimension(1080, 720));

        sorgulama_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plaka", "Giriş Tarih", "Giriş Ağırlık", "Kullanıcı Adı", "Şoför Adı", "Çıkış Tarihi", "Çıkış Ağırlığı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sorgulama_tablosu);
        if (sorgulama_tablosu.getColumnModel().getColumnCount() > 0) {
            sorgulama_tablosu.getColumnModel().getColumn(0).setResizable(false);
            sorgulama_tablosu.getColumnModel().getColumn(1).setResizable(false);
            sorgulama_tablosu.getColumnModel().getColumn(2).setResizable(false);
            sorgulama_tablosu.getColumnModel().getColumn(3).setResizable(false);
            sorgulama_tablosu.getColumnModel().getColumn(4).setResizable(false);
            sorgulama_tablosu.getColumnModel().getColumn(6).setResizable(false);
        }

        label_ikitarih.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        label_ikitarih.setForeground(new java.awt.Color(51, 51, 255));
        label_ikitarih.setText("İki Tarih Arasında Sorgulama");

        label_ilktarihigir.setText("İlk Tarihi Girin:");

        label_ornek1.setText("Örn:aa-gg-yyyy");

        label_ikincitarihigir.setText("İkinci Tarihi Girin:");

        jButton1.setText("Sorgula");
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

        jButton2.setText("Geri");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label_plakasorgu.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        label_plakasorgu.setForeground(new java.awt.Color(51, 51, 255));
        label_plakasorgu.setText("Plaka Sorgulama");

        tf_plaka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_plakaKeyReleased(evt);
            }
        });

        label_plaka.setText("Plaka Giriniz:");

        jButton3.setText("Sorgula");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        label_sorgula.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_ikitarih, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_ikincitarihigir)
                                .addGap(25, 25, 25)
                                .addComponent(tf_ikincitarih, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_ilktarihigir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_ilktarih, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(label_ornek1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_sorgula, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_plakasorgu, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_plaka, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_plaka, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_plakasorgu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_plaka, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_plaka, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 14, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_ikincitarihigir)
                                    .addComponent(tf_ikincitarih, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_sorgula, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_ikitarih, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_ilktarihigir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ilktarih, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_ornek1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      //Textfieldler boş mu diye kontrolediyorum.
        if (tf_ilktarih.getText().equals("")||tf_ikincitarih.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen Boş Alan Bırakmayınız.");
        }else{
            //Eğer boş değilse gerekli metoduma gerekli parametreleri gönderiyorum.
        String tarih1=tf_ilktarih.getText().trim();
       String tarih2=tf_ikincitarih.getText().trim();
            JTable kontroltablo=sorgulama_tablosu;
            
   sorgulama_tablosu=  b.ikitariharasıbul(tarih1, tarih2, sorgulama_tablosu);
            if (sorgulama_tablosu==kontroltablo) {
                if (!butuntarih) {
                    JOptionPane.showMessageDialog(this, "Aradığınız tarih mevcut değil");
                  
                }
                
            }
            butuntarih=false;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       FMHome fmh=new FMHome();
       fmh.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       //Burada plaka sorgulatıyorum
        String sorgulaplaka=tf_plaka.getText().trim();
        boolean varmı=false;
      varmı= b.plakasorgula(sorgulaplaka,sorgulama_tablosu);
        if (varmı) {
            label_sorgula.setForeground(Color.BLUE);
            label_sorgula.setText("Plaka Veritabanında Mevcuttur");
        }
        else{
            label_sorgula.setForeground(Color.RED);
            label_sorgula.setText("Plaka Veritabanında Mevcut Değildir");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
 jButton1.setBackground(Color.red);
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
       jButton1.setBackground(Color.lightGray);
    }//GEN-LAST:event_jButton1MouseExited

    private void tf_plakaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_plakaKeyReleased
        sorgulama_tablosu=b.sorguplakasearch(tf_plaka.getText(), sorgulama_tablosu);
    }//GEN-LAST:event_tf_plakaKeyReleased

    private void seticon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("transport.png")));
}
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMSorgula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_ikincitarihigir;
    private javax.swing.JLabel label_ikitarih;
    private javax.swing.JLabel label_ilktarihigir;
    private javax.swing.JLabel label_ornek1;
    private javax.swing.JLabel label_plaka;
    private javax.swing.JLabel label_plakasorgu;
    private javax.swing.JLabel label_sorgula;
    private javax.swing.JTable sorgulama_tablosu;
    private javax.swing.JTextField tf_ikincitarih;
    private javax.swing.JTextField tf_ilktarih;
    private javax.swing.JTextField tf_plaka;
    // End of variables declaration//GEN-END:variables
}
