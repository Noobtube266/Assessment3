package assessing;

public class Main {
    public static void main(String[] args) {

        Clothing clothing1 = new Clothing("Shirt",20.0,'S');
        Clothing clothing2 = new Clothing("Pants",34.98,'L');
        Clothing clothing3 = new Clothing("Sneaks",199.99,'M');
        Clothing clothing4 = new Clothing("Socks",10,'S');
        Clothing clothing5 = new Clothing("Jacket",59.99,'M');
        Clothing clothing6 = new Clothing("Dress",40.0,'M');
        Clothing clothing7 = new Clothing("Hat",89.99,'W');

        Clothing[]managerCart = {clothing3,clothing2,clothing7};
        Manager manager = new Manager("Jerome",'L', new Clothing[]{clothing3,clothing2,clothing7});

        Clothing[]employeeCart = {clothing5, clothing1, clothing6, clothing4};
        Employee employee = new Employee("Katie", 'S', new Clothing[]{clothing5, clothing1, clothing6, clothing4}) {
            @Override
            public void printEmpPriceAfterDisc(Clothing clothing) {

            }
        };
        System.out.println(manager);
        System.out.println(employee);
    }
}
