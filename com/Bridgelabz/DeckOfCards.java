package com.Bridgelabz;
public class DeckOfCards {
// initialization of suit and ranks
	String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	String[] deck = new String[52];

// Using for loop
	public void printCard() {
		for (int i = 0; i < deck.length; i++) {
			deck[i] = rank[i % 13] + suit[i / 13];
			System.out.println(deck[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to DeckOfCard game.");
		DeckOfCards deckOfCards = new DeckOfCards();
		deckOfCards.printCard();
	}
}