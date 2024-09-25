import java.time.LocalDate;

public class RumahSakitDemo01 {
    public static void main(String[] args) {
        Pegawai01 ani = new Pegawai01("1234", "dr. Ani");
        Pegawai01 bagus = new Pegawai01("4567", "dr. Bagus");
        Pegawai01 desi = new Pegawai01("7890", "Ns. Desi");
        Pegawai01 eka = new Pegawai01("6789", "Ns. Eka");
        
        Pasien01 pasien1 = new Pasien01("343298", "Puspa Widya");

        // Menambahkan konsultasi untuk pasien
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);

        // Menampilkan informasi pasien
        System.out.println(pasien1.getInfo());

        // Instansiasi pasien kedua
        Pasien01 pasien2 = new Pasien01("997744", "Yenny Anggraeni");

        // Menampilkan informasi pasien kedua
        System.out.println(pasien2.getInfo());
    }
}
