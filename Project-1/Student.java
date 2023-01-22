public class Student {
    String studentName;
    int studentId;
    long contactNumber;

    public Student(String studentName, int studentId, long contactNumber) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.contactNumber = contactNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
}
