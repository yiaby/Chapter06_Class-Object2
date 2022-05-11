package cooperation;

public class Bus {
	int busNum;
	int passengerCount;
	int money;
	
	//버스 번호를 매개변수로 받는 생성자
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	//승객이 버스에 탄 경우를 구현한 메서드
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	//버스 정보를 출력하는 메서드
	public void showInfo() {
		System.out.println("버스"+busNum + "번의 승객은" + passengerCount + "명이고, 수입은" + money + "입니다.");
	}

}
