import java.util.Scanner;

public class SbiDriver {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Bank name:");
        String bankName = s.next();
        System.out.println("Enter the Manager name:");
        String managerName = s.next();
        System.out.println("Enter the Branch name:");
        String branchName = s.next();
        System.out.println("Enter the IFSC code:");
        String ifscCode = s.next();
        Sbi object = new Sbi(bankName,managerName,branchName,ifscCode);
        boolean exit = true;
        while(exit){
            System.out.println("Enter your choice:\n1. Create Account\n2. Check Balance\n3. Withdraw Amount\n4. Deposit Amount\n5. Change Password\n6. Remove Account\n7. Exit");
            int choice = s.nextInt();
            switch(choice){
                case 1:System.out.println("Enter the username");
                        String userName = s.next();
                        System.out.println("Enter the contact number");
                        long contactNumber = s.nextLong();
                        System.out.println("Enter the account number");
                        long accountNumber = s.nextLong();
                        System.out.println("Enter the password");
                        int password = s.nextInt();
                        System.out.println("Enter the balance");
                        double balance = s.nextDouble();
                        object.createAccount(new Account(accountNumber,password,balance,new User(userName, contactNumber)));
                        break;
                case 2:object.checkBalance();
                        break;
                case 3:object.withdraw();
                        break;
                case 4:object.deposit();
                        break;
                case 5:object.changePassword();
                        break;
                case 6:object.removeAccount();
                        break;
                case 7:exit = false;
                        break;
                default:System.out.println("Invalid Choice");
            }
        }
    }
}
