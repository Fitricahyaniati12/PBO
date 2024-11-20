package polymorphismquiz2;

public abstract class Bangunan11 {
    protected String nama;
    protected int luas;

    public Bangunan11(String nama, int luas) {
        this.nama = nama;
        this.luas = luas;
    }

    public abstract void hitungBiaya();

    public String getNama() {
        return nama;
    }

    public int getLuas() {
        return luas;
    }
}
