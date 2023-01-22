public class School {
    String schoolName;
    String principal;
    Student student;

    public School(String schoolName, String principal) {
        this.schoolName = schoolName;
        this.principal = principal;
    }

    public void admitStudent(Student student) {
        if (this.student == null) {
            this.student = student;
            System.out.println("Student admitted successfully");
        } else {
            System.out.println("Student already exists");
        }
    }

    public void cancelAdmission(){
        if(this.student == null){
            System.out.println("Student does not exist");
        }
        else {
            this.student = null;
            System.out.println("Admission cancelled successfully");
        }
    }

    public void studentDetails(){
        if(this.student==null){
            System.out.println("Student does not exist");
        }
        else {
            System.out.println("School Name: "+schoolName);
            System.out.println("Student Name: "+student.studentName);
            System.out.println("Student ID: "+student.studentId);
            System.out.println("Student Contact Number: "+student.contactNumber);
        }
    }

}
