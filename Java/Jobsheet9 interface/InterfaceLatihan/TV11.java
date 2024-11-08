package InterfaceLatihan;

/*public class TV11 extends AlatElektronik11 {
    private String jenisLayar;
    private int volume;

    public TV11(String jenisLayar, int volume, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    public String getJenisLayar() {
        return jenisLayar;
    }

    public void setJenisLayar(String jenisLayar) {
        this.jenisLayar = jenisLayar;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}*/

public class TV11 extends AlatElektronik11 implements Audible11 {
    private String jenisLayar;
    private int volume;

    public String getJenisLayar() {
        return jenisLayar;
    }

    public void setJenisLayar(String jenisLayar) {
        this.jenisLayar = jenisLayar;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public TV11(String jenisLayar, int volume, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    @Override
    public void naikkanVolume(int increment) {
        this.volume += increment;
    }

    @Override
    public void turunkanVolume(int decrement) {
        volume += decrement;
    }

    public String getInfo() {
        return "TV: " + getMerk() + ", Harga: " + getHarga() + ", Warna: " + getWarna() + ", Jenis Layar: " + jenisLayar + ", Volume: " + volume;
    }
}



       /*  this.volume -= decrement;
        if (this.volume < 0) {
            this.volume = 0;
        }
    }
}*/

