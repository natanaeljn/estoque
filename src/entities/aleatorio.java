package entities;

public class aleatorio {
	private String name;
	private double price;
	private int quantity;

	public aleatorio(String name, double price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProduct(int newQuantity) {
		this.quantity += newQuantity;
	}

	public void removeProduct(int remove) {
		this.quantity -= remove;
	}

	public String toString() {
		return "name:" + name + "\n" + "price:R$" + String.format("%.2f", price) + "\n" + "quantity in stock:"
				+ quantity +"\n" + "total value in stock:R$" + String.format("%.2f", totalValueInStock());
	}

}
