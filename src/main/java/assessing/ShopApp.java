package assessing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ShopApp {
    public static double calcTotal(Clothing[]clothing){
        double sum = 0;
        for(int i = 0; i < clothing.length; i++){
            sum = clothing[i].getPrice();
        }
        return sum;
    }
    public static boolean isAFit(Customer customer, Clothing [] clothing){
        boolean fit;
        if(customer.getSize() == clothing.getSize()) {
            fit = true;
        }else{
            fit = false;
        }
        System.out.println(fit + "\n");
        return fit;
    }
    public static void sortAndPrintClothingByPrice(ArrayList<Clothing>clothing){
        Collections.sort(clothing, Comparator.comparingDouble(Clothing::getPrice));
        clothing.forEach(clothes -> System.out.println(clothes));

    }
    public static void printEmployeeName(Employee employee){
        System.out.println(employee.getName());
    }
    public static void printDiscAmtOff(Discountable[] discountables, Clothing clothing){
        for(int i = 0; i < discountables.length; i++){
            System.out.println(discountables[i].calcDiscount(clothing));
        }
    }
}
