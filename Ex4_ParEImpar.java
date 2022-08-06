import java.util.Scanner;

/*Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e a quantdade de números Impares. */

public class Ex4_ParEImpar{
    public static void main(String[] args) { /*Iniciação com o código principal */
        try (Scanner scan = new Scanner(System.in)) {
            int qtdNum; /*Tipo de dado: inteiro */
            int numero; /*Tipo de dado: inteiro */
            int pares = 0; /*Tipo de dado: inteiro com atribuição*/
            int impares = 0; /*Tipo de dado: inteiro com atribuição*/

            System.out.println("Quantidade de números: "); /*Solicita a quantidade de número*/
            qtdNum = scan.nextInt(); /* Vincula a quantidade ao tipo de numero do programa */

            int count = 0; /* Atribuição inicial antes de iniciar o laço*/
            do{ /* Laço de repetição considerando a atribuição de números pelo teclado até a quantidade solicitada (entrada também vinda pelo teclado). */
                System.out.println("Digite o número: ");
                numero = scan.nextInt();

                if (numero % 2 == 0) pares++; /* Laço condicional para informar se o número é par ou impar */
                else impares++;

                count ++; /*Operador de incremento, sem esta especificação o laço será infinito*/

            }while(count < qtdNum); /*Indicador do limite de números colocados. Sem esta especificação o laço será infinito */

            System.out.println("Quantidade de Pares: " + pares); /*Informa a quantidade de Pares */
            System.out.println("Quantidade de Impares: " + impares); /*Informa a quantidade de Impares */
        }
    }
}