public class Subject {
    private String name;
    private int semester;
    private Professor professor;
    private byte year;
    private Program program;

    public Subject(String name, int semester, Professor professor, byte year, Program program) {
        this.name = name;
        this.semester = semester;
        this.professor = professor;
        this.year = year;
        this.program = program;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public Professor getProfessor() {
        return professor;
    }

    public int getYear() {
        return year;
    }

    public Program getProgram() {
        return program;
    }
}
