package classTest;

class Market {
//	상품, 가격, 재고
	String productName;
	int productPrice;
	int productStock;
	
	public Market() {;}

	public Market(String productName, int productPrice, int productStock) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}
	
//	sell() 메서드
	void sell(Customer customer) {
		productStock--;
		System.out.println("할인된 가격 : " + productPrice * ( customer.discount / 100.0 ));
		customer.money -= productPrice - productPrice * ( customer.discount / 100.0 );
	}
	
}

class Customer {
//	이름, 전화번호, 돈, 할인율
	String name;
	String phone;
	int money;
	int discount;
	
//	기본 생성자
	public Customer() {;}

//	초기화 생성자
//	Alt + Shift + S -> O -> Enter
	public Customer(String name, String phone, int money, int discount) {
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.discount = discount;
	}
}

public class ClassTask1 {
	public static void main(String[] args) {
//		sell() 사용
//		사람의 돈 출력
//		마켓 상품의 재고 출력
//		20분
		Market emart = new Market("감자", 7000, 100);
		Customer hjd = new Customer("홍길동", "01012345678", 10000, 30);
		Customer lss = new Customer("이순신", "01000000000", 100000, 50);
		
		System.out.println("판매전 재고 : " + emart.productStock);
		System.out.println("판매전 돈 : " + hjd.money);
		emart.sell(hjd);
		System.out.println("판매후 재고 : " + emart.productStock);
		System.out.println("판매후 돈 : " + hjd.money);
		
		System.out.println("판매전 재고 : " + emart.productStock);
		System.out.println("판매전 돈 : " + lss.money);
		emart.sell(lss);
		System.out.println("판매후 재고 : " + emart.productStock);
		System.out.println("판매후 돈 : " + lss.money);
		
	}
}





