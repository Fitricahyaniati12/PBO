package jobsheet03;

public class MotorDemo11 {
    public static void main(String[] args) {
        Motor11 motor1 = new Motor11();
        motor1.displaystatus();

        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(-10);  
        motor1.displaystatus();

        Motor11 motor2 = new Motor11();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setMesinOn(true);
        motor2.setKecepatan(40);  
        motor2.displaystatus();

        Motor11 motor3 = new Motor11();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setMesinOn(true);
        motor3.setKecepatan(60);  
        motor3.displaystatus();
    }
}
