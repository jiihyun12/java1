package classTest;

class Market {
// 상품, 가격, 재고
//sell() 메서드
	String product;
	int price;
	int marketStock;
	
//	기본 생성자
	public Market() {;}
	
//	초기화 생성자
//	Alt Shift S -> O -> 엔터
	public Market(String product, int price, int marketStock) {
		this.product = product;
		this.price = price;
		this.marketStock = marketStock;
	}
	
	// 팔렸을 때 
	// 매개변수로 판매할 사람부터 받기
	void sell(Customer customer) {
		marketStock--; // 재고 -1
		System.out.println("할인된 가격 : " + price * (customer.discount / 100.0));
		customer.money -= price - price * (customer.discount / 100.0); 
	}
}

class Customer {
// 이름, 전화번호, 돈, 할인율	
	String name;
	String number;
	int money;
	int discount; 
	
	public Customer() {;}

	public Customer(String name, String number, int money, int discount) {
		this.name = name;
		this.number = number;
		this.money = money;
		this.discount = discount;
	}		
}

public class ClassTask1 {
	public static void main(String[] args) {
//		sell() 사용
//		사람의 돈 출력
//		마켓 상품의 재고 출력
		Market emart = new Market("감자", 7000, 100);
		Customer hjh = new Customer("함지현", "01085649679",10000, 10);
		
		System.out.println("판매전 재고 :" + emart.marketStock);
		System.out.println("판매 전 돈 : " + hjh.money);
		emart.sell(hjh);
		System.out.println("판매 후 재고 : " + emart.marketStock);
		
	}
}
