package exercise.caffe;

public class Customer {
	 String customerName;
     int money;
	 String menue;
	 int count;
	
	Customer(String name, int money) {
		customerName = name;
		this.money = money;
	}
	
	//손님이 별다방에서 아메리카노를 샀은경우
	public void orderAmericano(Starbucks starbucks, int money, int count) {
		String message = starbucks.brewing(4000, count);
		if(message != null) {
				this.money += money;
				money = money * count; 
				System.out.println(customerName + "님 : " + message + "총 " + money + "원 입니다.");
		}
		
	}
	public void orderLatte(Starbucks starbucks, int money, int count) {
		String message = starbucks.brewing(5000, count);
		if(message != null) {
			this.money += money;
			money = money * count; 
			System.out.println(customerName + "님 : " + message + "총 " + money + "원 입니다.");
		}
		
	}
	
	
	//손님이 콩다방에서 커피를 샀을 경우
	public void orderCoffebean(Coffeebean coffeebean, int count) {
		menue = "라테";
		this.count = count;
		coffeebean.buyLatte(count);
		money = Menue.coffeebieanLatte * count;
		
		
	}
	
	

}
