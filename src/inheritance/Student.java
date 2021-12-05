package inheritance;

public class Student extends Person {

    private String studentId;

    public Student(String firsName, String lastName, String studentId) {
        super(firsName, lastName);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() + " studentId = " + studentId + ", ";
    }
}
