package Comparable;

public class TestPrak {

    public static void main(String[] args) {
        TumpukanKartu tk = new TumpukanKartu();
        tk.insialisasi();

        System.out.println("\nSEBELUM DIACAK\n");
        System.out.println(tk.toString());

        System.out.println("\nSETELAH DIACAK\n");

        tk.acakKartu();
        System.out.println(tk.toString());
    }
}
