package Experiment1;

public class Staff11 extends Karyawan11 {
    private int lembur; 
    private double gajiLembur; 

   
    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    
    public int getLembur() {
        return lembur;
    }

    
    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    
    public double getGajiLembur() {
        return gajiLembur;
    }

    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }

    @Override
    public double getGaji() {
        return super.getGaji() + lembur * gajiLembur;
    }

    public void lihatInfo() {
        System.out.println("NIP: " + this.getNip());
        System.out.println("Nama: " + this.getNama());
        System.out.println("Golongan: " + this.getGolongan());
        System.out.println("Jumlah Lembur: " + this.getLembur());
        System.out.printf("Gaji Lembur: %.0f\n", this.getGajiLembur());
        System.out.printf("Total Gaji: %.0f\n", this.getGaji());
    }

}
