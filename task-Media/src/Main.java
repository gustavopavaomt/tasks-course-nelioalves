import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Media media = new Media();
        System.out.println("Welcome to the Media System");
        System.out.println("Name: ");
        media.setNome(sc.nextLine());
        System.out.println("Note 1: ");
        media.setNota1(sc.nextDouble());
        System.out.println("Note 2: ");
        media.setNota2(sc.nextDouble());
        System.out.println("Note 3: ");
        media.setNota3(sc.nextDouble());

        System.out.println(media.mediaFinal());

        sc.close();


    }
}