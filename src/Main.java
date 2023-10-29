import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        College college = new College("HAYAT");
        Scanner sc = new Scanner(System.in);
        //create  students through contructor
        Student s1 = new Student("Saron", "Abate", "100", new int[]{95,89,85});
        Student s2 = new Student("Seble", "Khan", "200", new int[]{75,80,85});
        Student s3 = new Student("John", "Getu", "300", new int[]{85,90,95});
        //create  teachers through constructor
        Teacher t1 = new Teacher("Tesfaye ", "Mulatu", "  phsiology");
        Teacher t2 = new Teacher("Samriya ", "Smith", " pharmachology");
        Teacher t3 = new Teacher("Lelisa ", "Abiyu", " anatomy");
        College c1=new College("HAYAT MEDICAL COLLEGE");
        college.cName(c1);
        //adding students to the college
        college.addStudent(s1);
        college.addStudent(s2);
        college.addStudent(s3);
        college.addTeacher(t1);
        college.addTeacher(t2);
        college.addTeacher(t3);
        college.printDetail();

    }

}