package helloworldapp;

public class CardsTestProgram {

	private SuiteOfCards testeOtKarti = new SuiteOfCards();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ebanieeee");
		testicalsMaafaka();
	}

	public void testicalsMaafaka(){
		//SingleCard[] numberOfCardsPresent = testeOtKarti.getDeckOfCards();
		for (int i = 0; i < testeOtKarti.getDeckOfCards().length; i++) {
			//String string = args[i];
			System.out.println("Card: " + testeOtKarti.getDeckOfCards()[i].getSuite() + " " + testeOtKarti.getDeckOfCards()[i].getRank());
		}
		
	}
}
