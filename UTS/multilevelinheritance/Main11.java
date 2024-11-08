package multilevelinheritance;

public class Main11 {
    public static void main(String[] args) {
        // Transaksi 1
        TransaksiKartuKredit11 transaksiKartuKredit1 = new TransaksiKartuKredit11("BTR178", 250000, "Kartu Kredit", "1234-3467-4878-9085", "Chy'a");
        transaksiKartuKredit1.prosesTransaksi();
        transaksiKartuKredit1.validasiPembayaran();
        transaksiKartuKredit1.otorisasiKartu();

        // Transaksi 2
        System.out.println();
        TransaksiKartuKredit11 transaksiKartuKredit2 = new TransaksiKartuKredit11("RRQ179", 300000, "Kartu Kredit", "1234-5678-9101-1121", "Bubu");
        transaksiKartuKredit2.prosesTransaksi();
        transaksiKartuKredit2.validasiPembayaran();
        transaksiKartuKredit2.otorisasiKartu();

      
    }
}
