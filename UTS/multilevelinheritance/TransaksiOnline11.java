package multilevelinheritance;

public class TransaksiOnline11 extends Transaksi11 {
    String metodePembayaran;

    public TransaksiOnline11(String idTransaksi, double jumlah, String metodePembayaran) {
        super(idTransaksi, jumlah);
        this.metodePembayaran = metodePembayaran;
    }

    public void validasiPembayaran() {
        System.out.println("Validasi pembayaran melalui " + metodePembayaran);
    }
    
}
