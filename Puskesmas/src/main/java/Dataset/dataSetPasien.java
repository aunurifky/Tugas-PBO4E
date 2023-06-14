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
public class dataSetPasien {
   private ArrayList<String> kodePasien;
   private ArrayList<String> namaLengkap;
   private ArrayList<String> alamat;
   private ArrayList<Integer> umur;
   private ArrayList<String> jenisKelamin;
   private ArrayList<String> pekerjaan;
   private ArrayList<String> namaKK;
   private ArrayList<String> username;
   private ArrayList<String> password;
   
   //construktor
   public dataSetPasien (){
        kodePasien = new ArrayList<String>();;
        namaLengkap = new ArrayList<String>();;
        alamat = new ArrayList<String>();
        umur = new ArrayList<Integer>();
        jenisKelamin = new ArrayList<String>();
        pekerjaan = new ArrayList<String>();
        namaKK = new ArrayList<String>();
        username = new ArrayList<String>();
        password= new ArrayList<String>();
    }

    public ArrayList<String> getrecordKodePasien() {
        return kodePasien;
    }

    public void insertKodePasien(String isi) {
        this.kodePasien.add(isi);
    }

    public ArrayList<String> getrecordNamaLengkap() {
        return namaLengkap;
    }

    public void insertNamaLengkap(String isi) {
        this.namaLengkap.add(isi);
    }

    public ArrayList<String> getrecordAlamat() {
        return alamat;
    }

    public void insertAlamat(String isi) {
        this.alamat.add(isi);
    }

    public ArrayList<Integer> getrecordUmur() {
        return umur;
    }

    public void insertUmur(Integer isi) {
        this.umur = umur;
    }

    public ArrayList<String> getJenisKelamin() {
        return jenisKelamin;
    }

    public void insertJenisKelamin(String isi) {
        this.jenisKelamin.add(isi);
    }

    public ArrayList<String> getrecordPekerjaan() {
        return pekerjaan;
    }

    public void insertPekerjaan(String isi) {
        this.pekerjaan.add(isi);
    }

    public ArrayList<String> getrecordNamaKK() {
        return namaKK;
    }

    public void insertNamaKK(String isi) {
        this.namaKK = namaKK;
    }

    public ArrayList<String> getrecordUsername() {
        return username;
    }

    public void insertUsername(String isi) {
        this.username.add(isi);
    }

    public ArrayList<String> getrecordPassword() {
        return password;
    }

    public void insertPassword(String isi) {
        this.password.add(isi);
    }
   
    
}
