package helloworldapp;


public class SingleCard {
	private String suite;
	private String rank;
	private int power = 1;
	
	public String getSuite() {
		return suite;
	}
	public void setSuite(String suite) {
		this.suite = suite;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public void setCard(String suite, int power) {
		this.suite = suite;
		this.power = power;
		switch (power){
		case 1: this.rank = "2";
		break;
		case 2: this.rank = "3";
		break;
		case 3: this.rank = "4";
		break;
		case 4: this.rank = "5";
		break;
		case 5: this.rank = "6";
		break;
		case 6: this.rank = "7";
		break;
		case 7: this.rank = "8";
		break;
		case 8: this.rank = "9";
		break;
		case 9: this.rank = "10";
		break;
		case 10: this.rank = "Vale";
		break;
		case 11: this.rank = "Dama";
		break;
		case 12: this.rank = "Pop";
		break;
		case 13: this.rank = "Tuz";
		break;
		case 14: this.rank = "3";
		break;
		default: this.rank ="invalid rank be";
		}
	}
	public SingleCard() {
		// TODO Auto-generated constructor stub
		setCard("trefa", 2);
	}
	
	
}
