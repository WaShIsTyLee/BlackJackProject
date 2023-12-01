package Model;

import java.util.Random;

public class Deck {
    private Card[] cards = new Card[51];


    /**
     * Give 2 random Card to player in the step 1 // Da dos carta aleatoria al usuario en el primer movimiento
     * @param cards
     * @return
     */
    public Card[] give2RandomCard(Card[] cards) {

        Random give2RandomCard = new Random();
        Card[] randomCard = new Card[2];

        for (int i = 0; i < 2; i++) {

                int index = give2RandomCard.nextInt(cards.length);
                randomCard[i] = cards[index];
            }
        return give2RandomCard(cards);
    }

    /**
     * Give a Card if player ask for one // Da una carta al jugador cuando este la pide
     * @param cards for player // Carta del jugador cuando pide
     * @return Card // Carta
     */
    public Card[] giveRandomCardAsked(Card[] cards) {
        Random giveRandomCardAsked = new Random();
        Card[] randomCard = new Card[1];

        for (int i = 0; i < 1; i++) {

            int index = giveRandomCardAsked.nextInt(cards.length);
            randomCard[i] = cards[index];
        }
        return give2RandomCard(cards);
    }
    }



