
    import java.time.LocalDate;
    import java.util.ArrayList;

public class Pasien11 {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi11> riwayatKonsultasi;

    public Pasien11(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<>(); 
    }

    // Getter and Setter methods
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

    public ArrayList<Konsultasi11> getRiwayatKonsultasi() {
        return riwayatKonsultasi;
    }

    public void setRiwayatKonsultasi(ArrayList<Konsultasi11> riwayatKonsultasi) {
        this.riwayatKonsultasi = riwayatKonsultasi;
    }

    // Method to add a consultation
    public void tambahKonsultasi(LocalDate tanggal, Pegawai11 dokter, Pegawai11 perawat) {
        Konsultasi11 konsultasi = new Konsultasi11();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("No Rekam Medis : ").append(this.noRekamMedis).append("\n");
        info.append("Nama          : ").append(this.nama).append("\n");

        if (!riwayatKonsultasi.isEmpty()) {
            info.append("Riwayat Konsultasi:\n");
            for (Konsultasi11 konsultasi : riwayatKonsultasi) {
                info.append(konsultasi.getInfo());
            }
        } else {
            info.append("Belum ada riwayat konsultasi\n");
        }

        return info.toString();
    }
}

