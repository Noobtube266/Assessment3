package assessing;

public class HourlyEmployee extends Employee implements Discountable {
    public HourlyEmployee(String name, char size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
    }


    @Override
    public double calcDiscount(Clothing clothing) {
        return (clothing.getPrice() * getDiscount());
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(clothing.getPrice() - clothing.getPrice() * getDiscount() + "\n");
    }
}
