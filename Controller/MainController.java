package Controller;

import Model.Card;
import Model.Deck;
import Model.Players;

import java.util.Scanner;

import static View.ViewOfGame.*;

public class MainController {
    static Deck deck = new Deck();
    static int players;
    static Players players1;
    static Players players2;
    static Players players3;
    static Players players4;
    static Players ia;


    public static void main(String[] args) {

        printCasino();

        optionWelcome(players);


    }


    public static int menu() {
        players = playersOfGame();
        switch (players) {
            case 1:
                int sumaJugador1 = 0;
                int sumaJugador2 = 0;
                int sumaJugador3 = 0;
                int sumaJugador4 = 0;

                players1 = new Players();
                ia = new Players();
                players1.setUserName(namePlayer());
                cardAsked(players1, 2);
                System.out.println(players1);
                wantCard(players1);
                sumaJugador1 = isBlackJack(players1);
                soutResult(sumaJugador1, players1);

                ia.setUserName(iaName());
                System.out.println("Turno de: " + iaName());
                cardAsked(ia, 2);
                wantIA(ia, sumaJugador1);
                sumaJugador1 = isBlackJack(ia);
                soutResult(sumaJugador1, ia);
                break;


            case 2:
                players1 = new Players();
                players2 = new Players();
                ia = new Players();

                players1.setUserName(namePlayer());
                cardAsked(players1, 2);
                System.out.println(players1);
                wantCard(players1);
                sumaJugador1 = isBlackJack(players1);
                soutResult(sumaJugador1, players1);

                players2.setUserName(namePlayer());
                cardAsked(players2, 2);
                System.out.println(players2);
                wantCard(players2);
                sumaJugador2 = isBlackJack(players2);
                soutResult(sumaJugador2, players2);

                ia.setUserName(iaName());
                System.out.println("Turno de: " + iaName());
                cardAsked(ia, 2);
                wantIA(ia, sumaJugador1);
                sumaJugador1 = isBlackJack(ia);
                soutResult(sumaJugador1, ia);

                break;
            case 3:
                players1 = new Players();
                players2 = new Players();
                players3 = new Players();
                ia = new Players();

                players1.setUserName(namePlayer());
                cardAsked(players1, 2);
                System.out.println(players1);
                wantCard(players1);
                sumaJugador1 = isBlackJack(players1);
                soutResult(sumaJugador1, players1);

                players2.setUserName(namePlayer());
                cardAsked(players2, 2);
                System.out.println(players2);
                wantCard(players2);
                sumaJugador2 = isBlackJack(players2);
                soutResult(sumaJugador2, players2);

                players3.setUserName(namePlayer());
                cardAsked(players3, 2);
                System.out.println(players3);
                wantCard(players3);
                sumaJugador3 = isBlackJack(players3);
                soutResult(sumaJugador3, players3);


                ia.setUserName(iaName());
                System.out.println("Turno de: " + iaName());
                cardAsked(ia, 2);
                wantIA(ia, sumaJugador1);
                sumaJugador1 = isBlackJack(ia);
                soutResult(sumaJugador1, ia);


                break;
            case 4:
                players1 = new Players();
                players2 = new Players();
                players3 = new Players();
                players4 = new Players();
                ia = new Players();

                players1.setUserName(namePlayer());
                cardAsked(players1, 2);
                System.out.println(players1);
                wantCard(players1);
                sumaJugador1 = isBlackJack(players1);
                soutResult(sumaJugador1, players1);

                players2.setUserName(namePlayer());
                cardAsked(players2, 2);
                System.out.println(players2);
                wantCard(players2);
                sumaJugador2 = isBlackJack(players2);
                soutResult(sumaJugador2, players2);

                players3.setUserName(namePlayer());
                cardAsked(players3, 2);
                System.out.println(players3);
                wantCard(players3);
                sumaJugador3 = isBlackJack(players3);
                soutResult(sumaJugador3, players3);

                players4.setUserName(namePlayer());
                cardAsked(players4, 2);
                System.out.println(players4);
                wantCard(players4);
                sumaJugador4 = isBlackJack(players4);
                soutResult(sumaJugador4, players4);

                ia.setUserName(iaName());
                System.out.println("Turno de: " + iaName());
                cardAsked(ia, 2);
                wantIA(ia, sumaJugador1);
                sumaJugador1 = isBlackJack(ia);
                soutResult(sumaJugador1, ia);

                break;

        }


        return players;


    }


    public static Card[] wantIA(Players player, int sumaJugador) {

        int resultado = 0;
        boolean valid = true;
        do {
            if (sumaJugador > resultado && sumaJugador < 21) {

                cardAsked(player, 1);
                resultado = isBlackJack(player);
            } else {
                System.out.print(player.toString());
                valid = false;
            }
        } while (valid);
        return player.getDeckPlayer();
    }

    public static Card[] wantCard(Players player) {

        String option;
        boolean valid = true;


        do {
            System.out.println("¿Quiere otra carta?");
            option = keyboardString();

            if (option.toLowerCase().equals("si")) {

                cardAsked(player, 1);
                System.out.println(player.toString());
            } else {
                System.out.print(player.toString());
                valid = false;
            }
        } while (valid);
        return player.getDeckPlayer();
    }


    public static void cardAsked(Players player, int howmany) {

        if (howmany == 2) {
            Card[] newPlayerCards = new Card[howmany];

            for (int i = 0; i < newPlayerCards.length; i++) {
                int randomCard = (int) (Math.random() * 52);
                newPlayerCards[i] = deck.getCards()[randomCard];  //sacar del mazo
            }
            player.setDeckPlayer(newPlayerCards);
        } else {
            Card[] newPlayerCards = new Card[(player.getDeckPlayer().length + howmany)];
            Card[] OlderCards = player.getDeckPlayer();
            for (int i = 0; i < newPlayerCards.length; i++) {
                if (i < OlderCards.length) {
                    newPlayerCards[i] = OlderCards[i];
                } else {
                    newPlayerCards[i] = deck.getCards()[(int) (Math.random() * 52)];  //sacar del mazo
                }

            }
            player.setDeckPlayer(newPlayerCards);
        }
    }

    public static void soutResult(int sumaJugador, Players player) {

        System.out.println("El turno de " + player.getUserName() + " ha terminado");
        if (sumaJugador > 21)
            System.out.println("Te has pasado de 21, su valor es: " + sumaJugador);
        else if (sumaJugador < 21) {
            System.out.println("Buena suerte su valor total es " + sumaJugador);
        }

    }


    public static int isBlackJack(Players player) {

        Card[] cards = player.getDeckPlayer();
        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].getValue() == 11 || cards[i].getValue() == 12 || cards[i].getValue() == 13) {
                count += 10;

            } else {
                count += cards[i].getValue();

            }

        }
        return count;
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


