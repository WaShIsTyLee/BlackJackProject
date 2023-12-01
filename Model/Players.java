package Model;

import java.util.Arrays;
import java.util.Objects;

public class Players {


    private String userName; //Name of the Player //Nombre del Jugador
    private double moneyToBet; // MoneyToBet of Player // Dinero que dispone el Jugador para apostar
    private Card[] deckPlayer;


    public Players(String userName, double moneyToBet, Card[] deckPlayer) {
        this.userName = userName;
        this.moneyToBet = moneyToBet;
        this.deckPlayer = deckPlayer;
    }

    public Players() {

        this(" ", 0, null);
    }

    public void cardPlayer(Card[] playerDeck, Card player) {

        System.out.println(playerDeck);
        System.out.println(player);

        Card[] newPlayerDeck = new Card[playerDeck.length + 1];
        for (int i = 0; i < playerDeck.length; i++) {

            newPlayerDeck[i] = playerDeck[i];

        }
        System.out.println(newPlayerDeck.length);
        newPlayerDeck[(newPlayerDeck.length-1)]= player;
        setDeckPlayer(newPlayerDeck);

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoneyToBet() {
        return moneyToBet;
    }

    public void setMoneyToBet(double moneyToBet) {
        this.moneyToBet = moneyToBet;
    }

    public Card[] getDeckPlayer() {
        return deckPlayer;
    }

    public void setDeckPlayer(Card[] deckPlayer) {
        this.deckPlayer = deckPlayer;
    }

    @Override
    public String toString() {
        return "Players{" +
                "userName='" + userName + '\'' +
                ", moneyToBet=" + moneyToBet +
                ", deckPlayer=" + Arrays.toString(deckPlayer) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Players players)) return false;
        return Objects.equals(getUserName(), players.getUserName()) && Arrays.equals(getDeckPlayer(), players.getDeckPlayer());
    }




}
