package Comparable;

import Comparable.Comparable.BagianMuka;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class TumpukanKartu {
    private static final List<Kartu> protoDeck = new Vector<Kartu>();
    
    public TumpukanKartu() { 
    }
    
    public TumpukanKartu(List tumpukanKartu) { 
    }
    
    public void insialisasi () {
        for (BagianMuka bagMuka : BagianMuka.values() ) {
            protoDeck.add(new Kartu (bagMuka, "Hati"));
        }
        for (BagianMuka bagMuka : BagianMuka.values() ) {
            protoDeck.add(new Kartu (bagMuka, "Waru"));
        }
        for (BagianMuka bagMuka : BagianMuka.values() ) {
            protoDeck.add(new Kartu (bagMuka, "Wajik"));
        }
        for (BagianMuka bagMuka : BagianMuka.values() ) {
            protoDeck.add(new Kartu (bagMuka, "Keriting"));
        }
    }
    
    public void acakKartu() {
        Collections.shuffle(protoDeck);
    }
    
    @Override
    public String toString () {
        return protoDeck.toString();
    }
    
    public Kartu ambilSatuKartu() {
        Random generator = new Random();
        int rnd = generator.nextInt (protoDeck.size());
        return protoDeck.get(rnd);
    }
    
    public Vector bagiKartu (int n) {
        Vector temp = new Vector (0,n);
        temp.addAll(protoDeck.subList(0,n));
        int l = 0;
        while ( l < n) {
            protoDeck.remove(0);
            l++;
        }
        return temp;
        }
        
    public Kartu getKartu() {
        return (Kartu) protoDeck;
    }
    
    public void setKartu (Kartu val) {
        
    }

}
