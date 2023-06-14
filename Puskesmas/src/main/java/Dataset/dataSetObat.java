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
public class dataSetObat {
   private ArrayList<String> idobat;
   private ArrayList<String> caraGuna;
   private ArrayList<String> golObat;
   private ArrayList<Integer> dosis;
   private ArrayList<String> dosisSatuan;
   private ArrayList<String> satuan;
   private ArrayList<String> hargaBeli;
   private ArrayList<String> hargaJual;
   private ArrayList<String> sisaObat;
   
   //construktor

    public dataSetObat (){
        idobat = new ArrayList<String>();;
        caraGuna = new ArrayList<String>();;
        golObat = new ArrayList<String>();
        dosis = new ArrayList<Integer>();
        dosisSatuan = new ArrayList<String>();
        satuan = new ArrayList<String>();
        hargaBeli = new ArrayList<String>();
        hargaJual = new ArrayList<String>();
        sisaObat = new ArrayList<String>();
    }

    public ArrayList<String> getrecordIdobat() {
        return idobat;
    }

    public void insertIdobat(String isi) {
        this.idobat.add(isi);
    }

    public ArrayList<String> getrecordCaraGuna() {
        return caraGuna;
    }

    public void insertCaraGuna(String isi) {
        this.caraGuna.add(isi);
    }

    public ArrayList<String> getrecordGolObat() {
        return golObat;
    }

    public void insertGolObat(String isi) {
        this.golObat.add(isi);
    }

    public ArrayList<Integer> getrecordDosis() {
        return dosis;
    }

    public void insertDosis(Integer isi) {
        this.dosis.add(isi);
    }

    public ArrayList<String> getrecordDosisSatuan() {
        return dosisSatuan;
    }

    public void insertDosisSatuan(String isi) {
        this.dosisSatuan.add(isi);
    }

    public ArrayList<String> getrecordSatuan() {
        return satuan;
    }

    public void insertSatuan(String isi) {
        this.satuan.add(isi);
    }

    public ArrayList<String> getrecordHargaBeli() {
        return hargaBeli;
    }

    public void insertHargaBeli(String isi) {
        this.hargaBeli.add(isi);
    }

    public ArrayList<String> getrecordHargaJual() {
        return hargaJual;
    }

    public void insertHargaJual(String isi) {
        this.hargaJual.add(isi);
    }

    public ArrayList<String> getrecordSisaObat() {
        return sisaObat;
    }

    public void insertSisaObat(String isi) {
        this.sisaObat.add(isi);
    }
   
}
