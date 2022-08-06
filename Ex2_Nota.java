import java.util.Scanner;


/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido */

public class Ex2_Nota {
    public static void main(String[] args) { /*Iniciação com o código principal */
        try (Scanner scan = new Scanner(System.in)) {
            int nota; /*Tipo de dado */

            System.out.println("Nota: "); /*O computador pergunta sobre o dado */
            nota = scan.nextInt(); /*Informação sobre o dado e o vinculo de entrada */

            while (nota < 0 || nota > 10){ /*Laço de repetição, onde uma vez que o dado for fora do contexto pedido, é informado e pede para ser digitado novemante */
                System.out.println("Nota Inválida! Digitar novamente: ");
                nota = scan.nextInt();
            }
        }
    }
}
