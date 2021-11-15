package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class aleatorio {
	private String nameOfProduct;
	private int cod;
	private double value;
	private int quantity;

	public aleatorio() {

	}

	public aleatorio(String nameOfProduct, int cod, double value, int quantity) {
		super();
		this.nameOfProduct = nameOfProduct;
		this.cod = cod;
		this.value = value;
		this.quantity = quantity;
	}

	public String getNameOfProduct() {
		return nameOfProduct;
	}

	public void setNameOfProduct(String nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double total() {
		return value * quantity;
	}

	public String toString() {
		return "name of product:" + nameOfProduct + ",code:" + cod + "\n" + "value:R$" + String.format("%.2f", value)
				+ "\n" + "quantity:" + quantity + "\n" + "total:R$" + String.format("%.2f", total());

	}

}
