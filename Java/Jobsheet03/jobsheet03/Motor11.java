package jobsheet03;

public class Motor11 {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean isMesinOn() {
        return isMesinOn;
    }

    public void setMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatanBaru) {
        if (kecepatanBaru < 0) {
            System.out.println("Kecepatan tidak boleh bernilai negatif.");
            this.kecepatan = 0;
        } else if (isMesinOn) {
            if (kecepatanBaru > 100) {
                System.out.println("Kecepatan tidak boleh lebih dari 100.");
                this.kecepatan = 100;
            } else {
                this.kecepatan = kecepatanBaru;
            }
        } else {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off.");
            this.kecepatan = 0;
        }
    }

    public void displaystatus() {
        System.out.println("Plat Nomor : " + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin off");
        }

        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("========================");
    }
}
