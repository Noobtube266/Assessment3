package assessing;

public class Manager extends Employee implements Discountable{

    public Manager(String name, char size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
    }
    private final double discount = 0.25;

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(clothing.getPrice() - clothing.getPrice() * getDiscount());
    }

    @Override
    public String toString() {
        return "Manager{}";
    }

    @Override
    public double calcDiscount(Clothing clothing) {
        return (clothing.getPrice() * getDiscount());
    }
}
