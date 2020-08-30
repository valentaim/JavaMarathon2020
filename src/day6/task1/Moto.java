package day6.task1;

public class Moto {

    private int year;
    private String color;
    private String model;

    public Moto(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public void printType() {
        System.out.println("Это мотоцикл");
    }

    public int getYearDiff(int year) {
        return year - this.year;
    }

}
