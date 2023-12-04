package Controller;

import Model.Card;
import Model.Deck;
import Model.Players;

import java.util.Scanner;

import static View.ViewOfGame.*;

public class MainController {
    public static void main(String[] args) {

        printCasino();
        optionWelcome();
        keyboardString();


    }


    public static int menu(int playersOfGame) {

        Deck deck = new Deck();
        int players = playersOfGame;
        Players players1;
        Players players2;
        Players players3;
        Players players4;
        Players ia;

        switch (players) {
            case 1:
                players1 = new Players();
                ia = new Players();

                players1.setUserName(namePlayer());
                give2CardsS1(players1, deck.getCards());
                System.out.println(players1);
                ia.setUserName(iaName());
                give2CardsS1(ia, deck.getCards());
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


    public static void give2CardsS1(Players player1, Card[] deck) {

        Card[] newPlayerCards = new Card[2];
        for (int i = 0; i < newPlayerCards.length; i++) {
            int randomCard = (int) (Math.random() * 52) + 1;
            newPlayerCards[i] = deck[randomCard];
        }
        player1.setDeckPlayer(newPlayerCards);
        System.out.println(newPlayerCards);

    }

    public static void wantCard() {

        String option = " ";
        boolean valid = true;
        Players player = new Players();
       // Card[] deck = new Card[];

        do {
            System.out.println("¿Quiere otra carta?");
            option = keyboardString();

            if (option.equals("si")) {
                //cardAsked(player,);
            } else {
                System.out.println("Su turno ha terminado");
                valid = false;
            }
        } while (valid);
    }


    public static Card[] cardAsked(Players player1, Card[] deck) {

        Card[] newPlayerCards = new Card[1];
        for (int i = 0; i < newPlayerCards.length; i++) {
            int randomCard = (int) (Math.random() * 52) + 1;
            newPlayerCards[i] = deck[randomCard];
        }
        player1.setDeckPlayer(newPlayerCards);
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


