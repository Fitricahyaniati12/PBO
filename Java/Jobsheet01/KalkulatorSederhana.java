import java.util.Scanner;

public class KalkulatorSederhana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /) : ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua : ");
        double angka2 = scanner.nextDouble();

        // untuk menyimpan hasil
        double hasil = 0;

        // Melakukan operasi aritmatika 
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error : tidak boleh pembagian nol.");
                    return; 
                }
                break;
            default:
                System.out.println("Error : Operator tidak valid.");
                return; 
        }

        System.out.println("Hasil: " + hasil);
    }
}
