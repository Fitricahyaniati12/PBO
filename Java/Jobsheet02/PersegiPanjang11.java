/**
 * PersegiPanjang11
 */
public class PersegiPanjang11 {

    public int panjang;
    public int lebar;

    public PersegiPanjang11(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

     public void displayInfo() {
            System.out.println("Panjang: " + panjang);
            System.out.println("Lebar: " + lebar);
        }

        public int getLuas() {
            return panjang * lebar;
        }

        public int getKeliling() {
            return 2 * (panjang + lebar);
        }
    }

