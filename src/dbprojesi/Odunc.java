/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbprojesi;

/**
 *
 * @author MertK
 */
public class Odunc {
    private int islemNo;
    private int kitapNo;
    private int uyeNo;
    private String alimTarihi;
    private String teslimTarihi;

    public int getIslemNo() {
        return islemNo;
    }

    public void setIslemNo(int islemNo) {
        this.islemNo = islemNo;
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    public int getUyeNo() {
        return uyeNo;
    }

    public void setUyeNo(int uyeNo) {
        this.uyeNo = uyeNo;
    }

    public String getAlimTarihi() {
        return alimTarihi;
    }

    public void setAlimTarihi(String alimTarihi) {
        this.alimTarihi = alimTarihi;
    }

    public String getTeslimTarihi() {
        return teslimTarihi;
    }

    public void setTeslimTarihi(String teslimTarihi) {
        this.teslimTarihi = teslimTarihi;
    }

    public Odunc(int islemNo, int kitapNo, int uyeNo, String alimTarihi, String teslimTarihi) {
        this.islemNo = islemNo;
        this.kitapNo = kitapNo;
        this.uyeNo = uyeNo;
        this.alimTarihi = alimTarihi;
        this.teslimTarihi = teslimTarihi;
    }
}
