package Percobaan;

public class Demo11 {
    public static void main(String[] args) {
        Televisi11 tv1 = new Televisi11("Samsung", "QLED", 2022, "55 inci");
        
        System.out.println("Informasi Televisi:");
        System.out.println(tv1.getInfo());

        // Modifikasi nilai atribut
        tv1.setUkuranLayar("65 inci"); 
        
        System.out.println("Informasi Televisi setelah modifikasi:");
        System.out.println(tv1.getInfo());

        // Instansiasi objek Smartphone menggunakan constructor berparameter
        Smartphone11 smartphone1 = new Smartphone11("Apple", "iPhone 15", 2023, 3279);
        Smartphone11 smartphone2 = new Smartphone11("Apple", "iPhone 15 Plus", 2023, 4000);
        
        // Menampilkan informasi Smartphone
        System.out.println("Informasi Smartphone:");
        System.out.println(smartphone1.getInfo());

        smartphone1.setKapasitasBaterai(3500); 
        smartphone2.setTahunProduksi(2024); // Memanggil setter yang benar

        // Menampilkan informasi setelah modifikasi
        System.out.println("Informasi Smartphone setelah modifikasi:");
        System.out.println(smartphone1.getInfo());
    }
}
