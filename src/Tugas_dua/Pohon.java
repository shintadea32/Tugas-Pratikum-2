/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_dua;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Pohon {
    //mendifinisikan atribut
    Scanner in = new Scanner(System.in);
    private String nama;
    private int tinggi;
    
    
    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return nama;
    }
    void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    int getTinggi(){
        return tinggi;
    }   
    }
