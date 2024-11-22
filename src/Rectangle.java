public class Rectangle {

    private double a;
    private double b;


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    public double perimeter() {
        return 2 * (a + b);
    }

    public double diagonal() {
        return Math.sqrt(a * a + b * b);
    }

    public String toString() {
        return "Area = " + String.format("%.2f", area()) + " Perimeter = " + String.format("%.2f", perimeter()) + " Diagonal = " + String.format("%.2f", diagonal());
    }
}
