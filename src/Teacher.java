
public class Teacher {
    private String firstName;
    private String lastName;

    private String subjectTaught;

    public Teacher(String fname, String lname, String subject) {
        firstName = fname;
        lastName = lname;
        subjectTaught = subject;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubjectTaught(String subject) {
        subjectTaught = subject;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubjectTaught() {
        return subjectTaught;
    }


}
