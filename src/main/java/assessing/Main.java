package assessing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Clothing clothing1 = new Clothing("Shirt",20.0,'S');
        Clothing clothing2 = new Clothing("Pants",34.98,'L');
        Clothing clothing3 = new Clothing("Sneaks",199.99,'M');
        Clothing clothing4 = new Clothing("Socks",10,'S');
        Clothing clothing5 = new Clothing("Jacket",59.99,'M');
        Clothing clothing6 = new Clothing("Dress",40.0,'M');
        Clothing clothing7 = new Clothing("Hat",89.99,'W');

        ArrayList<Clothing> Clothes = new ArrayList<>();
        Clothes.add(clothing1);
        Clothes.add(clothing2);
        Clothes.add(clothing3);
        Clothes.add(clothing4);
        Clothes.add(clothing5);
        Clothes.add(clothing6);
        Clothes.add(clothing7);

        Clothing[]managerCart = {clothing3,clothing2,clothing7};
        Manager manager = new Manager("Jerome",'L', new Clothing[]{clothing3,clothing2,clothing7});
        System.out.println("Manager total \n");
        ShopApp.calcTotal(managerCart);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Danny", 'M', new Clothing[]{clothing6, clothing3, clothing7});

        Clothing[]employeeCart = {clothing5, clothing1, clothing6};
        Employee employee = new Employee("Katie", 'S', new Clothing[]{clothing5, clothing1, clothing6}) {
            @Override
            public void printEmpPriceAfterDisc(Clothing clothing) {

            }
        };

        Discountable[] discountables = {hourlyEmployee, manager};

        for (Clothing item: Clothes) {
            System.out.println(item);
        }
        System.out.println("Total price of manager's cart");
        System.out.println(ShopApp.calcTotal(managerCart));
        System.out.println("can the manager fit this?");
        System.out.println(ShopApp.isAFit(manager, managerCart));
        System.out.println("can the employee fit this?");
        System.out.println(ShopApp.isAFit(employee, employeeCart));
        ShopApp.sortAndPrintClothingByPrice(Clothes);
        ShopApp.printDiscAmtOff(discountables, clothing);
    }
}
