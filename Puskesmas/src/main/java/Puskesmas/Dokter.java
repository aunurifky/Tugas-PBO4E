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


public class Dokter {
    private String kodeDokter;
    private String namaDokter;
    private String spesialis;
    private int umur;
    private String jenisKelamin;
    private String alamat;
    private String kota;
    private String telepon;
    private String tanggalMasuk;

    public Dokter(String kodeDokter, String namaDokter, String spesialis, int umur, String jenisKelamin, String alamat, String kota, String telepon, String tanggalMasuk) {
        this.kodeDokter = kodeDokter;
        this.namaDokter = namaDokter;
        this.spesialis = spesialis;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.kota = kota;
        this.telepon = telepon;
        this.tanggalMasuk = tanggalMasuk;
    }

    public String getKodeDokter() {
        return kodeDokter;
    }

    public void setKodeDokter(String kodeDokter) {
        this.kodeDokter = kodeDokter;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

     public String gettanggalMasuk() {
        return tanggalMasuk;
    }

    public void settanggalMasuk(String tanggalMasuk) {
        this.tanggalMasuk = this.tanggalMasuk;
    }

   
        
    
        
        public void displayInfo(){
            System.out.println("Kode Dokter : " + kodeDokter);
            System.out.println("Kode Dokter : " + namaDokter);
            System.out.println("Kode Dokter : " + spesialis);
            System.out.println("Kode Dokter : " + umur);
            System.out.println("Kode Dokter : " + jenisKelamin);
            System.out.println("Kode Dokter : " + alamat);
            System.out.println("Kode Dokter : " + kota);
            System.out.println("Kode Dokter : " + telepon);
            System.out.println("Kode Dokter : " + tanggalMasuk);
 
        }
    }













    

