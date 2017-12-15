/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Qhi
 */
public class ModelRegistrasi {
    private String ktp,nama,jemin="",cabang,handuk="",biaya="",paket="";

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJemin() {
        return jemin;
    }

    public void setJemin(String jemin) {
        this.jemin = jemin;
    }

    public String getCabang() {
        return cabang;
    }

    public void setCabang(String cabang) {
        this.cabang = cabang;
    }

    public String getHanduk() {
        return handuk;
    }

    public void setHanduk(String handuk) {
        this.handuk = handuk;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }

    public String getPaket() {
        return paket;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }
    public void biayaPaket(){
        if (paket=="Reguler"){
            biaya = "Rp.450.000 / Bln";
        }else if (paket == "Mahasiswa"){
            biaya = "Rp.300.000 / Bln";
        }else if (paket == "Private"){
            biaya = "Rp.750.000 / Bln";
        }else if (paket == "Premium"){
            biaya = "Rp.1.000.000 / Bln";
        }
    }
    
    public void jenisHanduk(String jenis){
        this.handuk = handuk + " " +jenis;
    }
}
