/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katak;

/**
 *
 * @author ACER
 */
public class TesTugas2 {
	public static void main(String[] args) {
        Katak O1 = new Katak(5, "Froggy");
        Kecebong O2 = new Kecebong(2, "Junior Frog", 10);
        
        System.out.println("O1");
        System.out.println("Umur: " + O1.getUmur());
        System.out.println("Nama: " + O1.getNama());
        System.out.println("Cara Bergerak: " + O1.caraBergerak());
        
        System.out.println("O2");
        System.out.println("Umur: " + O2.getUmur());
        System.out.println("Nama: " + O2.getNama());
        System.out.println("Panjang Ekor: " + O2.panjangEkor);
        System.out.println("Cara Bergerak: " + O2.caraBergerak());
        
    }
}
