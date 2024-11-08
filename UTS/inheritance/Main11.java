public class Main11 {
    public static void main(String[] args) {
      
        User11 user = new User11(1, "password123", "Ratu", 25, "Ratusejarah234@gmail.com");
        System.out.println(user.getUserId());
        System.out.println(user.logIn(1, "password123"));  
        System.out.println(user.logOut());  

        System.out.println();

        Customer11 customer = new Customer11(2, "customerpass", "Raja", 30, "Rajadunia287@gmail.com");
        customer.applyVerification("jpg"); 
        System.out.println("Status Verifikasi: " + customer.isVerified());  

        Admin11 admin = new Admin11(3, "adminpass", "Charlie", 20, "charlieunik879@gmail.com");
        admin.addVehicle("Mobil Sport");  
        admin.verifyUser(customer);  
    }
}