package Tugas;

public class Segitiga11 {
        private int sudut;

        public int totalSudut(int sudutA, int sudutB) {
            sudut = 180 - (sudutA + sudutB);
            return sudut;
        }
    
        // Method overload menghitung total sudut segitiga dengan tiga parameter
        public int totalSudut(int sudutA, int sudutB, int sudutC) {
            // Menghitung total sudut dengan 3 sudut
            return sudutA + sudutB + sudutC;
        }
    
        public int keliling(int sisiA, int sisiB, int sisiC) {
            return sisiA + sisiB + sisiC;
        }
    
        // Method overload menghitung keliling segitiga dengan sisi double
        public double keliling(double sisiA, double sisiB, double sisiC) {
            return sisiA + sisiB + sisiC;
        }
        
    }
    
    

