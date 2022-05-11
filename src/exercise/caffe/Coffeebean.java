package exercise.caffe;

public class Coffeebean {
	int money;
	String branchName;
	int count;
	
	public Coffeebean(String branchName) {
		this.branchName = branchName;
	}
    
	public void buyAmericano(int count) {
    	money += Menue.coffeebeanAmericano * count;
    }
	
	public void buyLatte(int count) {
		money += Menue.coffeebieanLatte * count ;	
	}
	//별다방의 정보를 보여주는 메서드
	public void showInfo() {
		System.out.println(branchName + "지점의 현 매출은 총 " + money + "원 입니다.");
	}
	
}
