package Percobaan7;

/*public class Dosen {
    public String nidn;
    public String nip;  
    public String nama; 
    public double gaji; 

    // Constructor dengan parameter
    public Dosen(String nip, String nama, double gaji, String nidn) {
        this.nip = nip;     
        this.nama = nama;   
        this.gaji = gaji;  
        this.nidn = nidn;   
        System.out.println("Objek dari class Dosen dibuat dengan constructor berparameter");
    }

    // Constructor tanpa parameter
    public Dosen() {
        this.nip = "N/A";  
        this.nama = "N/A"; 
        this.gaji = 0.0;   
        this.nidn = "N/A"; 
        System.out.println("Objek dari class Dosen dibuat");
    }

    // Method untuk mendapatkan informasi Dosen
    public String getInfo() {
        return "NIDN   : " + this.nidn + "\n";
    }

    // Method untuk mendapatkan semua informasi
    public String getAllInfo() {
        return "NIP    : " + this.nip + "\n" +
               "Nama   : " + this.nama + "\n" +
               "Gaji   : " + this.gaji + "\n" +
               this.getInfo(); 
    }
}*/

    // Modify 2

/*public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji); 
        this.nidn = nidn;       
        System.out.println("Objek dari class Dosen dibuat dengan constructor berparameter");
    }

    // Method untuk mendapatkan informasi Dosen
    public String getInfo() {
        return "NIDN   : " + this.nidn + "\n";
    }

    // Method untuk mendapatkan semua informasi
    public String getAllInfo() {
        return super.getInfo() + this.getInfo(); 
    }
}*/

    // Modify 3
    
/*public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        super.nip = nip; 
        super.nama = nama; 
        super.gaji = gaji; 
        this.nidn = nidn; 
        System.out.println("Objek dari class Dosen dibuat dengan constructor berparameter");
    }

    // Method untuk mendapatkan informasi Dosen
    public String getInfo() {
        return "NIDN   : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        return super.getInfo() + this.getInfo(); 
    }
}*/

    //Modify 5 dan 6


    public class Dosen extends Pegawai {
        public String nidn;

        public Dosen(String nip, String nama, double gaji, String nidn) {
            super(nip, nama, gaji); 
            this.nidn = nidn; 
            System.out.println("Objek dari class Dosen dibuat dengan constructor berparameter");
        }
    
        // Method untuk mendapatkan informasi Dosen
        @Override
        public String getInfo() {
            return super.getInfo() + "NIDN   : " + this.nidn + "\n"; 
        }
    
        // Method untuk mendapatkan semua informasi
        public String getAllInfo() {
            return this.getInfo(); 
        }
    }
    
