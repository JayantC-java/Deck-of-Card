package com.company.deckofcard;

//Define the PlayingCard class that implements the Card interface
public class PlayingCard implements Card {
	private final Suit suit;
	private final Rank rank;
	public PlayingCard(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}
	public int getSuit() {
//Returns the ordinal of this enumeration constant (its position in its enum declaration, where the initial constant is assigned an ordinal of zero).
		return suit.ordinal();//
	}
	public int getRank() {
//Returns the ordinal of this enumeration constant (its position in its enum declaration, where the initial constant is assigned an ordinal of zero).

		return rank.ordinal();
	}
	@Override
	public String toString() {
		return rank.name() + " of " + suit.name();
	}
	
}
