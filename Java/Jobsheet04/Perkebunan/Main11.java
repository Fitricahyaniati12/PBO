public class Main11 {
    public static void main(String[] args) {
        
        Kebun11 kebun = new Kebun11("Kebun Sayur", "Bogor");

        Tanaman11 tomat = new Tanaman11("Tomat", "Sayuran");
        Tanaman11 kangkung = new Tanaman11("Kangkung", "Sayurasn");

        // Membuat Pekerja
        Pekerja11 pekerja1 = new Pekerja11("Iqbal", "P001");
        Pekerja11 pekerja2 = new Pekerja11("Nestari", "P002");

        // Menambahkan Tanaman ke Kebun
        kebun.tambahTanaman(tomat);
        kebun.tambahTanaman(kangkung);

        // Menambahkan Pekerja ke Kebun
        kebun.tambahPekerja(pekerja1);
        kebun.tambahPekerja(pekerja2);

        // Menugaskan Pekerja untuk merawat Tanaman
        kebun.tugaskanPekerjaKeTanaman(tomat, pekerja1);
        kebun.tugaskanPekerjaKeTanaman(kangkung, pekerja2);

        // Menampilkan daftar tanaman dan pekerja yang merawatnya
        System.out.println("Daftar tanaman di kebun " + kebun.getNamaKebun() + ":");
        for (Tanaman11 tanaman : kebun.getDaftarTanaman()) {
            System.out.println(tanaman.getNamaTanaman() + " dirawat oleh: " + tanaman.getPekerjaNama());
        }

        // Menampilkan status tanaman
        System.out.println("\nStatus kesehatan Tomat: " + tomat.getStatusKesehatan());

        // Mengubah status kesehatan tanaman
        tomat.updateStatusKesehatan("Butuh Perawatan");
        System.out.println("Status kesehatan Tomat setelah diperbarui: " + tomat.getStatusKesehatan());

        // Menampilkan daftar tanaman yang dirawat oleh pekerja1
        pekerja1.tampilkanDaftarTanaman();
        pekerja2.tampilkanDaftarTanaman();
    }
}
