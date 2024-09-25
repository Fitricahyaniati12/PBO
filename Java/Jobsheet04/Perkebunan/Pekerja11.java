import java.util.ArrayList;
    
public class Pekerja11 {
    private String namaPekerja;
    private String idPekerja;
    private ArrayList<Tanaman11> daftarTanaman;

    public Pekerja11(String namaPekerja, String idPekerja) {
        this.namaPekerja = namaPekerja;
        this.idPekerja = idPekerja;
        this.daftarTanaman = new ArrayList<>();
    }

    public void tambahTanaman(Tanaman11 tanaman) {
        daftarTanaman.add(tanaman);
    }

    public void hapusTanaman(Tanaman11 tanaman) {
        daftarTanaman.remove(tanaman);
    }

    public String getNamaPekerja() {
        return namaPekerja;
    }
    public void tampilkanDaftarTanaman() {
        if (daftarTanaman.isEmpty()) {
            System.out.println(namaPekerja + " belum merawat tanaman.");
        } else {
            System.out.println(namaPekerja + " merawat tanaman berikut:");
            for (Tanaman11 tanaman : daftarTanaman) {
                System.out.println("- " + tanaman.getNamaTanaman());
            }
        }
    }
}

