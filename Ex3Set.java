import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/* Dado uma lista com 7 notas de um aluno {7, 8.5, 9.3, 5, 7, 0, 3.6}, faça os itens indicados no corpo do programa */

public class Ex3Set {
    public static void main(String[] args) {
        
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); // Não fica na ordem digitada e sim de forma aleatóri. Não é repetido o numero.
        System.out.println(notas);

        System.out.print("Exiba a Posição da nota 5.0: ");
        System.out.println("Como não existe ordenação de posições, não é possivel apresentar a posição correta.");

        System.out.print("Adicione na lista a nota 8.0 na posição 4: ");
        System.out.println("Como não existe ordenação de posições, não é possivel adicionar na posição desejada. ");
        
        System.out.print("Substitua a nota 5.0 pela nota 6.0 : ");
        System.out.println("Não existe o comando/método para realizar substituição em Set, assim não é possivel fazer."); 

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.print("Receba a terceira nota adicionada: ");
        System.out.println("Como não existe o método get, não é possivel apresentar a terceira nota adicionada.");

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator= notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.print("Remova a nota da posição 0");
        System.out.println("Como não existe ordenação de posições, não é possivel remover a nota desejada.");

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println("Remova as notas menores que 7 e exiba a Lista: " + notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas1 = new LinkedHashSet<>();
        notas1.add(7d);
        notas1.add(8.5);
        notas1.add(9.3);
        notas1.add(5d);
        notas1.add(7d);
        notas1.add(0d);
        notas1.add(3.6);
        System.out.println(notas1);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas2 = new TreeSet<>(notas1);
        System.out.println(notas2);

        System.out.println("Apague todo o conjunto");
        notas.clear();
        System.out.println("Certificar se o conjunto está vazio: " + notas1.isEmpty());

    }
}
