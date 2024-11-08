package Overriding;

public class Mahasiswa11 extends Manusia11 {
    @Override
    void makan() {
        System.out.println("Mahasiswa makan");
    }

    void tidur() {
        System.out.println("Mahasiswa tidur");
    }
}