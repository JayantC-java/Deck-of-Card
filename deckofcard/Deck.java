package com.company.deckofcard;

import java.util.Arrays;

public class Deck {
	private PlayingCard[] cards;
	
	public Deck() {
		cards = new PlayingCard[52];
		int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i++] = new PlayingCard(suit, rank);
            }
        }
	}
	
	public void sortBySuit() {
		Arrays.sort(cards, (c1, c2) -> {
            if (c1.getSuit() < c2.getSuit()) {
                return -1;
            } else if (c1.getSuit() > c2.getSuit()) {
                return 1;
            } else {
                return c1.getRank() - c2.getRank();
            }
        });
	}
	
	public void sortByRank() {
        Arrays.sort(cards, (c1, c2) -> {
            if (c1.getRank() < c2.getRank()) {
                return -1;
            } else if (c1.getRank() > c2.getRank()) {
                return 1;
            } else {
                return c1.getSuit() - c2.getSuit();
            }
        });
    }
	
	public void print() {
        for (PlayingCard card : cards) {
            System.out.println(card);
        }
    }

}
