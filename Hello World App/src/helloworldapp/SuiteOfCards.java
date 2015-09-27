package helloworldapp;

public class SuiteOfCards {

	private SingleCard[] deckOfCards = new SingleCard[52];
	public SingleCard[] getDeckOfCards() {
		return deckOfCards;
	}
	public void setDeckOfCards(SingleCard[] deckOfCards) {
		this.deckOfCards = deckOfCards;
	}
	public SuiteOfCards() {
		generateOneColor("trefa", 13, 0);
		generateOneColor("karo", 13, 13);
		generateOneColor("kupa", 13, 26);
		generateOneColor("pika", 13, 39);
	}
	public void generateOneColor(String colorOfTheCards, int numberOfCards, int cardsDrawnSoFar){
		for (int i = 1; i <= numberOfCards; i++) {
			this.deckOfCards[cardsDrawnSoFar+i].setCard(colorOfTheCards, i);
		}
	}
	

}
