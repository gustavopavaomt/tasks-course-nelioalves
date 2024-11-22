import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height");
        rectangle.setA(sc.nextDouble());
        rectangle.setB(sc.nextDouble());
        System.out.println(rectangle);
    }
}