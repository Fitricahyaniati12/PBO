package InterfaceLatihan;

public class Kipas11 extends AlatElektronik11{
    private String jenis;

    public Kipas11 (String jenis, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getInfo() {
        return "Kipas: " + getMerk() + ", Harga: " + getHarga() + ", Warna: " + getWarna() + ", Jenis: " + jenis;
    }
}
    
