
package mobil;

public class TesClass {
    public static Mobil mobil1 = new Mobil();
    public static Mobil mobil2 = new Mobil();
    public static Mobil mobil3 = new Mobil();
    public static Mobil mobil4 = new Mobil();
    
    public static void infoMobil(int x){
        
        System.out.print("Mobi"+x+" "+mobil1.getMerk()+" "
                +mobil1.getWarna()+" "+mobil1.getTipe()+" "+mobil1.getCC()+" "+mobil1.getJumlah());
        System.out.println("");
        
    }
    
    public static void main(String[] args) {
        System.out.println("Data Karestiriktik Mobil"+"\n");
        System.out.println("Obyek"+" A"+"      B"+"    C"+"       D"+"    E");
        mobil1.setMerk("Toyota");
        mobil1.setWarna("Biru");
        mobil1.setTipe("minibus");
        mobil1.setCC(2000);
        mobil1.setJumlah(7);
        infoMobil(1);
        
        mobil2.setMerk("Daihatsu");
        mobil2.setWarna("Hitam");
        mobil2.setTipe("pick up");
        mobil2.setCC(1500);
        mobil2.setJumlah(2);
        infoMobil(2);
        
        mobil3.setMerk("Suzuki");
        mobil3.setWarna("Silver");
        mobil3.setTipe("suv");
        mobil3.setCC(1800);
        mobil3.setJumlah(5);
        infoMobil(3);
        
        mobil4.setMerk("Honda");
        mobil4.setWarna("Merah");
        mobil4.setTipe("sedan");
        mobil4.setCC(1300);
        mobil4.setJumlah(5);
        infoMobil(4);
        
        
    }
}
