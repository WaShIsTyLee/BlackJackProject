package Model;

import java.util.Objects;

public class Card {

    private int value;  //Valor de la Carta
    private String suit; //Palo de la Carta
    private String color; //Color de la Carta


    public Card(int value, String suit, String color) {
        this.value = value;
        this.suit = suit;
        this.color = color;
    }


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


    //TOCAR ESTO PARA CREAR UNA CARTA

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("*****************\n");  // Línea superior del contorno
        sb.append("*               *\n");
        sb.append("*   Tu carta    *\n");
        sb.append("*               *\n");
        sb.append("*   value=").append(value).append("     *\n");
        sb.append("*   suit='").append(suit).append("'  *\n");
        sb.append("*   color='").append(color).append("' *\n");
        sb.append("*               *\n");
        sb.append("*****************\n");  // Línea inferior del contorno
        return sb.toString();
    }
}