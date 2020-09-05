package day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Anvar", "Java Марафон (группа 1)");
        Teacher teacher = new Teacher("burlakovserge", "JavaMarathon2020");

        System.out.println(student.getStudyGroup());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
