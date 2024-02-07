import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc.close();

        ArrayList<Subject> subjects = new ArrayList<>();
        sc = new Scanner(new File("DETAI.in"));
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            subjects.add(new Subject(sc.nextLine(), sc.nextLine()));
        }
        sc.close();

        ArrayList<Assignment> assignments = new ArrayList<>();
        sc = new Scanner(new File("NHIEMVU.in"));
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String msv = sc.next();
            String subjectID = sc.next();
            Assignment assignment = new Assignment(msv, subjectID);

            for (Student student : students) {
                if (student.ID.equals(msv)) {
                    assignment.student = student;
                }
            }
            for (Subject subject : subjects) {
                if (subject.ID.equals(subjectID)) {
                    assignment.subject = subject;
                }
            }

            assignments.add(assignment);
        }
        sc.close();

        Collections.sort(assignments);
        for (Assignment assignment : assignments) {
            System.out.println(assignment);
        }
    }
}
