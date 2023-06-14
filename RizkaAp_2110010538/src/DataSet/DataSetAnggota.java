/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataSet;

import java.util.ArrayList;

/**
 *
 * @author Wika
 */
public class DataSetAnggota {
    private ArrayList<String> nomer;
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<String> tempatLahir;
    private ArrayList<String> tanggalLahir;
    private ArrayList<String> jenisKelamin;
    private ArrayList<String> umur;
    private ArrayList<String> agama;
    
    public DataSetAnggota (){
        nomer= new ArrayList<String>();
        nama= new ArrayList<String>();
        alamat = new ArrayList<String>();
        tempatLahir = new ArrayList<String>();
        tanggalLahir = new ArrayList<String>();
        jenisKelamin = new ArrayList<String>();
        umur = new ArrayList<String>();
        agama = new ArrayList<String>();
    }
    
    public void nomer(String value){
        nomer.add(value);
    }
     public ArrayList<String> getDataSetnomer(){
        return this.nomer;
    }
    public void nama(String value){
        nama.add(value);
    }
     public ArrayList<String> getDataSetnama(){
        return this.nama;
    }
    public void alamat(String value){
        alamat.add(value);
    }
     public ArrayList<String> getDataSetalamat(){
        return this.alamat;
    }
     public void tempatLahir(String value){
        tempatLahir.add(value);
    }
     public ArrayList<String> getDataSettempatLahir(){
        return this.tempatLahir;
    }
     public void tanggalLahir(String value){
        tanggalLahir.add(value);
    }
     public ArrayList<String> getDataSettanggalLahir(){
        return this.tanggalLahir;
    }
     public void jenisKelamin(String value){
        jenisKelamin.add(value);
    }
     public ArrayList<String> getDataSetjenisKelamin(){
        return this.jenisKelamin;
    }
     public void umur(String value){
        umur.add(value);
    }
     public ArrayList<String> getDataSetumur(){
        return this.umur;
    }
     public void agama(String value){
        agama.add(value);
    }
     public ArrayList<String> getDataSetagama(){
        return this.agama;
    }
     
     public void tambahData(String nomer, String nama, String alamat, String tempatLahir, String tanggalLahir, String jenisKelamin, String umur, String agama){
         this.nomer.add(nomer);
         this.nama.add(nama);
         this.alamat.add(alamat);
         this.tempatLahir.add(tempatLahir);
         this.tanggalLahir.add(tanggalLahir);
         this.jenisKelamin.add(jenisKelamin);
         this.umur.add(umur);
         this.agama.add(agama);
     }     

    public Object getDatasetNomer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
