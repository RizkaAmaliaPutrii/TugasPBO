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
public class DataSetAngsuran {
    private ArrayList<String> namaBiaya;
    private ArrayList<String> nominalBiaya;
    private ArrayList<String> ketBiaya;
    private ArrayList<String> tanggalBiaya;
    
    public DataSetAngsuran (){
        namaBiaya= new ArrayList<String>();
        nominalBiaya= new ArrayList<String>();
        ketBiaya= new ArrayList<String>();
        tanggalBiaya= new ArrayList<String>();
        
    }
     public void namaBiaya(String value){
        namaBiaya.add(value);
    }
     public ArrayList<String> getDataSetnamaBiaya(){
        return this.namaBiaya;
    }
    public void nominalBiaya(String value){
        nominalBiaya.add(value);
    }
     public ArrayList<String> getDataSetnominalBiaya(){
        return this.nominalBiaya;
    }
    public void ketBiaya(String value){
        ketBiaya.add(value);
    }
     public ArrayList<String> getDataSetketBiaya(){
        return this.ketBiaya;
    }
    
     public void tanggalBiaya(String value){
        tanggalBiaya.add(value);
    }
     public ArrayList<String> getDataSettanggalBiaya(){
        return this.tanggalBiaya;
    } 
         public void tambahData(String namaBiaya, String nominalBiaya, String ketBiaya, String tanggalBiaya){
         this.namaBiaya.add(namaBiaya);
         this.nominalBiaya.add(nominalBiaya);
         this.ketBiaya.add(ketBiaya);
         this.tanggalBiaya.add(tanggalBiaya);
     
       }
}
