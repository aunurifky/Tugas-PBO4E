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
public class dataSetDokter {
    private ArrayList<String> kodeDokter;
    private ArrayList<String> namaDokter;
    private ArrayList<String> spesialis;
    private ArrayList<Integer> umur;
    private ArrayList<String> jenisKelamin;
    private ArrayList<String> alamat;
    private ArrayList<String> kota;
    private ArrayList<String> telepon;
    private ArrayList<String> tanggalMasuk;
    
    //construktor
     public dataSetDokter () {
        kodeDokter = new ArrayList<String>();
        namaDokter= new ArrayList<String> ();
        spesialis= new ArrayList<String> ();
        umur= new ArrayList<Integer> ();
        jenisKelamin= new ArrayList<String> ();
        alamat= new ArrayList<String> ();
        kota= new ArrayList<String> ();
        telepon= new ArrayList<String> ();
        tanggalMasuk= new ArrayList<String> ();
   
        
    
}

    public ArrayList<String> getrecordKodeDokter() {
        return kodeDokter;
    }

    public void insertKodeDokter(String isi) {
        this.kodeDokter.add(isi);
    }

    public ArrayList<String> getrecordNamaDokter() {
        return namaDokter;
    }

    public void insertNamaDokter(String isi) {
         this.namaDokter.add(isi);
    }

    public ArrayList<String> getrecordSpesialis() {
        return spesialis;
    }

    public void insertSpesialis(String isi) {
         this.kodeDokter.add(isi);
    }

    public ArrayList<Integer> getrecordUmur() {
        return umur;
    }

    public void insertUmur(Integer isi) {
          this.umur.add(isi);
    }

    public ArrayList<String> getrecordJenisKelamin() {
        return jenisKelamin;
    }

    public void insertJenisKelamin(String isi) {
          this.jenisKelamin.add(isi);
    }

    public ArrayList<String> getrecordAlamat() {
        return alamat;
    }

    public void insertAlamat(String isi) {
        this.alamat.add(isi);
    }

    public ArrayList<String> getrecordKota() {
        return kota;
    }

    public void insertKota(String isi) {
         this.kota.add(isi);
    }

    public ArrayList<String> getrecordTelepon() {
        return telepon;
    }

    public void insertTelepon(String isi) {
         this.telepon.add(isi);
    }

    public ArrayList<String> getrecordTanggalMasuk() {
        return tanggalMasuk;
    }

    public void insertTanggalMasuk(String isi) {
        this.tanggalMasuk.add(isi);
    }

  

}