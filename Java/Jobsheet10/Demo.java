import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Dosen11 dosen1 = new Dosen11("19940201", "Widia, S.Kom. M.Kcm", "199402");
        Dosen11 dosen2 = new Dosen11("19780185", "Muhammad, S.T, M.T", "197001");
        TenagaKependidikan11 tendik1 = new TenagaKependidikan11("19750381", "Aida, A.Md.", "Tenaga Administrasi");
        TenagaKependidikan11 tendik2 = new TenagaKependidikan11("19650304", "Rika, S.T.", "Tenaga Laboratorium");

        ArrayList<Pegawai11> daftarPegawai = new ArrayList<>();
        daftarPegawai.add(dosen1);
        daftarPegawai.add(dosen2);
        daftarPegawai.add(tendik1);
        daftarPegawai.add(tendik2);

        System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
        for (Pegawai11 pegawai : daftarPegawai) {
            pegawai.displayInfo();
            System.out.println(); 
        }
    }
}
