package com.training.function.webfunction;

public class Card {

	private String cardRef;
	private String lastFourDigits;
	private int vcc;

	public Card(String cardRef, String lastFourDigits, int vcc) {
		super();
		this.cardRef = cardRef;
		this.lastFourDigits = lastFourDigits;
		this.vcc = vcc;
	}

	public String getCardRef() {
		return cardRef;
	}

	public void setCardRef(String cardRef) {
		this.cardRef = cardRef;
	}

	public String getLastFourDigits() {
		return lastFourDigits;
	}

	public void setLastFourDigits(String lastFourDigits) {
		this.lastFourDigits = lastFourDigits;
	}

	public int getVcc() {
		return vcc;
	}

	public void setVcc(int vcc) {
		this.vcc = vcc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Card [cardRef=").append(cardRef).append(", lastFourDigits=").append(lastFourDigits)
				.append(", vcc=").append(vcc).append("]");
		return builder.toString();
	}
	
	

}
