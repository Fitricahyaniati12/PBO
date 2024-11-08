public class Admin11 extends UserProfile11 {

    public Admin11(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public void addVehicle(String vehicleId) {
        System.out.println("Kendaraan " + vehicleId + " berhasil ditambahkan.");
    }

    public void updateVehicleDetails(String vehicleId) {
        System.out.println("Detail kendaraan " + vehicleId + " berhasil diperbarui.");
    }

    public void verifyUser(Customer11 customer) {
        if (customer.isVerified()) {
            System.out.println("Pengguna sudah diverifikasi.");
        } else {
            System.out.println("Pengguna belum diverifikasi.");
        }
    }
}
