public class User11 extends UserProfile11 {

    public User11(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public String logIn(int userId, String password) {
        if (this.userId == userId && this.password.equals(password)) {
            return "Login berhasil!";
        }
        return "Login gagal!";
    }

    public String logOut() {
        return "Logout berhasil.";
    }
}
