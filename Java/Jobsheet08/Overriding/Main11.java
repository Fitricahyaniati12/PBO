package Overriding;

public class Main11 {
    public static void main(String[] args) {
        Manusia11 dosen = new Dosen11();      
        Manusia11 mahasiswa = new Mahasiswa11(); 
    
        dosen.bernafas();  
        dosen.makan();     
    
        mahasiswa.bernafas();  
        mahasiswa.makan();     
    
        if (dosen instanceof Dosen11) {
            ((Dosen11) dosen).lembur(); 
        }
    
        if (mahasiswa instanceof Mahasiswa11) {
            ((Mahasiswa11) mahasiswa).tidur(); 
        }
    }
}
    
