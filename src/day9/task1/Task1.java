package day9.task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Анатолий", "M-52");
        Teacher teacher = new Teacher("Александр Иванович", "Математический анализ");

        System.out.println("Групп " + student.getGroup());
        System.out.println("Предмет " + teacher.getSubject());

        student.printInfo();
        teacher.printInfo();

    }
}
