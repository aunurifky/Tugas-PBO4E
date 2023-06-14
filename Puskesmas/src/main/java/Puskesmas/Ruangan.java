/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puskesmas;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Ruangan {
    private String idRuangan;
    private String namaRuangan;
    private String totalPasien;
    

    public Ruangan(String idRuangan, String namaRuangan) {
        this.idRuangan = idRuangan;
        this.namaRuangan = namaRuangan;
        this.totalPasien = totalPasien;
    }

    public String getIdRuangan() {
        return idRuangan;
    }

    public void setIdRuangan(String idRuangan) {
        this.idRuangan = idRuangan;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public void setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }

     public String gettotalPasien() {
        return totalPasien;
    }

    public void settotalPasien(String totalPasien) {
        this.totalPasien = totalPasien;
    }

    public void displayInfo() {
        System.out.println("Ruangan" + idRuangan);
        System.out.println("Ruangan" + namaRuangan);
         System.out.println("Ruangan" + totalPasien);
    }
        
}
