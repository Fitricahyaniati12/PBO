public class Customer11 extends UserProfile11 {
    private boolean verificationStatus;

    public Customer11(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
        this.verificationStatus = false;
    }

    public void applyVerification(String docType) {
        if (docType.equals("jpg") || docType.equals("png") || docType.equals("pdf")) {
            verificationStatus = true;
            System.out.println("Verifikasi berhasil diterapkan.");
        } else {
            System.out.println("Format dokumen tidak valid.");
        }
    }

    public boolean isVerified() {
        return verificationStatus;
    }
}
