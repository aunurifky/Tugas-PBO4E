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
public class Pasien {
  private String kodePasien;
    private String namaLengkap;
    private String alamat;
    private int umur;
    private String jenisKelamin;
    private String pekerjaan;
    private String namaKK;
    private String username;
    private String password;

    public Pasien(String kodePasien, String namaLengkap, String alamat, int umur, String jenisKelamin, String pekerjaan, String namaKK, String username, String password) {
        this.kodePasien = kodePasien;
        this.namaLengkap = namaLengkap;
        this.alamat = alamat;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.pekerjaan = pekerjaan;
        this.namaKK = namaKK;
        this.username = username;
        this.password = password;
    }

    public String getKodePasien() {
        return kodePasien;
    }

    public void setKodePasien(String kodePasien) {
        this.kodePasien = kodePasien;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
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

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getNamaKK() {
        return namaKK;
    }

    public void setNamaKK(String namaKK) {
        this.namaKK = namaKK;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

     public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public void displayInfo() {
        System.out.println("Pasien" + kodePasien);
        System.out.println("Pasien" + namaLengkap);
        System.out.println("Pasien" + alamat);
        System.out.println("Pasien" + umur);
        System.out.println("Pasien" + jenisKelamin);
        System.out.println("Pasien" + pekerjaan);
        System.out.println("Pasien" + namaKK);
        System.out.println("Pasien" + username);
        System.out.println("Pasien" + password);
    }
        
}


