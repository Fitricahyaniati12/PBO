package Percobaan3;

public class Dosen {
    public String nidn;
    Pegawai pegawai;
    
    public Dosen () {
        pegawai = new Pegawai();
        System.out.println (pegawai.gaji) ;
        System. out.println ("Objek dari class Dosen dibuat") ;
    }

    public String getInfo(){
        String info = pegawai.getInfo();
        info += "NIDN   : " + nidn + "\n";
        return info;
    }   
}
