import java.time.LocalDate;
import java.util.ArrayList;

public class Pasien01 {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi01> riwayatKonsultasi;

    public Pasien01(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<>(); // Inisialisasi daftar riwayat konsultasi
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Konsultasi01> getRiwayatKonsultasi() {
        return riwayatKonsultasi;
    }

    public void setRiwayatKonsultasi(ArrayList<Konsultasi01> riwayatKonsultasi) {
        this.riwayatKonsultasi = riwayatKonsultasi;
    }

    // Menambahkan konsultasi baru ke daftar riwayat
    public void tambahKonsultasi(LocalDate tanggal, Pegawai01 dokter, Pegawai01 perawat) {
        Konsultasi01 konsultasi = new Konsultasi01();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }

     // Mendapatkan informasi lengkap tentang pasien dan riwayat konsultasi
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("No Rekam Medis: ").append(this.noRekamMedis).append("\n");
        info.append("Nama: ").append(this.nama).append("\n");

        if (!riwayatKonsultasi.isEmpty()) {
            info.append("Riwayat Konsultasi:\n");
            for (Konsultasi01 konsultasi : riwayatKonsultasi) {
                info.append(konsultasi.getInfo());
            }
        } else {
            info.append("Belum ada riwayat konsultasi\n");
        }

        return info.toString();
    }
}
