import java.util.List;
import java.util.ArrayList;

public abstract class Student extends Person {
    private List<Subject> enrolledSubjects = new ArrayList<>();
    private int registrationNumber;

    public Student(String firstName, String lastName, String idNumber, String email, String phoneNumber, int registrationNumber) {
        super(firstName, lastName, idNumber, email, phoneNumber);
        this.registrationNumber = registrationNumber;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void enrollSubject(Subject subject) {
        enrolledSubjects.add(subject);
    }

    public List<Subject> getEnrolledSubjects() {
        return enrolledSubjects;
    }
}
