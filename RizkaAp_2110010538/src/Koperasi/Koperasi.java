/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Koperasi;
import DataSet.DataSetAnggota;
import DataSet.DataSetAngsuran;
import forms.FrameUtama;

/**
 *
 * @author Wika
 */
public class Koperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        anggota data = new anggota();
//        data.setNomer("1234");
//        data.setNama("Rizka");
//        data.setAlamat("Banjarmasin");
//        data.setTempatLahir("Barabai");
//        data.setTanggalLahir("17 Juni 2003");
//        data.setJenisKelamin("Perempuan");
//        data.setUmur("20");
//        data.setAgama("Islam");
//        //OUTPUT
//        System.out.println("NOMER saya adalah : " +data.getNomer());
//        System.out.println("Nama saya adalah : " +data.getNama());
//        System.out.println("Alamat saya di : " +data.getAlamat());
//        System.out.println("Tempat lahir di : " +data.getTempatLahir());
//        System.out.println("Tanggal lahir saya : " +data.getTanggalLahir());
//        System.out.println("Jenis kelamin saya : " +data.getJenisKelamin());
//        System.out.println("Umur saya : " +data.getUmur()+" Tahun");
//        System.out.println("Agama saya : " +data.getAgama());
//        
//        angsuran angsur = new angsuran();
//        angsur.setNamaBiaya("Bayar tabungan");
//        angsur.setNominalBiaya("100.000");
//        angsur.setKetBiaya("Tabungan bulan juni");
//        angsur.setTanggalBiaya("17 Juni 2023");
//        //OUTPUT        
//        System.out.println("Biaya digunakan untuk : " +angsur.getNamaBiaya());
//        System.out.println("Nominalnya yaitu : " +angsur.getNominalBiaya());
//        System.out.println("Keterangan biaya : " +angsur.getKetBiaya());
//        System.out.println("Tanggal biaya : " +angsur.getTanggalBiaya());
          
          DataSetAnggota anggota = new DataSetAnggota();
          System.out.println("===============================");
          System.out.println("|          DATA ANGGOTA        |");
          System.out.println("===============================");
          anggota.nomer("1234");
          anggota.nama("Rizka");
          anggota.alamat("Banjarmasin");
          anggota.tempatLahir("Barabai");
          anggota.tanggalLahir("17 Juni 2003");
          anggota.jenisKelamin("Perempuan");
          anggota.umur("20");
          anggota.agama("Islam");
              
          System.out.println("Nomer        : "+anggota.getDataSetnomer().get(0));
          System.out.println("Nama         : "+anggota.getDataSetnama().get(0));
          System.out.println("Alamat       : "+anggota.getDataSetalamat().get(0));
          System.out.println("TempatLahir  : "+anggota.getDataSettempatLahir().get(0));
          System.out.println("TanggalLahir : "+anggota.getDataSettanggalLahir().get(0));
          System.out.println("JenisKelamin : "+anggota.getDataSetjenisKelamin().get(0));
          System.out.println("Umur         : "+anggota.getDataSetumur().get(0));
          System.out.println("Agama        : "+anggota.getDataSetagama().get(0));
          
          FrameUtama formsaya = new FrameUtama();
          formsaya.setVisible(true); 
          
          DataSetAngsuran angsuran = new DataSetAngsuran();
          System.out.println("===============================");
          System.out.println("|          DATA ANGSURAN        |");
          System.out.println("===============================");
          
    }
    
}
