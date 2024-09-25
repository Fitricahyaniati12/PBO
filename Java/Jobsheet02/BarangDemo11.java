/**
 * BarangDemo11
 */
public class BarangDemo11 {
    public static void main(String[] args) {

    Barang11 barang1 = new Barang11();
    Barang11 barang2 = new Barang11();

    barang1.kode = "ATKO1";
    barang1.nama = "Bolpoin Pilot Hitam";
    barang1.hargakotor = 3500;
    barang1.diskon = 0.1;

    barang2.kode = "ATKO2";
    barang2.nama = "Buku Binder A5";
    barang2.hargakotor = 8000;
    barang2.diskon = 0.05;

    System.out.println("\nInformasi Barang 1:");
    barang1.displayInfo();

    System.out.println("\nInformasi Barang 2:");
    barang2.displayInfo();

    // Memperbarui nilai atribut //
    barang1.hargakotor = 4000;
    barang1.diskon = 0.2;

    barang2.hargakotor = 1600;
    barang2.diskon = 0.1;

    System.out.println("\nInformasi Barang 1 setelah update:");
    barang1.displayInfo();

    System.out.println("\nInformasi Barang 2 setelah update:");
    barang1.displayInfo();
   }
}