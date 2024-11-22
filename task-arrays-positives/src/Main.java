import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,2,11,14,13,20);
        int amountPositeves = 0;
        for(int i =0; i < list.size(); i++){
            if(list.get(i) %2 ==0){
                System.out.println(list.get(i));
                amountPositeves++;
            }
        }
        System.out.println("Quantia de pares: " + amountPositeves);
    }
}