import java.util.Scanner;


/* faça um programa que calcula o fatorial de um número inteiro fornecido pelo usuário.
 EX: 5! -> 5 x 4 x 3 x 2 x 1 = 120 
 */

public class Ex6_Fatorial {
    public static void main(String[] args) { /*Iniciação com o código principal */

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Qual é o fatorial que deseja ver: "); /*Solicita saber qual seria o fatorial de qual número*/
            int fatorial = scan.nextInt(); /*Recebe o número digitado pelo teclado*/

            int multiplicacao = 1;

            System.out.print("O fatorial de " + fatorial + " ! = "); /*Introdução ao fatorial */

            for(int i = fatorial; i >= 1; i--){
                multiplicacao = multiplicacao * i;
            }
            System.out.print(multiplicacao);
        }

    }


}
