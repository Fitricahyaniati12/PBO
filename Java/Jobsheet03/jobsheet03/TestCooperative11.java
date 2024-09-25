package jobsheet03;

public class TestCooperative11 {
    public static void main(String[] args) {
        Member11 member1 = new Member11("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + member1.getNama());
        System.out.println("Limit Pinjaman: " + member1.getLimitPinjaman());

        System.out.println("\nMeminjam uang 4.000.000...");
        member1.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + member1.getPinjamanSaatIni());

        System.out.println("\nMembayar angsuran 200.000 (kurang dari 10%)");
        member1.angsur(200000); // Angsuran kurang dari 10% akan ditolak

        System.out.println("\nMembayar angsuran 400.000 (minimal 10%)");
        member1.angsur(400000); // Angsuran 10% diterima

        System.out.println("\nMembayar angsuran 500.000");
        member1.angsur(500000); // Angsuran diterima

        System.out.println("\nMembayar angsuran 3.000.000");
        member1.angsur(3000000); // Membayar sisa pinjaman
    }
}
