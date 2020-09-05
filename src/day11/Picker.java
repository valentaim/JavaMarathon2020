package day11;

public class Picker implements Worker {

    private final Warehouse warehouse;
    private int salary;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
        if (warehouse.getCountOrder() % 1500 == 0) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        salary *= 3;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
