public class Pegawai11 {
    public String nip;
    public String nama;

    public Pegawai11(){

    }

    public Pegawai11(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }

    public void displayInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
    }
    
}
