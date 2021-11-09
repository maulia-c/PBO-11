/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.ArrayList;
import static java.util.Collections.binarySearch;
import java.util.Scanner;

/**
 *
 * @author Maulia
 */
public class ArrayProcessing {
    ArrayList<String> data = new ArrayList<>();
    
    void tambahdata() {
        Scanner tambah = new Scanner(System.in);
        System.out.println("Masukkan data string: ");
        data.add(tambah.nextLine());
        System.out.println("Daftar string dalam array list:" + data);
        tambah.nextLine();
    }
    void caridata() {
        Scanner caridata = new Scanner(System.in);
        System.out.println("String yang mau dicari: ");
        String cari = caridata.nextLine();
        if(binarySearch(data,cari) > -1){
            System.out.println("String " + cari + " ada di index ke " + binarySearch(data,cari) +" di dalam data");
        } else {
            System.out.println("String " + cari + " tidak ada dalam data");
        }
        
    }
    void hapusdata() {
        Scanner hapus = new Scanner(System.in);
        System.out.println("String yang mau dihapus: ");
        String delete = hapus.nextLine();
        if(binarySearch(data,delete) > -1){
            data.remove(binarySearch(data,delete));
            System.out.println("String " + delete + " sudah dihapus di dalam data");
        } else {
            System.out.println("String " + delete + " tidak ada dalam data");
        }
        
    }
    
    void tampildata() {
        System.out.println("Daftar string dalam array list:" + data);
    }
}
