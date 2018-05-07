package Comparable;

import Comparable.Comparable.BagianMuka;

public class Kartu {

    private BagianMuka bagianMuka;
    private String jenis;

    public Kartu(BagianMuka bagianMuka, String jenis) {
        this.bagianMuka = bagianMuka;
        this.jenis = jenis;
    }

    public BagianMuka getBagianMuka() {
        return bagianMuka;
    }

    public String getJenis() {
        return jenis;
    }

    @Override
    public String toString() {
        return "Bagian muka: " + bagianMuka + ", jenis: " + jenis;

    }
}
