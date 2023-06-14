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
public class dataSetAdmin {
    private ArrayList<String> namaLengkap;
    private ArrayList<Integer> iduser;
    private ArrayList<String> userId;
    private ArrayList<String> password;
    private ArrayList<String> jabatan;
    private ArrayList<String> alamat;
    private ArrayList<String> kota;
    private ArrayList<String> telepon;
    private ArrayList<String> pendidikan;
    private ArrayList<String> statusPerkawinan;
    
    //constructor
    public dataSetAdmin () {
        namaLengkap = new ArrayList<String>();
        iduser = new ArrayList<Integer> ();
        userId = new ArrayList<String> ();
        password = new ArrayList<String> ();
        jabatan = new ArrayList<String> ();
        alamat = new ArrayList<String> ();
        kota = new ArrayList<String> ();
        telepon = new ArrayList<String> ();
        pendidikan = new ArrayList<String> ();
        statusPerkawinan = new ArrayList<String> ();
    }
    
    public void insertnamaLengkap(String isi){
        this.namaLengkap.add(isi);
    }
    public ArrayList<String> getrecordnamaLengkap(){
        return this.namaLengkap;
    }
    
    public void insertiduser(Integer isi){
        this.iduser.add(isi);
    }
    public ArrayList<Integer> getiduser(){
        return this.iduser;
    }
    public void insertuserId(String isi){
        this.userId.add(isi);
    }
    public ArrayList<String> getrecorduserId(){
        return this.userId;
    }
    public void insertpassword(String isi){
        this.password.add(isi);
    }
    public ArrayList<String> getrecordpassword(){
        return this.password;
    }
    public void insertjabatan(String isi){
        this.jabatan.add(isi);
    }
    public ArrayList<String> getrecordjabatan(){
        return this.jabatan;
    }
    public void insertalamat(String isi){
        this.alamat.add(isi);
    }
    public ArrayList<String> getrecordalamat(){
        return this.alamat;
    }
    public void insertkota(String isi){
        this.kota.add(isi);
    }
    public ArrayList<String> getrecordkota(){
        return this.kota;
    }
    public void inserttelepon(String isi){
        this.telepon.add(isi);
    }
    public ArrayList<String> getrecordtelepon(){
        return this.telepon;
    }
    public void insertpendidikan(String isi){
       this.pendidikan.add(isi);
    }
    public ArrayList<String> getrecordpendidikan(){
        return this.pendidikan;
    }
    public void insertstatusPerkawinan(String isi){
        this.statusPerkawinan.add(isi);
    }
    public ArrayList<String> getrecordstatusPerkawinan(){
        return this.statusPerkawinan;
    }
             
    
}
