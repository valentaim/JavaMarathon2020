package day15;

public class Shoes {

    private String name;
    private int size;
    private int quantity;

    public Shoes(String name, int size, int quantity) {
        this.name = name;
        this.size = size;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return name + ", " + size + ", " + quantity;
    }
}
