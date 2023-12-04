package Model;

import java.util.Arrays;
import java.util.Random;

public class Deck {
    private Card[] cards = new Card[52];
    private String[] suit = {"Diamantes", "Picas", "Corazones", "Treboles"};

    public Card[] getCards() {
        return cards;
    }

    public Deck() {
        fillDeck();
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                '}';
    }

    /**
     * Fill Deck with cards // Rellenar Mazo con Cartas
     * @return deck // mazo
     */

    public Card[] fillDeck() {

        int count=0;

        for (int i = 0; i < suit.length; i++) {

            for (int j = 1; j <= 13; j++) {

                if (suit[i] == "Picas" || suit[i] == "Treboles") {

                    Card card = new Card(j, suit[i], "Negro" );
                    cards [count] = card;
                    count ++;
                }else{
                    Card card = new Card(j, suit[i], "Rojo" );
                    cards [count] = card;
                    count ++;
                }
            }
        }
        return cards;

    }

    }


