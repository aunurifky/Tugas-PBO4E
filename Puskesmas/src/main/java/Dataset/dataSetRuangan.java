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
public class dataSetRuangan {
   private ArrayList<String> idRuangan;
   private ArrayList<String> namaRuangan;
   private ArrayList<String> totalPasien;
   
    //construktor
   public dataSetRuangan (){
        idRuangan = new ArrayList<String>();;
        namaRuangan = new ArrayList<String>();
        totalPasien = new ArrayList<String>();
 
   }

    public ArrayList<String> getrecordIdRuangan() {
        return idRuangan;
    }

    public void insertIdRuangan(String isi) {
        this.idRuangan.add(isi);
    }

    public ArrayList<String> getrecordNamaRuangan() {
        return namaRuangan;
    }

    public void insertNamaRuangan(String isi) {
        this.namaRuangan.add(isi);
    }

    public ArrayList<String> getrecordTotalPasien() {
        return totalPasien;
    }

    public void insertTotalPasien(String isi) {
        this.totalPasien.add(isi);
    }
   
}
