import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Name: ");
        emp.setName(sc.nextLine());
        System.out.println("Salary: ");
        emp.setGrosssalary(sc.nextDouble());
        System.out.println("Tax Rate: ");
        emp.setTax(sc.nextDouble());
        System.out.println(emp);
        System.out.println("Which percentage to increase salary? ");
        double value = sc.nextDouble();
        emp.increasySalary(value);
        System.out.println("Updated salary: " + emp);

        sc.close();
    }
}