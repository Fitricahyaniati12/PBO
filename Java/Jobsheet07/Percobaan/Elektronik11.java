package Percobaan;

public class Elektronik11 {
    // Atribut
    protected String merk;
    protected String model;
    protected int tahunProduksi;

    // Constructor tanpa parameter
    public Elektronik11() {
        this.merk = "N/A";
        this.model = "N/A";
        this.tahunProduksi = 0;
    }

    // Constructor berparameter
    public Elektronik11(String merk, String model, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    // Method untuk mendapatkan informasi elektronik
    public String getInfo() {
        return "Merk          : " + merk + "\n" +
               "Model         : " + model + "\n" +
               "Tahun Produksi: " + tahunProduksi + "\n";
    }
}

    

