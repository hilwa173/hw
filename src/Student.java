
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    private int [] grade;

    public Student(String fname, String lname, String id, int [] grade) {
        firstName = fname;
        lastName = lname;
        studentId = id;
        this.grade = grade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        studentId = id;
    }

    public void setGrade(int [] grade) {
        this.grade = grade;
        Arrays.toString(grade);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public int[] getGrade() {
        return grade;
    }
}

