/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.puskesmas;

import Puskesmas.Admin;
import Puskesmas.Detail_jadwal;
import Puskesmas.Dokter;
import Puskesmas.Obat;
import Puskesmas.Pasien;
import Puskesmas.RekamMedis;
import Puskesmas.Ruangan;

/**
 *
 * @author ASUS
 */
public class Puskesmas {
    
  public static void main(String[] args) {
        // Membuat objek Admin
        Admin Admin = new Admin("Aunu Rifky", 12, "123", "123", "Dokter", "Buntok", "Buntok", "12345", "S1","sudah Kawin");
        Admin.displayInfo();
        
        Detail_jadwal Detail_jadwal = new Detail_jadwal(01, "A01", "12 September");
        Detail_jadwal.displayInfo();
        
        Dokter Dokter = new Dokter("a01", "Aunu", "Jantung", 10, "perempuan", "Buntok", "Kota", "09852678", "12 September");
        Dokter.displayInfo();
       
        
        Obat Obat = new Obat("123", "Minum", "Paracetamol", "2 kali sehari", "12 kali", "12", "20000", "25000", 5);
        Obat.displayInfo();
       
        Pasien Pasien = new Pasien("123", "AunuRifky", "Buntok", 24, "Perempuan", "Kuli", "123", "aunu","123");
        Pasien.displayInfo();
        
        RekamMedis RekamMedis = new RekamMedis("123", "123", "10 September", "05:30", "123", "123", "Demam", "Sembuh");
        RekamMedis.displayInfo();
        
        Ruangan Ruangan = new Ruangan("123", "2C", 50);
        Ruangan.displayInfo();
    }
}
