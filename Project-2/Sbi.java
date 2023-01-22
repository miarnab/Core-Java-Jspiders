import java.util.Scanner;

public class Sbi extends Bank{
    Scanner s = new Scanner(System.in);
    String branchName;
    String ifsc;
    Account a;

    public Sbi(String bankName, String managerName, String branchName, String ifsc) {
        super(bankName, managerName);
        this.branchName = branchName;
        this.ifsc = ifsc;
    }

    public void createAccount(Account a){
        if(this.a==null){
            this.a=a;
            System.out.println("Account created successfully");
        }
        else{
            System.out.println("Account already exists");
        }
    }

    public void checkBalance(){
        if(this.a==null){
            System.out.println("Account does not exist");
        }
        else{
            System.out.println("Enter the password:");
            int password = s.nextInt();
        }
    }

    public void withdraw(){
        if(this.a==null){
            System.out.println("Account does not exist");
        }
        else{
            System.out.println("Enter the password:");
            int password = s.nextInt();
            if(a.verifyPassword(password)){
                System.out.println("Enter the amount to withdraw:");
                double amount = s.nextDouble();
                a.withdraw(amount);
            }
            else{
                System.out.println("Invalid Password");
            }
        }
    }

    public void deposit(){
        if(this.a==null){
            System.out.println("Account does not exist");
        }
        else{
            System.out.println("Enter the password:");
            int password = s.nextInt();
            if(a.verifyPassword(password)){
                System.out.println("Enter the amount to deposit:");
                double amount = s.nextDouble();
                a.deposit(amount);
            }
            else{
                System.out.println("Invalid Password");
            }
        }
    }

    public void changePassword(){
        if(this.a==null){
            System.out.println("Account does not exist");
        }
        else{
            System.out.println("Enter the old password:");
            int oldPassword = s.nextInt();
            a.setPassword(oldPassword);
        }
    }

    public void removeAccount(){
        if(this.a==null){
            System.out.println("Account does not exist");
        }
        else{
            this.a=null;
            System.out.println("Account removed successfully");
        }
    }
}
