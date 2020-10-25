package demo;

public class CustomerData {
	private String name;
	private AccData card;

	public CustomerData() {
	}
	public CustomerData(String name,AccData card) {
		this.name=name;
		this.card=card;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccData getCard() {
		return card;
	}

	public void setCard(AccData c1) {
		this.card = c1;
	}
}