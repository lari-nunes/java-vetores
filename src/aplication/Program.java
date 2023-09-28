package aplication;
import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for(int x = 0; x<n; x++){
            sc.nextLine();
            String name = sc.nextLine();
            Double price = sc.nextDouble();
            vect[x] = new Product(name, price);
        }

        double sum = 0.0;
        for(int x=0; x<n; x++){
            sum += vect[x].getPrice();
        }

        double avg = sum / n;

        System.out.printf("Average price: %.2f%n", avg);

        sc.close();
    }
}
