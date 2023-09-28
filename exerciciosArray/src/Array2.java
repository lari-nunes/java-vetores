import java.util.Scanner;

public class Array2 {
    // Dado um array de strings, itere sobre ele e imprima cada elemento.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoArray = Integer.parseInt(sc.nextLine());
        String[] arrayNomes = new String[tamanhoArray];

        for (int x = 0; x < tamanhoArray; x++) {
            arrayNomes[x] = sc.nextLine();
        }

        for (String nome : arrayNomes) {
            System.out.println(nome);
        }

        sc.close();
    }
}