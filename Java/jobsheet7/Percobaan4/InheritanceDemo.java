package Percobaan4;

public class InheritanceDemo {
    public static void main (String[] args) {
        Dosen dosen1 = new Dosen () ;
        
        dosen1.pegawai.nama = "Yansy Ayuningtyas";
        dosen1.pegawai.nip = "34329837";
        dosen1.pegawai.gaji = 3000000;
        dosen1.nidn = "1989432439";
        
        System.out.println (dosen1.getAllInfo () ) ;
    }
}
        /*dosen1.nama = "Yansy Ayuningtyas"; 
        dosen1.nip = "34329837";           
        dosen1.gaji = 3000000;            
        dosen1.nidn = "1989432439";        

        // Menampilkan semua informasi dosen
        System.out.println(dosen1.getAllInfo());
     }
 }  */