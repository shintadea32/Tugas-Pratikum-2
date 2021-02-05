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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner in = new Scanner(System.in);
      String nama;
      int tinggi;
      
        System.out.println("Masukkan nama : ");
        nama=in.nextLine();
        System.out.println("Masukkan tinggi : ");
        tinggi=in.nextInt();
        
        Pohon cemara = new Pohon ();
        cemara.setNama(nama);
        cemara.setTinggi(tinggi);
        
        System.out.println("Nama Pohon : "+cemara.getNama());
        System.out.println("Tinggi Pohon : "+cemara.getTinggi());
      
        Pohon kelapa = new Pohon ();   
        kelapa.setNama(nama);
        kelapa.setTinggi(tinggi);
        
        
       
    }
    
}
