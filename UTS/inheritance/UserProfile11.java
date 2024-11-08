public class UserProfile11 {
    protected int userId; 
    protected String password;
    protected String name;
    protected int age;
    protected String emailId;

    public UserProfile11(int userId, String password, String name, int age, String emailId) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }

    public String getUserId() {
        return "ID Pengguna: " + this.userId;
    }

    public void editProfile(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }
}
