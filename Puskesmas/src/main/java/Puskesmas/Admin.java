/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puskesmas;

/**
 *
 * @author ASUS
 */
public class Admin {
    private String namaLengkap;
    private int idUser;
    private String userId;
    private String password;
    private String jabatan;
    private String alamat;
    private String kota;
    private String telepon;
    private String pendidikan;
    private String statusPerkawinan;

    public Admin(String namaLengkap, int idUser, String userId, String password, String jabatan, String alamat, String kota, String telepon, String pendidikan, String statusPerkawinan) {
        this.namaLengkap = namaLengkap;
        this.idUser = idUser;
        this.userId = userId;
        this.password = password;
        this.jabatan = jabatan;
        this.alamat = alamat;
        this.kota = kota;
        this.telepon = telepon;
        this.pendidikan = pendidikan;
        this.statusPerkawinan = statusPerkawinan;
    }

    public Admin(String john_Doe, String admin123, String admin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
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

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }

    public void displayInfo() {
        System.out.println("Admin" + namaLengkap);
        System.out.println("Admin" + idUser);
        System.out.println("Admin" + userId);
        System.out.println("Admin" + password);
        System.out.println("Admin" + jabatan);
        System.out.println("Admin" + alamat);
        System.out.println("Admin" + kota);
        System.out.println("Admin" + telepon);
        System.out.println("Admin" + pendidikan);
        System.out.println("Admin" + statusPerkawinan);
    }
}


