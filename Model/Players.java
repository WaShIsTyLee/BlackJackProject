package Model;

import java.util.Arrays;
import java.util.Objects;

public class Players {


    private String userName; //Name of the Player //Nombre del Jugador
    private Card[] deckPlayer; //Deck of player // Mazo del jugador
    private int sum;






    public Players(String userName, Card[] deckPlayer, int sum) {
        this.userName = userName;
        this.deckPlayer = deckPlayer;
        this.sum=sum;

    }
;
    public Players(){
        this ("",null,0);
    }

    public int getSum() {
        return sum;
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




