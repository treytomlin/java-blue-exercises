package com.techelevator.cardExample;

public class CardDemo {

	public static void main(String[] args) {

		Card card = new Card("d", "5");
		System.out.println(card);
		card.flip();
		System.out.println(card);
		
		Deck deck = new Deck();
		System.out.print(deck);
		
		
		deck.shuffle();
		System.out.println(deck);
		
		Card cardOne = deck.deal();
		cardOne.flip();
		System.out.println(cardOne);
		
		cardOne = deck.deal();
		cardOne.flip();
		System.out.println(cardOne);
		
		cardOne = deck.deal();
		cardOne.flip();
		System.out.println(cardOne);
		
		System.out.println(deck.size());
		
		
	}

}
