import entites.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{


    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Joao",15, 1.82),
                new Person("Maria",16, 1.60),
                new Person("Teresa",14, 1.58),
                new Person("Carlos",21, 1.65),
                new Person("Paulo",17, 1.78)
        );
        double alturaMedia = 0.0;
        List<Person> pessoasMenores = new ArrayList<>();
        double porcentagemMenores = 0.0;

        for( Person p : list){
            alturaMedia += p.getAltura();
            if(p.getIdade() < 16){
                pessoasMenores.add(p);
            }
        }
        porcentagemMenores = ((double) pessoasMenores.size() / list.size()) * 100.0;
        System.out.printf("Altura media: %.2f%n", alturaMedia/list.size());
        System.out.println("A porcentagem de menores é: " + porcentagemMenores + "%");
        System.out.printf("Pessoas menores: %n");

        for( Person p : pessoasMenores){
            System.out.println(p.getNome());
        }
    }
}