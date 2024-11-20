package polymorphismquiz2;

public class Gedung11 extends Bangunan11 {
    private int jumlahLantai;

    public Gedung11(String nama, int luas, int jumlahLantai) {
        super(nama, luas);
        this.jumlahLantai = jumlahLantai;
    }

    @Override
    public void hitungBiaya() {
        int biaya = luas * jumlahLantai * 1500000; // Biaya per lantai
        System.out.println(nama + " biaya konstruksi: Rp " + biaya);
    }

    public void infoGedung() {
        System.out.println(nama + " memiliki " + jumlahLantai + " lantai.");
    }
}
