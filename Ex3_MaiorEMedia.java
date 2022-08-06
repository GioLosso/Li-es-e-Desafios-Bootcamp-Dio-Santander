import java.util.Scanner;

/*Faça um programa que leia 5 números e informa o maior número e a média desses números */

public class Ex3_MaiorEMedia { 
    public static void main(String[] args) { /*Iniciação com o código principal */
        try (Scanner scanner = new Scanner(System.in)) {
            int numero = 0; /*Tipo de dado: Numero inteiro com valor atribuido*/
            int soma = 0; /*Tipo de dado: Numero inteiro com valor atribuido*/
            int maior = 0; /*Atribuição do contador iniciando com 0 */
            int count = 0; /*Atribuição do contador iniciando com 0 */
            
            do { /*laço de repetição para ler os numeros solicitados pelo aunciado: Até 5. Ao chegar ao 5, o programa de repetição para.*/
                System.out.println("Número: ");
                numero = scanner.nextInt();

                soma = soma + numero;
                
                if (numero > maior){ /*laço consicional para informar o maior número.*/
                    maior = numero;
                }
                count += 1; /*passa para o próximo numero */
                
            }while(count < 5); /* O laço deve repetir enquanto for menor do que 5 */
            
            
            System.out.println("Maior: " + maior); /*Informando o maior número */
            
            System.out.println("Média: " + (soma/5)); /*Informando  dos números */
        }

    }


}
