package exercise.caffe;

public class Starbucks {
	int money;
	String brachName;
	int count;
	
	public Starbucks(String brachName) {
		this.brachName = brachName;
	}
	public String brewing(int money,int count) {
		this.money += money;
		
			if(money == Menue.starbucksAmericano) {
				return "별 다방 아메리카노를 "+ count +"잔(개) 구입했습니다.";
			}
			else if(money == Menue.starbucksLatte) {
				return "별 다방 라떼를 " + count + "잔(개) 구입했습니다.";
			}
			else {
				return null;
			}
			
	}
	

}
