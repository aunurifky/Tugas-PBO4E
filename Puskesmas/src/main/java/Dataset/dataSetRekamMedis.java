/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class dataSetRekamMedis {
   private ArrayList<String> idUser;
   private ArrayList<String> noRekamMedis;
   private ArrayList<String> tanggal;
   private ArrayList<String> jam;
   private ArrayList<String> kodePasien;
   private ArrayList<String> kodeDokter;
   private ArrayList<String> diagnosaDokter;
   private ArrayList<String> keterangan;
   
    //construktor
   public dataSetRekamMedis (){
        idUser = new ArrayList<String>();;
        noRekamMedis = new ArrayList<String>();
        tanggal = new ArrayList<String>();
        jam = new ArrayList<String>();
        kodePasien = new ArrayList<String>();
        kodeDokter = new ArrayList<String>();
        diagnosaDokter = new ArrayList<String>();
        keterangan = new ArrayList<String>();
    }

    public ArrayList<String> getrecordIdUser() {
        return idUser;
    }

    public void insertIdUser(String isi) {
        this.idUser.add(isi);
    }

    public ArrayList<String> getrecordNoRekamMedis() {
        return noRekamMedis;
    }

    public void insertNoRekamMedis(String isi) {
        this.noRekamMedis.add(isi);
    }

    public ArrayList<String> getrecordTanggal() {
        return tanggal;
    }

    public void insertTanggal(String isi) {
        this.tanggal.add(isi);
    }

    public ArrayList<String> getrecordJam() {
        return jam;
    }

    public void insertJam(String isi) {
        this.jam.add(isi);
    }

    public ArrayList<String> getrecordKodePasien() {
        return kodePasien;
    }

    public void insertKodePasien(String isi) {
        this.kodePasien.add(isi);
    }

    public ArrayList<String> getrecordKodeDokter() {
        return kodeDokter;
    }

    public void insertKodeDokter(String isi) {
        this.kodeDokter.add(isi);
    }

    public ArrayList<String> getrecordDiagnosaDokter() {
        return diagnosaDokter;
    }

    public void insertDiagnosaDokter(String isi) {
        this.diagnosaDokter.add(isi);
    }

    public ArrayList<String> getrecordKeterangan() {
        return keterangan;
    }

    public void insertKeterangan(String isi) {
        this.keterangan.add(isi);
    }
   
    
}
