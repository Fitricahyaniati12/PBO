public class Motor11 {
    // Deklarasi variabel instance
    String warna;
    int kecepatan;
    String bahanBakar;
    String model;

    // Metode untuk menambah kecepatan
    public void menambahKecepatan(int increment) {
        kecepatan += increment;
        System.out.println("Kecepatan motor bertambah menjadi: " + kecepatan + " km/jam");
    }

    // Metode untuk mengurangi kecepatan
    public void mengurangiKecepatan(int decrement) {
        kecepatan -= decrement;
        if (kecepatan < 0) kecepatan = 0;  // Pastikan kecepatan tidak negatif
        System.out.println("Kecepatan motor berkurang menjadi: " + kecepatan + " km/jam");
    }

    // Metode untuk menampilkan informasi motor
    public void tampilkanInfoMotor() {
        System.out.println("Warna Motor: " + warna);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Bahan Bakar: " + bahanBakar);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        // Deklarasi dan inisialisasi 10 objek motor
        Motor11 motor1 = new Motor11();
        motor1.warna = "Merah";
        motor1.kecepatan = 60;
        motor1.bahanBakar = "Bensin";
        motor1.model = "Matik";

        Motor11 motor2 = new Motor11();
        motor2.warna = "Hitam";
        motor2.kecepatan = 50;
        motor2.bahanBakar = "Listrik";
        motor2.model = "Bebek";

        Motor11 motor3 = new Motor11();
        motor3.warna = "Pink";
        motor3.kecepatan = 57;
        motor3.bahanBakar = "Bensin";
        motor3.model = "Sport";

        Motor11 motor4 = new Motor11();
        motor4.warna = "Coklat";
        motor4.kecepatan = 54;
        motor4.bahanBakar = "Bensin";
        motor4.model = "Matik";

        Motor11 motor5 = new Motor11();
        motor5.warna = "Hijau";
        motor5.kecepatan = 80;
        motor5.bahanBakar = "Listrik";
        motor5.model = "Yamaha";

        Motor11 motor6 = new Motor11();
        motor6.warna = "Biru";
        motor6.kecepatan = 76;
        motor6.bahanBakar = "Listrik";
        motor6.model = "Filanio";

        Motor11 motor7 = new Motor11();
        motor7.warna = "Kuning";
        motor7.kecepatan = 50;
        motor7.bahanBakar = "Bensin";
        motor7.model = "Bebek";

        Motor11 motor8 = new Motor11();
        motor8.warna = "Dongker";
        motor8.kecepatan = 87;
        motor8.bahanBakar = "Bensin";
        motor8.model = "Matik";

        Motor11 motor9 = new Motor11();
        motor9.warna = "Ungu";
        motor9.kecepatan = 78;
        motor9.bahanBakar = "Bensin";
        motor9.model = "Cross";

        Motor11 motor10 = new Motor11();
        motor10.warna = "Kuning";
        motor10.kecepatan = 50;
        motor10.bahanBakar = "Bensin";
        motor10.model = "Bebek";

        // Contoh pemanggilan method
        motor1.tampilkanInfoMotor();
        motor1.menambahKecepatan(20);
        motor1.mengurangiKecepatan(10);

        motor2.tampilkanInfoMotor();
        motor2.menambahKecepatan(30);
        motor2.mengurangiKecepatan(15);

        motor3.tampilkanInfoMotor();
        motor3.menambahKecepatan(25);
        motor3.mengurangiKecepatan(10);

        motor4.tampilkanInfoMotor();
        motor4.menambahKecepatan(35);
        motor4.mengurangiKecepatan(10);

        motor5.tampilkanInfoMotor();
        motor5.menambahKecepatan(29);
        motor5.mengurangiKecepatan(15);

        motor6.tampilkanInfoMotor();
        motor6.menambahKecepatan(30);
        motor6.mengurangiKecepatan(10);

        motor7.tampilkanInfoMotor();
        motor7.menambahKecepatan(40);
        motor7.mengurangiKecepatan(10);

        motor8.tampilkanInfoMotor();
        motor8.menambahKecepatan(50);
        motor8.mengurangiKecepatan(25);

        motor9.tampilkanInfoMotor();
        motor9.menambahKecepatan(20);
        motor9.mengurangiKecepatan(10);

        motor10.tampilkanInfoMotor();
        motor10.menambahKecepatan(45);
        motor10.mengurangiKecepatan(30);
    }
}
