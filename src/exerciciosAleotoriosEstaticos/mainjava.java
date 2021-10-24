package exerciciosAleotoriosEstaticos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.aleatorio;

public class mainjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter with name, price and quantity of product");
		String name = sc.nextLine();
		double price = sc.nextDouble();
		int quantity = sc.nextInt();
		aleatorio aleatorio = new aleatorio(name, price, quantity);
		System.out.println(aleatorio);
		System.out.println("Do you want to change something from the stock?");
		char resp = sc.next().charAt(0);
		while (resp != 'n') {
			System.out.println("do you want to add or remove?1-add,2-remove");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("how many products do you want to add?");
				int newQuantity = sc.nextInt();
				aleatorio.addProduct(newQuantity);
			} else {
				System.out.println("how many products do you want to remove?");
				int remove = sc.nextInt();
				aleatorio.removeProduct(remove);

			}
			System.out.println("Do you want to change something from the stock?");
			resp = sc.next().charAt(0);
		}

		System.out.println(aleatorio);

		sc.close();
	}

}
