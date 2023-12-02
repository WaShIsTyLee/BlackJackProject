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

            for (int j = 1; j <= 12; j++) {

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


    /**
     * Give 2 random Card to player in the step 1 // Da dos carta aleatoria al usuario en el primer movimiento
     *
     * @param cards
     * @return
     */
    public Card[] give2RandomCard(Card[] cards, int numCards) {

        Random give2RandomCard = new Random();
        Card[] randomCard = new Card[numCards];

        for (int i = 0; i < numCards; i++) {

            int index = give2RandomCard.nextInt(cards.length);
            randomCard[i] = cards[index];
        }
        return null;
    }
// PASAR VALOR NUMCARDS DESDE OTRA FUNCION

    /**
     * Give a Card if player ask for one // Da una carta al jugador cuando este la pide
     * @param cards for player // Carta del jugador cuando pide
     * @return Card // Carta
     */
    public Card[] giveRandomCardAsked(Card[] cards, int numCards) {
        Random giveRandomCardAsked = new Random();
        Card[] randomCard = new Card[numCards];

        for (int i = 0; i < 1; i++) {

            int index = giveRandomCardAsked.nextInt(cards.length);
            randomCard[i] = cards[index];
        }
        return null;
    }
}



