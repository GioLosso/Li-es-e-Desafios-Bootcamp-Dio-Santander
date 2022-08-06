
/*Crie um vetor de 6 números inteiras e mostre-os na ordem inversa. */

public class Ex7_OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {-5, 15, 50, 8, 4, -6};

        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor Inverso: ");
        for (int i = (vetor.length -1); 1 >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }
}
