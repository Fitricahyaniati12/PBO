import java.time.LocalDate;

public class Konsultasi01 {
    private LocalDate tanggal;
    private Pegawai01 dokter;
    private Pegawai01 perawat;

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pegawai01 getDokter() {
        return dokter;
    }

    public void setDokter(Pegawai01 dokter) {
        this.dokter = dokter;
    }

    public Pegawai01 getPerawat() {
        return perawat;
    }

    public void setPerawat(Pegawai01 perawat) {
        this.perawat = perawat;
    }

    public String getInfo() {
        return String.format("\tTanggal: %s, Dokter: %s, Perawat: %s%n",
                             tanggal,
                             dokter.getInfo(),
                             perawat.getInfo());
    }
}
