/**
 * Barang11
 */
public class Barang11 {

    public String kode;
    public String nama;
    public double hargakotor;
    public double diskon;

    public double getHargaBersih(){
        return hargakotor - diskon * hargakotor;
    }

    public void displayInfo(){
        System.out.println("Kode  : " + kode);
        System.out.println("Nama  : " + nama);
        System.out.println("Harga kotor  : " + hargakotor);
        System.out.println("Diskon  : " + diskon);
        System.out.println("Harga Bersih  : " + getHargaBersih());
    }
}