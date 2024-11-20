package polymorphismquiz2;

public class Mall11 extends Bangunan11 {
    private int jumlahToko;

    public Mall11(String nama, int luas, int jumlahToko) {
        super(nama, luas);
        this.jumlahToko = jumlahToko;
    }

    @Override
    public void hitungBiaya() {
        int biaya = luas * 2000000; // Biaya konstruksi khusus untuk mall
        System.out.println(nama + " biaya konstruksi: Rp " + biaya);
    }

    public void infoMall() {
        System.out.println(nama + " memiliki " + jumlahToko + " toko.");
    }
}