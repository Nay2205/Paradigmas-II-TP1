import java.util.ArrayList;
import java.util.List;

public class Program {
    private String name;
    private Coordinator coordinator;
    private int duration;
    private double fee;
    private double enrollmentFee;
    private List<Subject> subjects = new ArrayList<>();
    private List<Student> enrolledStudents = new ArrayList<>();

    public Program(String name, Coordinator coordinator, int duration, double fee, double enrollmentFee) {
        this.name = name;
        this.coordinator = coordinator;
        this.duration = duration;
        this.fee = fee;
        this.enrollmentFee = enrollmentFee;
    }

    public String getName() {
        return name;
    }

    public Coordinator getCoordinator() {
        return coordinator;
    }

    public int getDuration() {
        return duration;
    }

    public double getFee() {
        return fee;
    }

    public double getEnrollmentFee() {
        return enrollmentFee;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
