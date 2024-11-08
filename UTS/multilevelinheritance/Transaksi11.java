package multilevelinheritance;

public class Transaksi11 {
    String idTransaksi;
    double jumlah;

    public Transaksi11(String idTransaksi, double jumlah) {
        this.idTransaksi = idTransaksi;
        this.jumlah = jumlah;
    }

    public void prosesTransaksi() {
        System.out.println("Memproses transaksi dengan ID: " + idTransaksi + " sebesar: " + jumlah);
    }
}


