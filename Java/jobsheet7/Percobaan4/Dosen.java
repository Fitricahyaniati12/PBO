package Percobaan4;

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
    
    public String getAllInfo () {
        String info = "";
        info += "NIP    : " + pegawai.nip + "\n";
        info += "Nama   : " + pegawai.nama + "\n";
        info += "Gaji   : " + pegawai.gaji + "\n";
        info += "NIDN   : " + nidn + "\n";
        return info;
    } 
}
   /* public String getAllInfo() {
        String info = "";
        info += "NIP    : " + this.pegawai.nip + "\n";  
        info += "Nama   : " + this.pegawai.nama + "\n"; 
        info += "Gaji   : " + this.pegawai.gaji + "\n"; 
        info += "NIDN   : " + this.nidn + "\n";         
        return info;
    }*/ 

   /* public class Dosen extends Pegawai {  
        public String nidn;
    
        public Dosen() {
            super(); 
            System.out.println("Objek dari class Dosen dibuat");
        }
    
        public String getInfo() {
            String info = super.getInfo(); 
            info += "NIDN   : " + nidn + "\n";
            return info;
        }
    
        public String getAllInfo() {
            String info = "";
            info += "NIP    : " + super.nip + "\n";    
            info += "Nama   : " + super.nama + "\n";   
            info += "Gaji   : " + super.gaji + "\n";   
            info += "NIDN   : " + this.nidn + "\n";    
            return info;
        }
    } */
    
