package polymorphismquiz2;

public class PolymorphismDemo11 {
    public static void main(String[] args) {
        // Heterogeneous Collection
        System.out.println();
        Bangunan11[] bangunans = {
            new Rumah11("Rumah Chy'a", 120, 4),
            new Gedung11("Gedung DPR", 500, 15),
            new Mall11("Mall Panakkukang", 1000, 55)
        };

        // Polymorphic arguments
        for (Bangunan11 bangunan : bangunans) {
            tampilkanInfo(bangunan);

            // Menggunakan instanceof dan Object Casting
            if (bangunan instanceof Rumah11) {
                ((Rumah11) bangunan).infoRumah();
            } else if (bangunan instanceof Gedung11) {
                ((Gedung11) bangunan).infoGedung();
            } else if (bangunan instanceof Mall11) {
                ((Mall11) bangunan).infoMall();
            }

            System.out.println(); 
        }
    }

    // Metode polymorphic yang menerima parameter dari kelas induk
    public static void tampilkanInfo(Bangunan11 bangunan) {
        System.out.println("Nama Bangunan: " + bangunan.getNama());
        bangunan.hitungBiaya();
    }

}
