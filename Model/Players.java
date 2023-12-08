package Model;

import java.util.Arrays;
import java.util.Objects;

public class Players {


    private String userName; //Name of the Player //Nombre del Jugador
    private Card[] deckPlayer; //Deck of player // Mazo del jugador
    private int sum;
    private int pocketPlayer;
    private int bet;





    public Players(String userName, Card[] deckPlayer, int sum, int pocketPlayer,int bet) {
        this.userName = userName;
        this.deckPlayer = deckPlayer;
        this.sum=sum;
        this.pocketPlayer=pocketPlayer;
        this.bet = bet;
    }
;
    public Players(){
        this ("",null,0,0,0);
    }

    public int getSum() {
        return sum;
    }

    public int getPocketPlayer() {
        return pocketPlayer;
    }

    public void setPocketPlayer(int pocketPlayer) {
        this.pocketPlayer = pocketPlayer;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Card[] getDeckPlayer() {
        return deckPlayer;
    }

    public void setDeckPlayer(Card[] deckPlayer) {

        this.deckPlayer = deckPlayer;
    }


    public void cardPlayer(Card[] playerDeck, Card player) {

        System.out.println(playerDeck);
        System.out.println(player);

        Card[] newPlayerDeck = new Card[playerDeck.length + 1];
        for (int i = 0; i < playerDeck.length; i++) {

            newPlayerDeck[i] = playerDeck[i];

        }
        newPlayerDeck[(newPlayerDeck.length - 1)] = player;
        setDeckPlayer(newPlayerDeck);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Players players)) return false;
        return Objects.equals(getUserName(), players.getUserName()) && Arrays.equals(getDeckPlayer(), players.getDeckPlayer());
    }

    @Override
    public String toString() {
        StringBuffer cardString = new StringBuffer();

        for (Card card: deckPlayer ) {
            cardString.append(card.toString());
        }

        return  cardString.toString();
    }
}




