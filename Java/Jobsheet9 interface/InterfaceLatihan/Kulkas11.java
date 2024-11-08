package InterfaceLatihan;

public class Kulkas11 extends AlatElektronik11 {
    private int jumlahPintu;

    public Kulkas11(int jumlahPintu, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public String getInfo() {
        return "Kulkas: " + getMerk() + ", Harga: " + getHarga() + ", Warna: " + getWarna() + ", Jumlah Pintu: " + jumlahPintu;
    }
}