package InterfaceLatihan;

public class Main11 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("-------------------------------------------");
  
        Kipas11 kipas = new Kipas11("Kipas Angin Berdiri", 450000, "Pink", "Panasonic");
        Kulkas11 kulkas = new Kulkas11(2, 75000000, "Red", "Samsung");
        TV11 tv = new TV11("LED", 15, 55000000, "Blue", "Sony");
        SmartFridge11 smartFridge = new SmartFridge11(300, 3, 10000000, "Hitam", "LG");
        Kulkas11 kulkasBaru = new Kulkas11(4, 3500000, "Putih", "Sharp");

        System.out.println(kipas.getInfo());
        System.out.println(kulkas.getInfo());
        System.out.println(tv.getInfo());
        System.out.println(smartFridge.getInfo());
        System.out.println(kulkasBaru.getInfo());

        System.out.println("-------------------------------------------");
        System.out.println();
        

    }
}
