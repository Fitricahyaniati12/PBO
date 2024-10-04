package Percobaan;

public class Televisi11 extends Elektronik11 {
    // Atribut tambahan
    private String ukuranLayar;

    // Constructor tanpa parameter
    public Televisi11() {
        super(); // Memanggil constructor tanpa parameter dari Elektronik
        this.ukuranLayar = "N/A";
    }

    // Constructor berparameter
    public Televisi11(String merk, String model, int tahunProduksi, String ukuranLayar) {
        super(merk, model, tahunProduksi); // Memanggil constructor berparameter dari Elektronik
        this.ukuranLayar = ukuranLayar;
    }

    // Method untuk mendapatkan informasi televisi
    @Override
    public String getInfo() {
        return super.getInfo() + "Ukuran Layar  : " + ukuranLayar + "\n";
    }

    // Getter untuk ukuranLayar
    public String getUkuranLayar() {
        return ukuranLayar;
    }

    // Setter untuk ukuranLayar
    public void setUkuranLayar(String ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }
}
