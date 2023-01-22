import java.util.*;
public class SchoolDriver {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the School Name: ");
        String schoolName = scanner.next();
        System.out.println("Enter the Principal Name: ");
        String principalName = scanner.next();
        School school = new School(schoolName,principalName);
        boolean exit = true;
        while(exit){
            System.out.println("Enter the user's choice\n1. Admit Student\n2. Cancel Admission\n3. Display Student Details\n4. Exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:System.out.println("Enter the Student Name:");
                        String studentName = scanner.next();
                        System.out.println("Enter the Student ID:");
                        int studentId = scanner.nextInt();
                        System.out.println("Enter the Student's Contact Number:");
                        long contactNumber = scanner.nextLong();
                        school.admitStudent(new Student(studentName,studentId,contactNumber));
                        break;
                case 2:school.cancelAdmission();
                        break;
                case 3:school.studentDetails();
                        break;
                case 4:exit=false;
                        break;
                default:System.out.println("Invalid Choice");
            }
        }
    }
}
