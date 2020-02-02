package proje;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VeriBaglantı {
     
private String kullanıcıad="root";
private  String sifre="";
private String host="localhost";
private int port=3306;
private String databasename="kantar";
private Connection con=null;
private Statement statement=null;
//Constructor tanımladım ve veritabanına bağlandım.
public VeriBaglantı(){
    String url="jdbc:mysql://"+host+":"+port+"/"+databasename;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı");
        }
        try {
            con=DriverManager.getConnection(url,kullanıcıad,sifre);
        } catch (SQLException ex) {
            System.out.println("Bağlantı Sağlanamadı.");
        }
    
}
//Burda JTable ile veritabanına bağlanıyorum ve güncelliyorum.
public JTable listele(JTable table){
    String sorgu="Select * From kantarbilgi";
        try {
            DefaultTableModel tableModel=(DefaultTableModel) table.getModel();
            tableModel.getDataVector().clear();
            statement=con.createStatement();
            ResultSet rs=statement.executeQuery(sorgu);
            while (rs.next()) {
               String plaka=rs.getString("plakano");
               String gtarih=rs.getString("giristarihi");
               String gagırlık=rs.getString("girisagırlıgı");
               String kadı=rs.getString("kullanıcıadı");
               String sadı=rs.getString("surucuadı");
               String ctarih=rs.getString("cıkıstarihi");
               String cagırlık=rs.getString("cıkısagırlıgı");
                Object[] bilgiler ={plaka,gtarih,gagırlık,kadı,sadı,ctarih,cagırlık};
               tableModel.addRow(bilgiler);

            }
            return table;
        } catch (SQLException ex) {
            System.out.println("Listelemede hata.");
            
        }
return table;

}
public JTable iceridekiaraclistele(JTable table){
    //Çıkış yapılmayan araçları listeliyor
    String sorgu="Select * From kantarbilgi";
        try {
            DefaultTableModel tableModel=(DefaultTableModel) table.getModel();
            tableModel.getDataVector().clear();
            statement=con.createStatement();
            ResultSet rs=statement.executeQuery(sorgu);
            while (rs.next()) {
               String plaka=rs.getString("plakano");
               String gtarih=rs.getString("giristarihi");
               String gagırlık=rs.getString("girisagırlıgı");
               String kadı=rs.getString("kullanıcıadı");
               String sadı=rs.getString("surucuadı");
               String ctarih=rs.getString("cıkıstarihi");
               String cagırlık=rs.getString("cıkısagırlıgı");
               //Burada ilk başta girerken Çıkış tarihi 'Girilmedi've Çıkış ağırlığını '0' attığımdan dolayı sorguluyorum.
                if (ctarih.equals("Girilmedi")&&cagırlık.equals("0")) {
                    //Bu  sayede sadece çıkış yapmayan araçları listeliyorum.
                    Object[] bilgiler ={plaka,gtarih,gagırlık,kadı,sadı};
               tableModel.addRow(bilgiler);
                }
                

            }
            return table;
        } catch (SQLException ex) {
            System.out.println("Listelemede hata.");
            
        }
return table;
}
//Burada gönderilen listeyi veritabanına kaydediyorum
public boolean ekle(Map<Object,Object> liste){
boolean eklendi=false;
           try {
               statement=con.createStatement();
                String plaka=liste.get("plaka").toString().trim();
              
                   int agırlık=Integer.valueOf(liste.get("ağırlık").toString().trim());
   
   String sofor=liste.get("şofor").toString().trim();
   String tarih=liste.get("tarih").toString().trim();                    
   String sorgu=String.format("Insert Into kantarbilgi(plakano,giristarihi,girisagırlıgı,kullanıcıadı,surucuadı,cıkıstarihi,cıkısagırlıgı) values('%s','%s','%d','%s','%s','%s','%d')",plaka,tarih,agırlık,FMLogin.kullanıcıadı,sofor,"Girilmedi",0);
   statement.executeUpdate(sorgu);
   eklendi=true;
    return eklendi;
           } catch (SQLException ex) {
               System.out.println("Eklenemedi");
           }
    return eklendi;
}
//Burda kantarın çıkış işlemi yapılıyor.
public boolean guncelle(String ctarih,String cagırlık,String plaka,String kadı){
    boolean guncelle=false;
    String sorgu=String.format("Update kantarbilgi Set cıkıstarihi='%s' Where plakano='%s'",ctarih,plaka);
    String sorgu2=String.format("Update kantarbilgi Set cıkısagırlıgı='%s' Where plakano='%s'",cagırlık,plaka);
    String sorgu3=String.format("Update kantarbilgi Set kullanıcıadı='%s' Where plakano='%s'",kadı,plaka);
         try {
             statement =con.createStatement();
             statement.executeUpdate(sorgu);
             statement.executeUpdate(sorgu2);
              statement.executeUpdate(sorgu3);
             guncelle=true;
             return guncelle;
         } catch (SQLException ex) {
             System.out.println("Güncellemede hata oluştu");
         }
         return guncelle;
}
//Burada iki tarih arasındaki bilgileri sorguluyorum.Eğer var ise tablomuza bu bilgileri getiriyorum.
public JTable ikitariharasıbul(String tarih1,String tarih2,JTable table){
  
     try { 
         DefaultTableModel model=(DefaultTableModel) table.getModel();
         model.getDataVector().clear();
         statement=con.createStatement();
         String sorgu=String.format("Select*From kantarbilgi where giristarihi Between '%s' and '%s'",tarih1,tarih2);
         ResultSet rs = statement.executeQuery(sorgu);
         System.out.println(sorgu);
        
              while (rs.next()) {
                  FMSorgula.butuntarih=true;
               String plaka=rs.getString("plakano");
               String gtarih=rs.getString("giristarihi");
               String gagırlık=rs.getString("girisagırlıgı");
               String kadı=rs.getString("kullanıcıadı");
               String sadı=rs.getString("surucuadı");
                String ctarih=rs.getString("cıkıstarihi");
               String cagırlık=rs.getString("cıkısagırlıgı");
                Object[] bilgiler ={plaka,gtarih,gagırlık,kadı,sadı,ctarih,cagırlık};
               model.addRow(bilgiler);
         }
         
         return table;
        
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Lütfen Tarihi Örnekteki Gibi Giriniz");
         System.out.println(ex.getMessage());
     }
    return table;
}
//Burada ise plakamız var mı yok mu onu sorguluyoruz.
public boolean plakasorgula(String plaka,JTable tablo){
boolean varmı=false;
        try {
            String sorgu="Select*From kantarbilgi";
            statement=con.createStatement();
            ResultSet rs=statement.executeQuery(sorgu);
            
            while (rs.next()) {
                if (rs.getString("plakano").equals(plaka)) {
                    DefaultTableModel model=(DefaultTableModel) tablo.getModel();
                    model.getDataVector().clear();
                    String plakano=rs.getString("plakano");
                    String gtarih=rs.getString("giristarihi");
                    String gagırlık=rs.getString("girisagırlıgı");
                    String kadı=rs.getString("kullanıcıadı");
                    String sadı=rs.getString("surucuadı");
                     String ctarih=rs.getString("cıkıstarihi");
               String cagırlık=rs.getString("cıkısagırlıgı");
                    Object[] eklenecek={plakano,gtarih,gagırlık,kadı,sadı,ctarih,cagırlık};
                    model.addRow(eklenecek);
                    varmı=true;
                    return varmı;
                }
                
            }
            return varmı;
        } catch (SQLException ex) {
            System.out.println("Plaka Sorgulamada Hata Oluştu");
        }
       return varmı;
}
//Kullanıcı bilgisini kontrol ediyor
public boolean kullanicikontrol(String kad,String ksifre){
    try {
        String sorgu=String.format("Select*From kullanicibilgi");
        statement=con.createStatement();
        
        ResultSet rs=statement.executeQuery(sorgu);
        while (rs.next()) {
            if (rs.getString("kullaniciadi").equals(kad)&&rs.getString("sifre").equals(ksifre)) {
                return true;
            }
            
        }
    } catch (SQLException ex) {
        System.out.println("Hata...");
    }
    return false;
}
//İçerideki araçları her girilen stringe göre search yapan metod
public JTable cıkısplakasearch(String plaka,JTable tablo){
    try {
        String sorgu="Select * From kantarbilgi where plakano like '"+plaka+"%"+"'";
        
         DefaultTableModel model=(DefaultTableModel) tablo.getModel();
          model.getDataVector().clear();
        statement=con.createStatement();
        ResultSet rs=statement.executeQuery(sorgu);
        while (rs.next()) {
            if (rs.getInt("cıkısagırlıgı")==0&&rs.getString("cıkıstarihi").equals("Girilmedi")) {
              
               
                
            String plakano=rs.getString("plakano");
            String gtarih=rs.getString("giristarihi");
            String gagırlık=rs.getString("girisagırlıgı");
            String kadı=rs.getString("kullanıcıadı");
            String sadı=rs.getString("surucuadı");
            Object[] eklenecek={plakano,gtarih,gagırlık,kadı,sadı};
            model.addRow(eklenecek);
            
            }
 
        }
        return tablo;
    } catch (SQLException ex) {
        System.out.println("Listelemede sıkıntı");
    }
    return tablo;
}
//Tüm araçları her girilen stringe göre search yapan metod
public JTable sorguplakasearch(String plaka,JTable tablo){
    try {
        String sorgu="Select * From kantarbilgi where plakano like '"+plaka+"%"+"'";
       
         DefaultTableModel model=(DefaultTableModel) tablo.getModel();
          model.getDataVector().clear();
        statement=con.createStatement();
        ResultSet rs=statement.executeQuery(sorgu);
        while (rs.next()) {
          
                
               
                
            String plakano=rs.getString("plakano");
            String gtarih=rs.getString("giristarihi");
            String gagırlık=rs.getString("girisagırlıgı");
            String kadı=rs.getString("kullanıcıadı");
            String sadı=rs.getString("surucuadı");
            Object[] eklenecek={plakano,gtarih,gagırlık,kadı,sadı};
            model.addRow(eklenecek);
            
 
        }
        return tablo;
    } catch (SQLException ex) {
        System.out.println("Listelemede sıkıntı");
    }
    return tablo;
}
}
