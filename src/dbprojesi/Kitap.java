/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbprojesi;

public class Kitap {
    private int kitapNo;
    private String kitapAd;
    private String yayAd;
    private String yazAd;
    private String katAd;
    private int sayfaSayisi;
    private int stok;
    private int yazarNo;
    private int yazNo;
    private int katNo;
    private int yayineviNo;
    private int yayNo;
    private int kategoriNo;

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    public String getKitapAd() {
        return kitapAd;
    }

    public void setKitapAd(String kitapAd) {
        this.kitapAd = kitapAd;
    }

    public String getYayAd() {
        return yayAd;
    }

    public void setYayAd(String yayAd) {
        this.yayAd = yayAd;
    }

    public String getYazAd() {
        return yazAd;
    }

    public void setYazAd(String yazAd) {
        this.yazAd = yazAd;
    }

    public String getKatAd() {
        return katAd;
    }

    public void setKatAd(String katAd) {
        this.katAd = katAd;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getYazarNo() {
        return yazarNo;
    }

    public void setYazarNo(int yazarNo) {
        this.yazarNo = yazarNo;
    }

    public int getYazNo() {
        return yazNo;
    }

    public void setYazNo(int yazNo) {
        this.yazNo = yazNo;
    }

    public int getKatNo() {
        return katNo;
    }

    public void setKatNo(int katNo) {
        this.katNo = katNo;
    }

    public int getYayineviNo() {
        return yayineviNo;
    }

    public void setYayineviNo(int yayineviNo) {
        this.yayineviNo = yayineviNo;
    }

    public int getYayNo() {
        return yayNo;
    }

    public void setYayNo(int yayNo) {
        this.yayNo = yayNo;
    }

    public int getKategoriNo() {
        return kategoriNo;
    }

    public void setKategoriNo(int kategoriNo) {
        this.kategoriNo = kategoriNo;
    }

    public Kitap(int kitapNo, String kitapAd, String yazAd, int sayfaSayisi, String katAd, int stok, String yayAd) {
        this.kitapNo = kitapNo;
        this.kitapAd = kitapAd;
        this.yayAd = yayAd;
        this.yazAd = yazAd;
        this.katAd = katAd;
        this.sayfaSayisi = sayfaSayisi;
        this.stok = stok;
    }

}
