import java.util.Locale;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
//        Crie um array de inteiros com 5 elementos e calcule a soma de todos eles.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int x=0; x<n; x++){
            vect[x] = sc.nextInt();
        }

        double sum = 0.0;
        for(int x=0; x<n; x++){
            sum += vect[x];
        }

        System.out.printf("A soma do array é de: %.2f%n", sum);

        sc.close();
    }
}
