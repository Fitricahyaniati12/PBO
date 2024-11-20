public class TenagaKependidikan11 extends Pegawai11 {
    public String kategori;

    public TenagaKependidikan11() {}

    public TenagaKependidikan11(String nip, String nama, String kategori) {
        super(nip, nama);
        this.kategori = kategori;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori: " + kategori);
    }
}
