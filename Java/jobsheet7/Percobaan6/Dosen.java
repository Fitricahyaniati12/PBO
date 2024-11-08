package Percobaan6;

public class Dosen {
    public String nidn;
    Pegawai pegawai;
    
    public Dosen (String nip, String nama, double gaji, String nidn) {
        pegawai = new Pegawai(nip,nama,gaji);
        this.nidn=nidn;
        System.out.println("Objek dari class Dosen dibuat dengan constructor berparameter") ;
    }

    public Dosen () {
        pegawai = new Pegawai();
        System.out.println (pegawai.gaji) ;
        System. out.println ("Objek dari class Dosen dibuat") ;
    }

    public String getInfo(){
        // String info = pegawai.getInfo();
        // info += "NIDN   : " + nidn + "\n";
        // return info;
        return "NIDN   : " + nidn + "\n";
    }
    
    public String getAllInfo () {
        String info = pegawai.getInfo();
        info += this.getInfo();
        return info;
    }
}
