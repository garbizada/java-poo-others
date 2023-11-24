package vetores_app;

import java.util.Locale;
import java.util.Scanner;

import vetores_entities.Product;

public class Program {
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	Product[] vect = new Product[n];
	
	for (int i =0; i<n; i++) {
		sc.nextLine();
		String name = sc.nextLine();
		double price = sc.nextDouble();
		vect[i] = new Product(name, price);
	}
	
	double sum = 0;
	
	for (int i = 0; i< n; i++) {
		sum += vect[i].getPrice();
	}
	double avg = sum / n;
	
	System.out.printf("Average price: %.2f%n", avg);
	
	
	sc.close();
	
	}
	
}
