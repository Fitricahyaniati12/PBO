package Experiment1.Exercise;

class Ikan {
    public void swim() {
        System.out.println("Ikan bisa berenang");
    }
}

class Piranha extends Ikan {
    @Override
    public void swim() {
        System.out.println("Piranha bisa makan daging");
    }
}

public class Fish11 {
    public static void main(String[] args) {
        Ikan a = new Ikan();
        Ikan b = new Piranha();
        
        a.swim();  
        b.swim();  
    }
    
}