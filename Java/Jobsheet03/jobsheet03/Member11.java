package jobsheet03;

import java.text.DecimalFormat;

public class Member11 {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int pinjamanSaatIni;

    // Format untuk mata uang
    private static DecimalFormat currencyFormat = new DecimalFormat("###,###.###");

    // Konstruktor
    public Member11(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.pinjamanSaatIni = 0; // Awalnya pinjaman 0
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter limit pinjaman
    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    // Getter jumlah pinjaman saat ini
    public int getPinjamanSaatIni() {
        return pinjamanSaatIni;
    }

    // Method untuk meminjam uang
    public void pinjam(int jumlah) {
        if (jumlah > 0) {
            if (pinjamanSaatIni + jumlah <= limitPinjaman) {
                pinjamanSaatIni += jumlah;
                System.out.println("Jumlah pinjaman saat ini: " + currencyFormat.format(pinjamanSaatIni));
            } else {
                System.out.println("Maaf, jumlah pinjaman melebihi limit.");
            }
        } else {
            System.out.println("Jumlah pinjaman tidak valid.");
        }
    }

    // Method untuk membayar angsuran
    public void angsur(int jumlah) {
        if (jumlah > 0) {
            int minimalAngsuran = (int) (pinjamanSaatIni * 0.1); // 10% dari pinjaman saat ini
            if (jumlah < minimalAngsuran) {
                System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman.");
            } else if (pinjamanSaatIni >= jumlah) {
                pinjamanSaatIni -= jumlah;
                System.out.println("Jumlah pinjaman saat ini: " + currencyFormat.format(pinjamanSaatIni));
            } else {
                System.out.println("Pembayaran melebihi jumlah pinjaman saat ini.");
            }
        } else {
            System.out.println("Jumlah pembayaran tidak valid.");
        }
    }
}
