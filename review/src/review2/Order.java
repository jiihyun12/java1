package review2;

import java.util.Scanner;

public class Order{
	Product product;
	int quantity;
	
	public Order(Product product, int quantity) {
		this.quantity = quantity;
		this.product = product;
	}

	public int getTotalPrice() {
		return product.price * quantity;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명을 입력하세요");
		String name = sc.nextLine();
		
		System.out.println("상품 가격을 입력하세요");
		int price = sc.nextInt();
		
		Product product = new Product(name, price);
		Order order = new Order(product, 3);
		System.out.println("총 가격 :" + order.getTotalPrice());
		
	}
}
