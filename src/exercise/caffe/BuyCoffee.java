package exercise.caffe;

public class BuyCoffee {

	public static void main(String[] args) {
		//손님
		Customer Kim = new Customer("김지윤", 50000);
		Customer lee = new Customer("이지현", 10000);
		Customer park = new Customer("박수진", 30000);
		
		//별다방
		Starbucks starbucks1 = new Starbucks("별다방 신논현");
		Kim.orderAmericano(starbucks1, 4000, 2);
		
		park.orderAmericano(starbucks1, 5000, 1);
		
		
		System.out.println();
		
		//콩다방
		Coffeebean coffeebean1 = new Coffeebean("콩다방 홍대");
		lee.orderCoffebean(coffeebean1, 1);
		coffeebean1.showInfo();
		
		
	}

}
