package Percobaan;

public class Smartphone11 extends Elektronik11 {
    private int kapasitasBaterai;

    // Constructor tanpa parameter
    public Smartphone11() {
        super();
        this.kapasitasBaterai = 0;
    }

    // Constructor berparameter
    public Smartphone11(String merk, String model, int tahunProduksi, int kapasitasBaterai) {
        super(merk, model, tahunProduksi);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    // Getter dan Setter untuk kapasitasBaterai
    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }
    
    // Setter untuk tahunProduksi
    public void setTahunProduksi(int tahunProduksi) {
        super.tahunProduksi = tahunProduksi; // Memanggil setter di parent class
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Kapasitas Baterai: " + this.kapasitasBaterai + " mAh\n";
    }
}
