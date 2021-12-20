package lambdasAndStreams.ZZZ_e_capturingVariables;

import java.time.Year;

public class Student {

    Integer studentID;
    String name;
    Year graduationYear;

    public Student(Integer studentID, String name, Year graduationYear) {
        this.studentID = studentID;
        this.name = name;
        this.graduationYear = graduationYear;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Year getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Year graduationYear) {
        this.graduationYear = graduationYear;
    }
}
