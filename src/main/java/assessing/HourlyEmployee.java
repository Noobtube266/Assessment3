package assessing;

public class HourlyEmployee extends Employee implements Discountable {
    public HourlyEmployee(String name, char size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
    }


    @Override
    public double calcDiscount(Clothing clothing) {
        return 0;
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {

    }
}
