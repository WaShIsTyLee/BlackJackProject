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


    public static void startApp() {
        printCasino();
        optionWelcome();
    }

    /**
     * Menu of game with a switch with players in game // Menu con switch en funcion de los jugadores
     */
    public static void menu() {
        players = playersOfGame();


        switch (players) {
            case 1:

                players1 = new Players();
                ia = new Players();

                players1.setUserName(namePlayer());
                System.out.println("Turno de : " + players1.getUserName());
                cardAsked(players1, 2);
                System.out.println(players1);
                players1.setSum(isBlackJack(players1));
                soutPoints(players1);
                wantCard(players1);
                players1.setSum(isBlackJack(players1));
                soutPoints(players1);
                soutResult(players1);

                ia.setUserName(iaName());
                System.out.println("Turno de: " + iaName());
                cardAsked(ia, 2);
                wantIA(ia, players1.getSum());
                ia.setSum(isBlackJack(ia));
                soutResult(ia);

                Players winnerGame1[] = {players1, ia};
                winner(winnerGame1);
                break;


            case 2:
                players1 = new Players();
                players2 = new Players();
                ia = new Players();

                players1.setUserName(namePlayer());
                System.out.println("Turno de : " + players1.getUserName());
                cardAsked(players1, 2);
                System.out.println(players1);
                players1.setSum(isBlackJack(players1));
                soutPoints(players1);
                wantCard(players1);
                players1.setSum(isBlackJack(players1));
                soutResult(players1);


                players2.setUserName(namePlayer());
                System.out.println("Turno de : " + players2.getUserName());
                cardAsked(players2, 2);
                System.out.println(players2);
                players2.setSum(isBlackJack(players2));
                soutPoints(players2);
                wantCard(players2);
                players2.setSum(isBlackJack(players2));
                soutResult(players2);


                ia.setUserName(iaName());
                System.out.println("Turno de: " + iaName());
                cardAsked(ia, 2);
                Players[] maxSum2 = {players1, players2};
                Players maxSums2 = winnerVsIa(maxSum2);
                wantIA(ia, maxSums2.getSum());
                ia.setSum(isBlackJack(ia));
                soutResult(ia);

                Players winnerGame2[] = {players1, players2, ia};
                winner(winnerGame2);

                break;
            case 3:
                players1 = new Players();
                players2 = new Players();
                players3 = new Players();
                ia = new Players();

                players1.setUserName(namePlayer());
                System.out.println("Turno de : " + players1.getUserName());
                cardAsked(players1, 2);
                System.out.println(players1);
                players1.setSum(isBlackJack(players1));
                soutPoints(players1);
                wantCard(players1);
                players1.setSum(isBlackJack(players1));
                soutResult(players1);

                players2.setUserName(namePlayer());
                System.out.println("Turno de : " + players2.getUserName());
                cardAsked(players2, 2);
                System.out.println(players2);
                players2.setSum(isBlackJack(players2));
                soutPoints(players2);
                wantCard(players2);
                players2.setSum(isBlackJack(players2));
                soutResult(players2);

                players3.setUserName(namePlayer());
                System.out.println("Turno de : " + players3.getUserName());
                cardAsked(players3, 2);
                System.out.println(players3);
                players3.setSum(isBlackJack(players3));
                soutPoints(players3);
                wantCard(players3);
                players3.setSum(isBlackJack(players3));
                soutResult(players3);


                ia.setUserName(iaName());
                System.out.println("Turno de: " + iaName());
                cardAsked(ia, 2);
                Players[] maxSum3 = {players1, players2, players3};
                Players maxSums3 = winnerVsIa(maxSum3);
                wantIA(ia, maxSums3.getSum());
                ia.setSum(isBlackJack(ia));
                soutResult(ia);

                Players winnerGame3[] = {players1, players2, players3, ia};
                winner(winnerGame3);


                break;
            case 4:
                players1 = new Players();
                players2 = new Players();
                players3 = new Players();
                players4 = new Players();


                ia = new Players();

                players1.setUserName(namePlayer());
                System.out.println("Turno de : " + players1.getUserName());
                cardAsked(players1, 2);
                System.out.println(players1);
                players1.setSum(isBlackJack(players1));
                soutPoints(players1);
                wantCard(players1);
                players1.setSum(isBlackJack(players1));
                soutResult(players1);

                players2.setUserName(namePlayer());
                System.out.println("Turno de : " + players2.getUserName());
                cardAsked(players2, 2);
                System.out.println(players2);
                players2.setSum(isBlackJack(players2));
                soutPoints(players2);
                wantCard(players2);
                players2.setSum(isBlackJack(players2));
                soutResult(players2);

                players3.setUserName(namePlayer());
                System.out.println("Turno de : " + players3.getUserName());
                cardAsked(players3, 2);
                System.out.println(players3);
                players3.setSum(isBlackJack(players3));
                soutPoints(players3);
                wantCard(players3);
                players3.setSum(isBlackJack(players3));
                soutResult(players3);

                players4.setUserName(namePlayer());
                System.out.println("Turno de : " + players4.getUserName());
                cardAsked(players4, 2);
                System.out.println(players4);
                players4.setSum(isBlackJack(players4));
                soutPoints(players4);
                wantCard(players4);
                players4.setSum(isBlackJack(players4));
                soutResult(players4);

                ia.setUserName(iaName());
                System.out.println("Turno de: " + iaName());
                cardAsked(ia, 2);
                Players[] maxSums4 = {players1, players2, players3, players4};
                Players maxSum4 = winnerVsIa(maxSums4);
                wantIA(ia, maxSum4.getSum());
                ia.setSum(isBlackJack(ia));
                soutResult(ia);

                Players winnerGame4[] = {players1, players2, players3, players4, ia};
                winner(winnerGame4);

                break;

        }


    }

    /**
     * Regulates the cards requested by the IA based on the maximum value of the players
     * Regula las cartas pedidas por la IA en función del valor máximo alcanzado por los jugadores
     * @param player  IA
     * @param maxSumPlayer Max Sum of 4 players // Valor máximo de puntos de entre los jugadores
     * @return
     */


    public static Card[] wantIA(Players player, int maxSumPlayer) {

        int resultado = 0;
        boolean valid = true;

        do {
            if (maxSumPlayer > resultado && maxSumPlayer <= 21) {

                cardAsked(player, 1);
                resultado = isBlackJack(player);
            } else {
                System.out.print(player.toString());
                valid = false;
            }
        } while (valid);
        return player.getDeckPlayer();
    }

    /**
     * Ask if he wants cards and gives him one // Preguntar si quiere carta y da una en caso de Si
     * @param player player // jugador
     * @return player deck // mazo de jugador
     */
    public static Card[] wantCard(Players player) {

        String option;
        boolean valid = true;


        do {
            System.out.println("¿Quiere otra carta?");
            option = keyboardString();

            if (option.toLowerCase().equals("si")) {

                cardAsked(player, 1);
                System.out.println(player.toString());
                player.setSum(isBlackJack(player));
                soutPoints(player);

            } else if (option.toLowerCase().equals("no") ) {
                System.out.print(player.toString());
                valid = false;
            }else{
                System.out.println("Introduzca si o no");
        }
        } while (valid);
        return player.getDeckPlayer();
    }

    /**
     * Create cards depending on how many are requested // Crear cartas en funcion de cuantas se pidan
     * This one is used on wantCard for give Cards to player // Re utilizada en wantCard para dar la carta al jugador
     *
     * @param player  // jugador
     * @param howMany // cuantas
     */

    public static void cardAsked(Players player, int howMany) {

        if (howMany == 2) {
            Card[] newPlayerCards = new Card[howMany];

            for (int i = 0; i < newPlayerCards.length; i++) {
                do {
                    int randomCard = (int) (Math.random() * 52);
                    newPlayerCards[i] = deck.getCards()[randomCard];
                    deck.getCards()[randomCard] = null;

                } while (newPlayerCards[i] == null);

            }
            player.setDeckPlayer(newPlayerCards);
        } else {
            Card[] newPlayerCards = new Card[(player.getDeckPlayer().length + howMany)];
            Card[] OlderCards = player.getDeckPlayer();
            for (int i = 0; i < newPlayerCards.length; i++) {
                do {
                    if (i < OlderCards.length) {
                        newPlayerCards[i] = OlderCards[i];

                    } else {
                        int randomCard = (int) (Math.random() * 52);
                        newPlayerCards[i] = deck.getCards()[(int) (Math.random() * 52)];
                        deck.getCards()[randomCard] = null;

                    }
                } while (newPlayerCards[i] == null);


            }
            player.setDeckPlayer(newPlayerCards);
        }
    }

    /**
     * Regulates value of Cards for 1,11,12,13 // Regula el valor de las cartas 1,11,12,13 : AS, J, K, Q,
     *
     * @param player // jugador
     * @return // count
     */

    public static int isBlackJack(Players player) {

        Card[] cards = player.getDeckPlayer();
        int count = 0;
        for (int i = 0; i < cards.length; i++) {

            if (cards[i].getValue() == 1 && count < 11) {
                count += 11;

            } else if (cards[i].getValue() == 11 || cards[i].getValue() == 12 || cards[i].getValue() == 13) {
                count += 10;

            } else {
                count += cards[i].getValue();

            }

        }
        return count;
    }




    /**
     * Determined the player against whom IA will play // Determina contra quien jugara la IA
     * @param players // Jugadores
     * @return player vs IA // Jugador para la IA
     */
    public static Players winnerVsIa(Players[] players) {
        Players winnerVsIa = null;
        int aux = 0;

        for (Players player : players) {
            if (player.getSum() > aux && player.getSum() <= 21) {
                aux = player.getSum();
                winnerVsIa = player;
            }
        }

        return winnerVsIa;
    }
}





