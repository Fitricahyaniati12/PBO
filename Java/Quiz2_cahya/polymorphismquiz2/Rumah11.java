package polymorphismquiz2;

public class Rumah11 extends Bangunan11 {
    private int jumlahKamar;

    public Rumah11(String nama, int luas, int jumlahKamar) {
        super(nama, luas);
        this.jumlahKamar = jumlahKamar;
    }

    @Override
    public void hitungBiaya() {
        int biaya = luas * 1000000; // Biaya konstruksi per m2
        System.out.println(nama + " biaya konstruksi: Rp " + biaya);
    }

    public void infoRumah() {
        System.out.println(nama + " memiliki " + jumlahKamar + " kamar.");
    }
}
    
