
import java.time.LocalDate;

public class Konsultasi11 {
    private LocalDate tanggal;
    private Pegawai11 dokter;
    private Pegawai11 perawat;

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pegawai11 getDokter() {
        return dokter;
    }

    public void setDokter(Pegawai11 dokter) {
        this.dokter = dokter;
    }

    public Pegawai11 getPerawat() {
        return perawat;
    }

    public void setPerawat(Pegawai11 perawat) {
        this.perawat = perawat;
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("\tTanggal : ").append(tanggal);
        info.append(", Dokter : ").append(dokter.getInfo());
        info.append(", Perawat : ").append(perawat.getInfo());
        info.append("\n");

        return info.toString();
    }
}


