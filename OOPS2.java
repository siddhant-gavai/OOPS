public class OOPS2 {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.userName = "siddhant";
        // ba.password = "pass123"; // This line would cause a compilation error
        ba.setPassword("pass123"); // change the password using setter method
        System.out.println("Username: " + ba.userName);
        System.out.println("Password is set successfully.");
    }
}

class BankAccount {
    public String userName;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
