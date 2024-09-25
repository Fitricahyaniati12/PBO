import java.util.ArrayList;

public class Kebun11 {
    private String namaKebun;
    private String lokasi;
    private ArrayList<Tanaman11> daftarTanaman;
    private ArrayList<Pekerja11> daftarPekerja;

    public Kebun11(String namaKebun, String lokasi) {
        this.namaKebun = namaKebun;
        this.lokasi = lokasi;
        this.daftarTanaman = new ArrayList<>();
        this.daftarPekerja = new ArrayList<>();
    }

    public void tambahTanaman(Tanaman11 tanaman) {
        daftarTanaman.add(tanaman);
    }

    public void tambahPekerja(Pekerja11 pekerja) {
        daftarPekerja.add(pekerja);
    }

    public void tugaskanPekerjaKeTanaman(Tanaman11 tanaman, Pekerja11 pekerja) {
        tanaman.setPekerja(pekerja);
        pekerja.tambahTanaman(tanaman);
    }

    // Getter untuk namaKebun
    public String getNamaKebun() {
        return namaKebun;
    }

    // Getter untuk daftarTanaman
    public ArrayList<Tanaman11> getDaftarTanaman() {
        return daftarTanaman;
    }
}
