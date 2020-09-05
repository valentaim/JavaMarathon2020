package day11;

public class Courier implements Worker {

    private final Warehouse warehouse;
    private int salary;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
        if (warehouse.getBalance() % 1000000 == 0) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        salary *= 2;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
