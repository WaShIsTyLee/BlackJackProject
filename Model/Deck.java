package Model;

public class Deck {
    private Card[] cards = new Card[51];


    /**
     * Give 2 random Card to player in the step 1 // Da dos carta aleatoria al usuario en el primer movimiento
     *
     * @param cards
     * @return
     */
    public Card[] give2RandomCard(Card[] cards) {

        return give2RandomCard(cards);
    }

    /**
     * Give a Card if player ask for one // Da una carta al jugador cuando este la pide
     *
     * @param cards for player // Carta del jugador cuando pide
     * @return Card // Carta
     */
    public Card[] giveRandomCardAsked(Card[] cards) {

        return giveRandomCardAsked(cards);
    }
}


