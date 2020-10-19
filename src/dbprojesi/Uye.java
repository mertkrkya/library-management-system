
package dbprojesi;


public class Uye {
private int uyeNo;
private String uyeAd;
private String uyeSoyad;
private String uyeCinsiyet;
private int uyeTelefon;
private String uyeAdres;

    public int getUyeNo() {
        return uyeNo;
    }

    public void setUyeNo(int uyeNo) {
        this.uyeNo = uyeNo;
    }

    public String getUyeAd() {
        return uyeAd;
    }

    public void setUyeAd(String uyeAd) {
        this.uyeAd = uyeAd;
    }

    public String getUyeSoyad() {
        return uyeSoyad;
    }

    public void setUyeSoyad(String uyeSoyad) {
        this.uyeSoyad = uyeSoyad;
    }

    public String getUyeCinsiyet() {
        return uyeCinsiyet;
    }

    public void setUyeCinsiyet(String uyeCinsiyet) {
        this.uyeCinsiyet = uyeCinsiyet;
    }

    public int getUyeTelefon() {
        return uyeTelefon;
    }

    public void setUyeTelefon(int uyeTelefon) {
        this.uyeTelefon = uyeTelefon;
    }

    public String getUyeAdres() {
        return uyeAdres;
    }

    public void setUyeAdres(String uyeAdres) {
        this.uyeAdres = uyeAdres;
    }

    public Uye(int uyeNo, String uyeAd, String uyeSoyad, String uyeCinsiyet, int uyeTelefon, String uyeAdres) {
        this.uyeNo = uyeNo;
        this.uyeAd = uyeAd;
        this.uyeSoyad = uyeSoyad;
        this.uyeCinsiyet = uyeCinsiyet;
        this.uyeTelefon = uyeTelefon;
        this.uyeAdres = uyeAdres;
    }

}
