package exercise.cardCompany;

public class CardTest {

	public static void main(String[] args) {
		Cardcompany company = Cardcompany.getInstance(); 
		
		Card card1 = company.creatCard();
		Card card2 = company.creatCard();
		
		System.out.println(card1.getCardNum());
		
		System.out.println(card2.getCardNum());
	}

}
