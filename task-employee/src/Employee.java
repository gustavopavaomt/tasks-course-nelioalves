public class Employee {

    private String name;
    private double grosssalary;
    private double tax;

    public double netSalary(){
        return grosssalary - tax;
    }
    public void increasySalary(double percentage){
        this.grosssalary += grosssalary * percentage/100.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrosssalary() {
        return grosssalary;
    }

    public void setGrosssalary(double grosssalary) {
        this.grosssalary = grosssalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Employee{" +
                " name= '" + name + '\'' +
                ", grosssalary= $ " + String.format("%.2f",netSalary()) +
                '}';
    }
}
