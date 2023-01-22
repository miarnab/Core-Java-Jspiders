import java.util.Objects;

public class Student {
    String studentName;
    int studentId;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    @Override
    public String toString(){
        return "Student Name: "+studentName+"\nStudent ID: "+studentId;
    }

    @Override
    public boolean equals(Object object){
        Student student = (Student) object;
        return this.studentName.equals(student.studentName) && this.studentId == student.studentId;
    }

    @Override
    public int hashCode(){
        return Objects.hash(studentName,studentId);
    }

    public static void main(String args[]){
        Student student = new Student("Arnab",123);
        System.out.println(student);
    }
}
