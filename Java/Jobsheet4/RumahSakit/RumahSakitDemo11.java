import java.time.LocalDate;

public class RumahSakitDemo11 {
    public static void main(String[] args) {
        
        Pegawai11 ani = new Pegawai11("1234", "dr. Ani");
        Pegawai11 bagus = new Pegawai11("4567", "dr. Bagus");
        Pegawai11 desi = new Pegawai11("7890", "Ns. Desi");
        Pegawai11 eka = new Pegawai11("6789", "Ns. Eka");
        
     
        Pasien11 pasieni = new Pasien11("343298", "Puspa Widya");
        
        
        pasieni.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
        pasieni.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);
        
        System.out.println(pasieni.getInfo());
        
        Pasien11 pasien2 = new Pasien11("997744", "Yenny Anggraeni");
        
        System.out.println(pasien2.getInfo());
    }
}

    
