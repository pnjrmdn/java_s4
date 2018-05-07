package Soal1;

public class Fish extends Animal implements Pet{
    
    private String name;
    
    public Fish(){
        super(0);
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void play(){
        System.out.println("Ikan tidak bermain");
    }
    
    public void walk(){
        System.out.println("Ikan tidak berjalan tetapi berenang");
    }
    
    public void eat(){
        System.out.println("Ikan Memakan pelet");
    }

    

}
