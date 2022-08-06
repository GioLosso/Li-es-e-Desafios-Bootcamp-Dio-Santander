import java.util.Random;

/*Gere e Imprima uma matriz 4x4 com valores aleatórios entre 0-9. */

public class Ex10_Matriz {
    public static void main(String[] args) {
        Random random = new Random(); /* Gera números de forma aleatória */

        int[][] matriz = new int [4][4]; /* [] representa linha. [] representa coluna. [4][4] deverá haver 4 números na linha e 4 na coluna */

        for(int i = 0; i < matriz.length; i++) { /*Matriz geral - linha */
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}