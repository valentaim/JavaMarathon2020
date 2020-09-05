package day11;

public class Task1 {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Worker picker = new Picker(warehouse);
        Worker courier = new Courier(warehouse);

        for (int i = 0; i < 1600; i++) {
            picker.doWork();
            courier.doWork();
        }

        System.out.println(warehouse);
        System.out.println("Зарплата сборщика: " + picker.getSalary());
        System.out.println("Зарплата курьера: " + courier.getSalary());
    }
}
