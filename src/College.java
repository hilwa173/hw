//import arraylist package to access arraylist
import java.util.ArrayList;
import java.util.Arrays;

class College {
    private String collegeName;

    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<College> colleges = new ArrayList<>();

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void cName(College college) {
        colleges.add(college);

    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void printDetail() {
        for (College c : colleges) {
            System.out.println("*********************" + c.getCollegeName()+ "*******************");
            System.out.println("STUDENTS INFORMATION");
            System.out.printf("%5s%15s%15s%15s%n", "FIRST_NAME", "LAST_NAME", "ID" ,"GRADE");
            System.out.println("..................................................");
            for (Student s : students) {
                System.out.printf("%5s%15s%20s%20s%n", s.getFirstName(), s.getLastName(), s.getStudentId(),Arrays.toString(s.getGrade()));
            }
            System.out.println();
            System.out.println("TEACHERS INFORMATION");
            System.out.printf("%5s%15s%16s%n","FIRST_NAME","LAST_NAME","SUBJECT");
            System.out.println("....................................................");

            for (Teacher t : teachers) {
                System.out.printf("%5s%15s%16s%n", t.getFirstName(), t.getLastName(), t.getSubjectTaught());
            }
        }
    }
}


