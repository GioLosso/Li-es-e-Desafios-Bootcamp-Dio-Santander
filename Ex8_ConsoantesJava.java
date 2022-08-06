import java.util.Scanner;

/* Faça um programa que leia um vetor de 6 caracteres e diga quantas consoantes foram lidas.
 Imprima as consoantes.
 */

 public class Ex8_ConsoantesJava {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            String[] consoantes = new String[6]; /*Representa a criação do vetor com 6 caracteres */
            int qtdConsoantes = 0; 
            int count = 0;
            do{
                System.out.println("Letra: ");
                String letra = scan.next();

                if (!(letra.equalsIgnoreCase("a") |
                   letra.equalsIgnoreCase("e") | /*Irá ignorar as vogais através da condicional if */
                   letra.equalsIgnoreCase("i") |
                   letra.equalsIgnoreCase("o") |
                   letra.equalsIgnoreCase("u"))) {
                    consoantes[count] = letra;
                    qtdConsoantes++;
                }
            count++;
            }while(count < consoantes.length); /*Repetirá o laço até o array de consoantes que será no caso o valor 6 */
                System.out.println("Consoantes: ");
                
            for (String consoante : consoantes) {
                if (consoante != null)
                    System.out.print(consoante + " ");
            }
            System.out.println("Quantidade de consoantes: " + qtdConsoantes);
        }

    }
 }