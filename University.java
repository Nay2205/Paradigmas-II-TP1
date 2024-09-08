import java.util.ArrayList;
import java.util.List;

public class UniversitySystem {
    private static List<Program> programs = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        initializeSystem();
    }

    private static void initializeSystem() {
        Professor professor1 = new Professor("Javier", "Contreras", "23789965", "javier@gmail.com", "3764345267") {
            @Override
            public int compareTo(Person o) {
                return 0;
            }
        };
        Professor professor2 = new Professor("Florencia", "Krammer", "37890123", "flor@gmail.com", "3764091247") {
            @Override
            public int compareTo(Person o) {
                return 0;
            }
        };
        Professor professor3 = new Professor("Juan Pablo", "Gonzalez", "41328330", "jp@gmail.com", "3764905033") {
            @Override
            public int compareTo(Person o) {
                return 0;
            }
        };

        Coordinator coordinator1 = new Coordinator("Jose Luis", "Medina", "22903287", "coord1@gmail.com", "3764236794") {
            @Override
            public int compareTo(Person o) {
                return 0;
            }
        };
        Coordinator coordinator2 = new Coordinator("Maria", "Lopez", "36542893", "coord2@gmail.com", "3755321238") {
            @Override
            public int compareTo(Person o) {
                return 0;
            }
        };

        Program program1 = new Program("Systems Engineering", coordinator1, 5, 190000, 200000);
        Subject subject1 = new Subject("Mathematical Analysis II", 1, professor2, (byte) 2, program1);
        Subject subject2 = new Subject("Physics I", 1, professor1, (byte) 2, program1);
        program1.addSubject(subject1);
        program1.addSubject(subject2);

        Program program2 = new Program("Nutrition", coordinator2, 4, 1200.0, 4000.0);
        Subject subject3 = new Subject("Algebra", 1, professor2, (byte) 1, program2);
        Subject subject4 = new Subject("Organic Chemistry", 2, professor3, (byte) 1, program2);
        program2.addSubject(subject3);
        program2.addSubject(subject4);

        programs.add(program1);
        programs.add(program2);
    }
}
