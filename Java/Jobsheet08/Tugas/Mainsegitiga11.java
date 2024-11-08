package Tugas;

public class Mainsegitiga11 {
    public static void main(String[] args) {
        Segitiga11 segitiga = new Segitiga11();

        // Menghitung total sudut
        int totalSudut1 = segitiga.totalSudut(60, 30);
        System.out.println("Total Sudut 1: " + totalSudut1);

        int totalSudut2 = segitiga.totalSudut(50, 60, 70);
        System.out.println("Total Sudut 2: " + totalSudut2);

        // Menghitung keliling
        int keliling1 = segitiga.keliling(3, 4, 5);
        System.out.println("Keliling 1: " + keliling1);

        double keliling2 = segitiga.keliling(3.5, 4.5, 5.5);
        System.out.println("Keliling 2: " + keliling2);
    }

    
}
