package Controller;

import Model.Card;
import Model.Deck;
import Model.Players;

import java.util.Scanner;

import static View.ViewOfGame.optionWelcome;
import static View.ViewOfGame.printCasino;

public class MainController {
    public static void main(String[] args) {

        printCasino();
        optionWelcome();
        keyboardString();
        menu();
    }


    public static void menu() {

        Deck deck = new Deck();
        int players = 0;
        System.out.println("Cuantos jugadores sois: ");
        players = keyboardInt();
        switch (players) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;

        }
        Scanner teclado = new Scanner(System.in);


        Players players1 = new Players();
        give2CardsS1(players1, deck.getCards());
        System.out.println(players1);
        Card[] prueba = deck.getCards();

        players1.cardPlayer(players1.getDeckPlayer(), prueba[3]);
        System.out.println(players1);


    }

    public static Players addPlayer() {

        Players player = new Players();
        System.out.println();
        return player;
    }


    public static void give2CardsS1(Players player1, Card[] deck) {

        Card[] newPlayerCards = new Card[2];
        for (int i = 0; i < newPlayerCards.length; i++) {
            int randomCard = (int) (Math.random() * 52) + 1;
            newPlayerCards[i] = deck[randomCard];
        }
        player1.setDeckPlayer(newPlayerCards);

    }

    /**
     * Ask for a Card // Jugador pide una carta
     *
     * @return Card // Devuelve la carta
     */
    public Card askForCard() {
        return null;
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


