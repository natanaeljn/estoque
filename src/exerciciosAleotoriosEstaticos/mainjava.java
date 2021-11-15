package exerciciosAleotoriosEstaticos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.aleatorio;

public class mainjava {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<aleatorio> list = new ArrayList<>();
		System.out.println("add product to list?");
		char resp = sc.next().charAt(0);
		double totality = 0;
		while (resp != 'n') {
			System.out.print("enter the name of product:");
			sc.nextLine();
			String nameOfProduct = sc.nextLine();
			System.out.print("enter the code :");
			int code = sc.nextInt();
			System.out.print("enter the value :");
			double value = sc.nextDouble();
			System.out.print("enter the quantity :");
			int quantity = sc.nextInt();
			aleatorio aleatorio = new aleatorio(nameOfProduct, code, value, quantity);
			list.add(aleatorio);
			totality += aleatorio.total();
			System.out.println("add product to list?");
			resp = sc.next().charAt(0);

		}
		System.out.println("total invoice:");
		for (aleatorio z : list) {
			System.out.println(z);
		}

		System.out.printf("total of all items: R$ %.2f\n  ", totality);

		sc.close();
	}

}
