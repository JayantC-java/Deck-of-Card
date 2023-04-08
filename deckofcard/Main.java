package com.company.deckofcard;

public class Main {
	public static void main(String[] args) {
		Deck deck = new Deck();
        System.out.println("Unsorted deck:");
        deck.print();

        deck.sortBySuit();
        System.out.println("\nSorted by suit:");
        deck.print();

        deck.sortByRank();
        System.out.println("\nSorted by rank:");
        deck.print();
	}

}
