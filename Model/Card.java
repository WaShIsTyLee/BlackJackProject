package Model;

import java.util.Objects;

public class Card {
    private int value ;  //Valor de la Carta
    private String suit; //Palo de la Carta

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }
    public Card(){
        this(0," ");

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && suit.equals(card.suit);
    }

    @Override
    public String toString() {
        return "Suit: " + suit + "Value: "+ value;
    }
}
