/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puskesmas;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Obat {
    private String idObat;
    private String caraGuna;
    private String golObat;
    private String dosis;
    private String dosisSatuan;
    private String satuan;
    private String hargaBeli;
    private String hargaJual;
    private String sisaObat;

    public Obat(String idObat, String caraGuna, String golObat, String dosis, String dosisSatuan, String satuan, String hargaBeli, String hargaJual, String sisaObat) {
        this.idObat = idObat;
        this.caraGuna = caraGuna;
        this.golObat = golObat;
        this.dosis = dosis;
        this.dosisSatuan = dosisSatuan;
        this.satuan = satuan;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
        this.sisaObat = sisaObat;
    }

    public String getIdObat() {
        return idObat;
    }

    public void setIdObat(String idObat) {
        this.idObat = idObat;
    }

    public String getCaraGuna() {
        return caraGuna;
    }

    public void setCaraGuna(String caraGuna) {
        this.caraGuna = caraGuna;
    }

    public String getGolObat() {
        return golObat;
    }

    public void setGolObat(String golObat) {
        this.golObat = golObat;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getDosisSatuan() {
        return dosisSatuan;
    }

    public void setDosisSatuan(String dosisSatuan) {
        this.dosisSatuan = dosisSatuan;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(String hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public String getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(String hargaJual) {
        this.hargaJual = hargaJual;
    }

     public String getsisaObat() {
        return sisaObat;
    }

    public void setsisaObat(String sisaObatl) {
        this.sisaObat = sisaObat;
    }
    
    public void displayInfo() {
        System.out.println("Obat" + idObat);
        System.out.println("Obat" + caraGuna);
        System.out.println("Obat" + golObat);
        System.out.println("Obat" + dosis);
        System.out.println("Obat" + dosisSatuan);
        System.out.println("Obat" + satuan);
        System.out.println("Obat" + hargaBeli);
        System.out.println("Obat" + hargaJual);
        System.out.println("Obat" + sisaObat);
        
    }

    }

