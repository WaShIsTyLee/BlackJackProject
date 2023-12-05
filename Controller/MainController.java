package Controller;

import Model.Card;
import Model.Deck;
import Model.Players;

import java.util.Scanner;

import static View.ViewOfGame.*;

public class MainController {
    static Deck deck = new Deck();
    static int players ;
    static Players players1;
    static Players players2;
    static Players players3;
    static Players players4;
    static Players ia;


    public static void main(String[] args) {

        printCasino();

        optionWelcome(players);
        keyboardString();


    }


    public static int menu() {
        players=playersOfGame();
        switch (players) {
            case 1:
                players1 = new Players();
                ia = new Players();

                players1.setUserName(namePlayer());
                cardAsked(players1,2);
                System.out.println(players1);
                wantCard(players1);
                ia.setUserName(iaName());
                cardAsked(ia,2);
                System.out.println(ia);


                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;

        }


        return players;


    }




    public static Card [] wantCard(Players player) {

        String option;
        boolean valid = true;


        do {
            System.out.println("¿Quiere otra carta?");
            option = keyboardString();

            if (option.equals("si")) {

                cardAsked(player,1);
            } else {
                System.out.println("Su turno ha terminado");
                valid = false;
            }
        } while (valid);
        return player.getDeckPlayer();
    }


    public static Card[] cardAsked(Players player,int howmany) {

        Card[] newPlayerCards = new Card[howmany];
        for (int i = 0; i < newPlayerCards.length; i++) {
            int randomCard = (int) (Math.random() * 52);
            newPlayerCards[i] = deck.getCards()[randomCard];  //sacar del mazo
        }
        player.setDeckPlayer(newPlayerCards);
        System.out.println(newPlayerCards);

        return newPlayerCards;
    }


    public static String keyboardString() {

        Scanner teclado = new Scanner(System.in);
        String keyboard = teclado.nextLine();

        return keyboard;
    }

    public static int keyboardInt() {
        Scanner teclado = new Scanner(System.in);
        int keyboard = teclado.nextInt();

        return keyboard;

    }
}


