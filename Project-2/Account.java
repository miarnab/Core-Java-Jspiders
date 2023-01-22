public class Account {
    long accountNumber;
    double balance;
    int password;
    User u;

    public Account(long accountNumber, int password, double balance, User u) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.password = password;
        this.u = u;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    public void withdraw(double amount){
        if(this.balance<amount){
            System.out.println("Insufficient Fund");
        }
        else{
            this.balance-=amount;
            System.out.println("Withdraw Successful");
        }
    }

    public void deposit(double amount){
        this.balance+=amount;
        System.out.println("Amount Deposited");
    }

    public void setPassword(int oldPassword, int newPassword){
        if(this.password==oldPassword){
            System.out.println("Password is changed");
        }
        else {
            System.out.println("Password Mismatch");
        }
    }

    public boolean verifyPassword(int password){
        if(this.password==password){
            return true;
        }
        else{
            return false;
        }
    }

}
