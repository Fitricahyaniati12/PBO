package testinheritance;

import testpackage.Pegawai;  
public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println("Objek dari class Dosen dibuat");
        this.gaji = 5000000;
    }

    public String getDosenInfo() {
        String info = super.getInfo();  // Panggil method dari class Pegawai
        info += "NIDN   : " + nidn + "\n";
        return info;
    }
}
    

