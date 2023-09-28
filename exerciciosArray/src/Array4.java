import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

    // Crie um array de números inteiros e ordene-o em ordem crescente.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números deseja?");
        int numeros = sc.nextInt();
        int[] arrayNumeros = new int[numeros];

        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            arrayNumeros[i] = sc.nextInt();
        }

        Arrays.sort(arrayNumeros);
        System.out.println(Arrays.toString(arrayNumeros));

        sc.close();
    }
}