
public class motorstruktural {

    public static void main(String[] args) {
        String merek1, merek2, merek3, merek4, merek5, merek6, merek7, merek8, merek9, merek10;
        int kecepatan1, kecepatan2, kecepatan3, kecepatan4, kecepatan5, kecepatan6, kecepatan7, kecepatan8, kecepatan9, kecepatan10;
        String model1, model2, model3, model4, model5, model6, model7, model8, model9, model10;

        merek1 = "Yamaha";
        kecepatan1 = 150;
        model1 = "Shogun";
        
        merek2 = "Yamaha";
        kecepatan2 = 125;
        model2 = "Aerox";

        merek3 = "Yamaha";
        kecepatan3 = 150;
        model3 = "Aerox";

        merek4 = "Suzuki";
        kecepatan4 = 135;
        model4 = "Supra";

        merek5 = "Suzuki";
        kecepatan5 = 110;
        model5 = "Shogun";

        merek6 = "Honda";
        kecepatan6 = 125;
        model6 = "Beat";

        merek7 = "Honda";
        kecepatan7 = 155;
        model7 = "Vino";

        merek8 = "Honda";
        kecepatan8 = 125;
        model8 = "Vario";

        merek9 = "Honda";
        kecepatan9 = 125;
        model9 = "Filanio";

        merek10 = "Honda";
        kecepatan10 = 175;
        model10 = "Delux";

        kecepatan1 = tambahKecepatan(kecepatan1, 10);
        kecepatan2 = tambahKecepatan(kecepatan2, 15);
        kecepatan3 = tambahKecepatan(kecepatan3, 20);
        kecepatan4 = tambahKecepatan(kecepatan4, 25);
        kecepatan5 = tambahKecepatan(kecepatan5, 30);
        kecepatan6 = tambahKecepatan(kecepatan6, 35);
        kecepatan7 = tambahKecepatan(kecepatan7, 40);
        kecepatan8 = tambahKecepatan(kecepatan8, 45);
        kecepatan9 = tambahKecepatan(kecepatan9, 50);
        kecepatan10 = tambahKecepatan(kecepatan10, 55);

        
        System.out.println("================================");
        System.out.println("Dealer motor Cahya");
        System.out.println("================================");


        System.out.println("Merek 1: " + merek1 + ", Kecepatan: " + kecepatan1);
        System.out.println("Merek 2: " + merek2 + ", Kecepatan: " + kecepatan2);
        System.out.println("Merek 3: " + merek3 + ", Kecepatan: " + kecepatan3);
        System.out.println("Merek 4: " + merek4 + ", Kecepatan: " + kecepatan4);
        System.out.println("Merek 5: " + merek5 + ", Kecepatan: " + kecepatan5);
        System.out.println("Merek 6: " + merek6 + ", Kecepatan: " + kecepatan6);
        System.out.println("Merek 7: " + merek7 + ", Kecepatan: " + kecepatan7);
        System.out.println("Merek 8: " + merek8 + ", Kecepatan: " + kecepatan8);
        System.out.println("Merek 9: " + merek9 + ", Kecepatan: " + kecepatan9);
        System.out.println("Merek 10: " + merek10 + ", Kecepatan: " + kecepatan10);
    }

    // Method penambahan kecapatan
    public static int tambahKecepatan(int kecepatan, int increment) {
        kecepatan += increment;
        return kecepatan;
    }

    // Method pengurangan kecepatan
    public static int kurangiKecepatan(int kecepatan, int decrement) {
        kecepatan -= decrement;
        return kecepatan;
    }
}
