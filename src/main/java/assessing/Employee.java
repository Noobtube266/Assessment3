package assessing;

public abstract class Employee extends Customer{

    public Employee(String name, char size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
    }
    private final double discount = 0.10;

    public double getDiscount() {
        return discount;
    }
    public abstract void printEmpPriceAfterDisc(Clothing clothing);
}
