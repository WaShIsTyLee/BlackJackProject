package Model;

import java.util.Arrays;
import java.util.Random;

public class Deck {
    private Card[] cards = new Card[52];  //Deck of 52 cards // Mazo de 52 cartas
    private String[] suit = {"\u2666", "\u2660", "\u2764", "\u2663"}; // suit of the deck Diamonds, Lance, Hearths, Clovers // Palos del mazo Diamantes, Picas, Corazones y Trebolos

    public Card[] getCards() {
        return cards;
    }

    public Deck() {
        fillDeck();
    }

    @Override
    public String toString() {
        return Arrays.toString(cards);
    }

    /**
     * Fill Deck with cards // Rellenar Mazo con Cartas
     * @return deck // mazo
     */

    public Card[] fillDeck() {

        int count=0;

        for (int i = 0; i < suit.length; i++) {

            for (int j = 1; j <= 13; j++) {

                if (suit[i] == "\u2660" || suit[i] == "\u2663") {

                    Card card = new Card(j, suit[i], "\033[30m" );
                    cards [count] = card;
                    count ++;
                }else{
                    Card card = new Card(j, suit[i], "\033[31m" );
                    cards [count] = card;
                    count ++;
                }
            }
        }
        return cards;

    }

    }


