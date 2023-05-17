/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puskesmas;

/**
 *
 * @author ASUS
 */
public class Detail_jadwal {
    private int idJadwal;
    private String kodePasien;
    private String tanggal;

    public Detail_jadwal(int idJadwal, String kodePasien, String tanggal) {
        this.idJadwal = idJadwal;
        this.kodePasien = kodePasien;
        this.tanggal = tanggal;
    }

    public int getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(int idJadwal) {
        this.idJadwal = idJadwal;
    }

    public String getKodePasien() {
        return kodePasien;
    }

    public void setKodePasien(String kodePasien) {
        this.kodePasien = kodePasien;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    public void displayInfo() {
        System.out.println("Detail_jadwal" + idJadwal);
        System.out.println("Admin" + kodePasien);
        System.out.println("Admin" + tanggal);
    }
}

