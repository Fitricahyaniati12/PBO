package Percobaan5;

/*public class Dosen extends Pegawai {
    public String nidn;
    Pegawai pegawai;
    
    public Dosen () {
        pegawai = new Pegawai();
        System.out.println (pegawai.gaji) ;
        System. out.println ("Objek dari class Dosen dibuat") ;
    }
   /*  public String getAllInfo() {
        String info = getInfo();
        info += "NIDN : " + nidn + "\n"; 
        return info;
    }
}*/
        /*public String getAllInfo() {
            String info = this.getInfo();
            info += "NIDN : " + nidn + "\n"; 
            return info;
    }
}*/

    
  
   /*  public String getAllInfo () {
        String info = super.getInfo();
        info += "NIDN : " + nidn + "\n";
        return info;
    }
}*/

    //modify no4
     public class Dosen extends Pegawai {
        public String nidn;
    
        public Dosen() {
            System.out.println("Objek dari class Dosen dibuat");
        }
    
        public String getInfo() {
            return "NIDN : " + this.nidn + "\n"; 
        }
    
        public String getAllInfo() {
            String info = super.getInfo();
            info += this.getInfo(); 
            return info;
        }
     }
    
    