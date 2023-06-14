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
public class dataSetDetail_jadwal {
    private ArrayList<Integer> idJadwal;
    private ArrayList<String> kodePasien;
    private ArrayList<String> tanggal;
    
     //constructor
    public dataSetDetail_jadwal () {
        idJadwal = new ArrayList<Integer>();
        kodePasien= new ArrayList<String> ();
        tanggal= new ArrayList<String> ();
       
    }
    
     public void insertidJadwal(Integer isi){
        idJadwal.add(isi);
    }
    public ArrayList<Integer> getrecordidJadwal(){
        return this.idJadwal;
    }
     public void insertkodePasien(String isi){
        kodePasien.add(isi);
    }
    public ArrayList<String> getrecordkodePasien(){
        return this.kodePasien;
    }
     public void inserttanggal(String isi){
        tanggal.add(isi);
    }
    public ArrayList<String> getrecordnamaLengkap(){
        return this.tanggal;
    }
    
    
}
