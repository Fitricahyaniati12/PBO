package multilevelinheritance;

public class TransaksiKartuKredit11 extends TransaksiOnline11 {
    String nomorKartu;
    String namaPemilik;

    public TransaksiKartuKredit11(String idTransaksi, double jumlah, String metodePembayaran, String nomorKartu, String namaPemilik) {
        super(idTransaksi, jumlah, metodePembayaran);
        this.nomorKartu = nomorKartu;
        this.namaPemilik = namaPemilik;
    }

    public void otorisasiKartu() {
        System.out.println("Otorisasi kartu kredit dengan nomor: " + nomorKartu + " atas nama: " + namaPemilik);
    }
    
}
