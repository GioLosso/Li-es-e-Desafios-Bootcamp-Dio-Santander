import java.util.Scanner;

/*Faça um programa que leia conjuntos de dois valores, o promeiro representando o nome do aluno e o segundo representando a sua idade.
 (Pare o programa inserindo o valor 0 no campo nome)
 */

 public class Ex1_NomeEIdade{

    public static void main(String[] args) {  /*Programa principal */
        try (Scanner scan = new Scanner(System.in)) {
            String nome;   /*Tips de dados */
            int idade;

            while(true){ /*Laço de repetição para colocar quantos nomes quiser até digitar 0 */

                System.out.println("Nome: ");  /* Frase onde será digitado e coletado as informações*/
                nome = scan.next(); /*Captura o nome e faz o vinculo com a entrada digitada String*/
                if (nome.equals("0")) break; /*O laço irá parar quando digitar 0 */

                System.out.println("Idade: ");
                idade = scan.nextInt(); /*Captura o nome e faz o vinculo com a entrada digitada número inteiro*/
            }
        }

        System.out.println("Até Logo...."); /*Frase final */
    }

 }