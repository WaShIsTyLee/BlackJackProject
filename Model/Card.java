package Model;

import java.util.Objects;

public class Card {

    private int value;  //Valor de la Carta
    private String suit; //Palo de la Carta
    private String color; //Color de la Carta

    /**
     * Parameterized constructor Card // Constructor parametrizado Carta
     *
     * @param value of Card // Valor de Carta
     * @param suit  of Car // Palo de Carta
     * @param color of Card // Color de la Carta
     */
    public Card(int value, String suit, String color) {
        this.value = value;
        this.suit = suit;
        this.color = color;
    }

    /**
     * Default Constructor // Constructor por defecto
     */
    public Card() {
        this(0, " ", " ");
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card card)) return false;
        return getValue() == card.getValue() && Objects.equals(getSuit(), card.getSuit());
    }

    @Override
    public String toString() {
        StringBuilder carta = new StringBuilder();

        carta.append("+--------------+\n");
        carta.append("|              |\n");
        carta.append("|              |\n");
        carta.append("|   ").append(value).append("    |\n");
        carta.append("|              |\n");
        carta.append("|              |\n");
        carta.append("|              |\n");
        carta.append("|     ").append(suit).append("      |\n");
        carta.append("|              |\n");
        carta.append("|              |\n");
        carta.append("+--------------+\n");
        carta.append("Tu carta: ").append(color);

        return carta.toString();


    }
}