package Overriding;

public class Dosen11 extends Manusia11 {
    @Override
    void makan() {
        System.out.println("Dosen makan");
    }

    void lembur() {
        System.out.println("Dosen lembur");
    }
}
