package InterfaceLatihan;

// lankagkah4
/*public class SmartFridge11 extends Kulkas11 {
    private int volume;

    public SmartFridge11(int volume, int jumlahPintu, double harga, String warna, String merk) {
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}*/

// langkah 8
public class SmartFridge11 extends Kulkas11 implements Audible11 {
    private int volume;

    public SmartFridge11(int volume, int jumlahPintu, double harga, String warna, String merk) {
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }

    @Override
    public void naikkanVolume(int increment) {
        volume += increment;
    }

    @Override
    public void turunkanVolume(int decrement) {
        volume -= decrement;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public String getInfo() {
        return "Smart Fridge: " + getMerk() + ", Harga: " + getHarga() + ", Warna: " + getWarna() + ", Jumlah Pintu: " + getJumlahPintu() + ", Volume: " + volume;
    }
}