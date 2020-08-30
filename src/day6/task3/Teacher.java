package day6.task3;

public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void rateStudent(Student student) {
        int rating = (int) (Math.random() * 4 ) + 2;
        String ratingString = "";
        switch (rating) {
            case 2:
                ratingString = "неудовлетворительно";
                break;
            case 3:
                ratingString = "удовлетворительно";
                break;
            case 4:
                ratingString = "хорошо";
                break;
            case 5:
                ratingString = "отлично";
        }
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s\n",
                name, student.getName(), subject, ratingString);
    }

}
