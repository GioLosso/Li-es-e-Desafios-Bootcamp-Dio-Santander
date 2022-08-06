import java.util.Scanner;

/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 O usuári deve informar de qual número ele deseja ver a tabuada.
 A saída deve ser conforme o exemplo abaixo:

 Tabuada do 5:
 5 x 1 = 5
 5 x 2 = 10
...
5 x 10 = 50
 */

public class Ex5_Tabuada{
    public static void main(String[] args) { /*Iniciação com o código principal */
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Qual número deseja ver a tabuada: "); /*Solicita saber qual seria a tabuada de qual número*/
            int tabuada = scan.nextInt(); /* Vincula o numero da tabuada solicitada*/

            System.out.println("Tabuada de " + tabuada); /*Informa qual a tabuada irá ser mostrada*/

            for(int i = 1; i <= 10; i++ ){ /*Laço de repetição com tamanho determinado considerando de 1 a 10 + o incremento de 1 em 1 */
                System.out.println(tabuada + " X " + i + " = " + (tabuada*i)); /*Mostra a tabuada de acordo com o que pede o enuncionado */
            }
        }
    }
}