import java.util.Scanner;

// Escreva um programa para encontrar o maior elemento em um array de números inteiros.

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números deseja? ");
        int quantidade = sc.nextInt();
        int[] numeros = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0];
        for (int i = 1; i < quantidade; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior elemento é: " + maior);
        sc.close();
    }
}