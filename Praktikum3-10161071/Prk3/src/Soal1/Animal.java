package Soal1;

public abstract class Animal {
    
    protected int legs;
    
    protected Animal(int legs){
        this.legs = legs;
    }
    
    public void walk(){
        System.out.println("Hewan dapat berjalan");
    }
    
    public void eat(){
        System.out.println("Hewan memiliki rasa lapar");
    }
    
    

}
