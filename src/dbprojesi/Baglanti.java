package dbprojesi;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Baglanti {
    private Statement statement = null;
    private Connection con = null;
    private PreparedStatement preparedStatement = null;
    
        public boolean girisYap(String kullanici_adi,String sifre) {
        
        String sorgu =  "Select * From admin where username = ? and password = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,kullanici_adi);
            preparedStatement.setString(2,sifre);
            
            ResultSet rs =  preparedStatement.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        }
    
    public ArrayList<Kitap> kitaplariGetir(){
        ArrayList<Kitap> cikti = new ArrayList<Kitap>();
        String sorgu = "SELECT kitapNo,kitapAd,yazAd,sayfaSayisi,katAd,stok,yayAd FROM kitap,yazar,kategori,yayinevi WHERE yazarNo=yazNo and yayineviNo=yayNo and kategoriNo=katNo";
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            while(rs.next())
            {
                int kitapNo = rs.getInt("kitapNo");
                String kitapAd = rs.getString("kitapAd");
                String yazAd = rs.getString("yazAd");
                int sayfaSayisi = rs.getInt("sayfaSayisi");
                String katAd = rs.getString("katAd");
                int stok = rs.getInt("stok");
                String yayAd = rs.getString("yayAd");
                cikti.add(new Kitap(kitapNo,kitapAd,yazAd,sayfaSayisi,katAd,stok,yayAd));
                
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public void kitapEkle(String kitap_no,String kitap_ad,String yazar_no,String sayfa_sayisi,String kat_no,String stok,String yay_no){
        String sorgu = "Insert into kitap (kitapNo,kitapAd,yazarNo,sayfaSayisi,kategoriNo,stok,yayineviNo) VALUES (?,?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kitap_no);
            preparedStatement.setString(2, kitap_ad);
            preparedStatement.setString(3, yazar_no);
            preparedStatement.setString(4, sayfa_sayisi);
            preparedStatement.setString(5, kat_no);
            preparedStatement.setString(6, stok);          
            preparedStatement.setString(7, yay_no);    
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void kitapGuncelle(int kitap_no,String stok){
        String sorgu =  "Update kitap set stok = ? where kitapNo = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1,stok);     
            preparedStatement.setInt(2, kitap_no);            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void kitapSil(int kitap_no){
        String sorgu = "Delete from uye where kitapNo = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, kitap_no);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }                
    }
        public ArrayList<Uye> uyeleriGetir(){
        ArrayList<Uye> cikti = new ArrayList<Uye>();
        String sorgu = "SELECT uyeNo,uyeAd,uyeSoyad,uyeCinsiyet,uyeTelefon,uyeAdres From Uye";
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            while(rs.next())
            {
                int uyeNo = rs.getInt("uyeNo");
                String uyeAd = rs.getString("uyeAd");
                String uyeSoyad = rs.getString("uyeSoyad");
                String uyeCinsiyet = rs.getString("uyeCinsiyet");
                int uyeTelefon = rs.getInt("uyeTelefon");
                String uyeAdres = rs.getString("uyeAdres");
                cikti.add(new Uye(uyeNo,uyeAd,uyeSoyad,uyeCinsiyet,uyeTelefon,uyeAdres));
                
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
        public void uyeEkle(String uye_no,String uye_ad,String uye_soyad,String uye_cinsiyet,String uye_telefon,String uye_adres){
            String sorgu = "Insert into Uye (uyeNo,uyeAd,uyeSoyad,uyeCinsiyet,uyeTelefon,uyeAdres) VALUES (?,?,?,?,?,?)";
            try {
                preparedStatement = con.prepareStatement(sorgu);
                preparedStatement.setString(1, uye_no);
                preparedStatement.setString(2, uye_ad);
                preparedStatement.setString(3, uye_soyad);
                preparedStatement.setString(4, uye_cinsiyet);
                preparedStatement.setString(5, uye_telefon);
                preparedStatement.setString(6, uye_adres);            
                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            }           
    }
       public void uyeGuncelle(int uye_no,String uye_ad,String uye_soyad,String uye_cinsiyet,String uye_telefon,String uye_adres){
           String sorgu =  "Update uye set uyeAd = ? , uyeSoyad = ? , uyeCinsiyet = ? , uyeTelefon = ?,uyeAdres = ? where uyeNo = ?";
            try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1,uye_ad);
            preparedStatement.setString(2,uye_soyad);           
            preparedStatement.setString(3,uye_cinsiyet);
            preparedStatement.setString(4,uye_telefon);   
            preparedStatement.setString(5,uye_adres);     
            preparedStatement.setInt(6, uye_no);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       public void uyeSil(int uye_no){
        String sorgu = "Delete from uye where uyeNo = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, uye_no);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }           
       }
    public ArrayList<Odunc> oduncleriGetir(){
        ArrayList<Odunc> cikti = new ArrayList<Odunc>();
        String sorgu = "SELECT islemNo,kitapNo,uyeNo,alimTarihi,teslimTarihi From Odunc";
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            while(rs.next())
            {
                int islemNo = rs.getInt("islemNo");
                int kitapNo = rs.getInt("kitapNo");
                int uyeNo = rs.getInt("uyeNo");
                String alimTarihi = rs.getString("alimTarihi");
                String teslimTarihi = rs.getString("teslimTarihi");
                cikti.add(new Odunc(islemNo,kitapNo,uyeNo,alimTarihi,teslimTarihi));
                
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }    
    public void oduncEkle(String islem_no,String kitap_no,String uye_no,String alim_tarihi,String teslim_tarihi){
            String sorgu = "Insert Into odunc (islemNo,kitapNo,uyeNo,alimTarihi,teslimTarihi) VALUES (?,?,?,?,?)";
            try {
                preparedStatement = con.prepareStatement(sorgu);
                preparedStatement.setString(1, islem_no);
                preparedStatement.setString(2, kitap_no);
                preparedStatement.setString(3, uye_no);
                preparedStatement.setString(4, alim_tarihi);
                preparedStatement.setString(5, teslim_tarihi);         
                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            }           
    }
    public void oduncSil(int no_alani){
        String sorgu = "Delete from odunc where islemNo = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, no_alani);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }                   
    }
    public Baglanti(){
    //"jdbc:mysql://host:port/demo"
    String url = "jdbc:mysql://"+Database.host+":"+Database.port+"/"+Database.db_ismi+"?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");   
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }       
        
    try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Bağlantı Başarılı...");                     
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            ex.printStackTrace();
        }
    }
     public static void main(String[] args) {
        Baglanti baglanti = new Baglanti();
    }   
}