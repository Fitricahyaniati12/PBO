public class Tanaman11 {
    private String namaTanaman;
    private String jenisTanaman;
    private String statusKesehatan;
    private Pekerja11 pekerja;

    public Tanaman11(String namaTanaman, String jenisTanaman) {
        this.namaTanaman = namaTanaman;
        this.jenisTanaman = jenisTanaman;
        this.statusKesehatan = "Sehat"; // Default status
    }

    public void updateStatusKesehatan(String status) {
        this.statusKesehatan = status;
    }

    public void setPekerja(Pekerja11 pekerja) {
        this.pekerja = pekerja;
    }

    public String getStatusKesehatan() {
        return statusKesehatan;
    }

    public String getNamaTanaman() {
        return namaTanaman;
    }
    public String getPekerjaNama() {
        return pekerja != null ? pekerja.getNamaPekerja() : "Belum ditugaskan";
    }
}
    

