package com.example;

public class DeckDriver {

    public static void main(String[] args) {

        Deck cards = new StandardDeck();
        System.out.println(cards);

        cards.shuffle();
        System.out.println(cards);

    }


}
