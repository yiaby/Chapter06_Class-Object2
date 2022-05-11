package exercise.cardCompany;

public class Cardcompany {
	private static Cardcompany instance = new Cardcompany();
	private Cardcompany() {}
	
	public static Cardcompany getInstance() {
		if(instance == null) {
			instance = new Cardcompany();
		}return instance;
	}
	
	public Card creatCard() {
		Card card = new Card();
		return card;
	}
	
}
