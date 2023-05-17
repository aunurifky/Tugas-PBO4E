/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puskesmas;

/**
 *
 * @author ASUS
 */

  public class RekamMedis {
    private String idUser;
    private String noRekamMedis;
    private String tanggal;
    private String jam;
    private String kodePasien;
    private String kodeDokter;
    private String diagnosaDokter;
    private String keterangan;

    public RekamMedis(String idUser, String noRekamMedis, String tanggal, String jam, String kodePasien, String kodeDokter, String diagnosaDokter, String keterangan) {
        this.idUser = idUser;
        this.noRekamMedis = noRekamMedis;
        this.tanggal = tanggal;
        this.jam = jam;
        this.kodePasien = kodePasien;
        this.kodeDokter = kodeDokter;
        this.diagnosaDokter = diagnosaDokter;
        this.keterangan = keterangan;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getKodePasien() {
        return kodePasien;
    }

    public void setKodePasien(String kodePasien) {
        this.kodePasien = kodePasien;
    }

    public String getKodeDokter() {
        return kodeDokter;
    }

    public void setKodeDokter(String kodeDokter) {
        this.kodeDokter = kodeDokter;
    }

    public String getDiagnosaDokter() {
        return diagnosaDokter;
    }

    public void setDiagnosaDokter(String diagnosaDokter) {
        this.diagnosaDokter = diagnosaDokter;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
     public void displayInfo() {
        System.out.println("RekamMedis" + idUser);
        System.out.println("RekamMedis" + noRekamMedis);
        System.out.println("RekamMedis" + tanggal);
        System.out.println("RekamMedis" + jam);
        System.out.println("RekamMedis" + kodePasien);
        System.out.println("RekamMedis" + kodeDokter);
        System.out.println("RekamMedis" + diagnosaDokter);
        System.out.println("RekamMedis" + keterangan);
     }

}  

