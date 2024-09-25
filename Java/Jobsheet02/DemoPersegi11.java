/**
 * DemoPersegi11
 */
public class DemoPersegi11 {
    public static void main(String[] args) {
    PersegiPanjang11 persegi = new PersegiPanjang11(15, 15);
        
        persegi.displayInfo();
        
        // Menghitung luas dan keliling
        int luas = persegi.getLuas();
        System.out.println("Luas: " + luas);
    
        int keliling = persegi.getKeliling();
        System.out.println("Keliling: " + keliling);
    }
}