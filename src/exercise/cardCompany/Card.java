package exercise.cardCompany;

public class Card {

	public static int serialNum = 1000;
	public int cardNum;
	
	public Card() {
		serialNum += 100;
		cardNum = serialNum;
	}
	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
	
	
	
	
	
}
