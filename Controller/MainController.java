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


    public static int menu() {
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


        return players;


    }


    public static Card[] wantIA(Players player, int sumPlayer) {

        int resultado = 0;
        boolean valid = true;

        do {
            if (sumPlayer > resultado && sumPlayer < 21) {

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


    public static void cardAsked(Players player, int howMany) {

        if (howMany == 2) {
            Card[] newPlayerCards = new Card[howMany];

            for (int i = 0; i < newPlayerCards.length; i++) {
                do {
                    int randomCard = (int) (Math.random() * 52);
                    newPlayerCards[i] = deck.getCards()[randomCard];
                    deck.getCards()[randomCard] = null;
                    //    player.setSum()
                    //    soutResult(players1.getSum(isBlackJack(player)));

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
                        newPlayerCards[i] = deck.getCards()[(int) (Math.random() * 52)];  //sacar del mazo
                        deck.getCards()[randomCard] = null;
                    }
                } while (newPlayerCards[i] == null);


            }
            player.setDeckPlayer(newPlayerCards);
        }
    }


    public static int isBlackJack(Players player) {

        Card[] cards = player.getDeckPlayer();
        int count = 0;
        for (int i = 0; i < cards.length; i++) {

            //preguntar como hago para que este AS siga valiendo 1
            if (cards[i].getValue() == 1 && player.getSum() <= 11) {
                count += 11;

            } else if (cards[i].getValue() == 11 || cards[i].getValue() == 12 || cards[i].getValue() == 13) {
                count += 10;

            } else {
                count += cards[i].getValue();

            }

        }
        return count;
    }

    public static void winner(Players[] players) {
        String purple = "\033[35m";
        String d = "\u001B[0m"; //borrar

        String winner = "";
        int aux = 0;

        for (Players player : players) {
            if (player.getSum() > aux && player.getSum() <= 21) {
                aux = player.getSum();
                winner = player.getUserName();
            }
        }
        System.out.println(purple + "*-------------------------------------------------*" + d);
        System.out.println(purple + "|" + d + " Enhorabuena " + winner + " es el ganador");
        System.out.println(purple + "*-------------------------------------------------*" + d);

    }

    public static void soutPoints(Players players) {
        String purple = "\033[35m";
        String d = "\u001B[0m"; //borrar

        System.out.println(purple + "*-------------------------------------------------*" + d);
        System.out.println(purple + "|" + d + " Tu puntuacion ahora mismo es de: " + players.getSum() + purple + "             |" + d);
        System.out.println(purple + "*-------------------------------------------------*" + d);
    }


    public static Players winnerVsIa(Players[] players) {
        Players winnerVsIa = null; // Inicializar con null
        int aux = 0;

        for (Players player : players) {
            if (player.getSum() > aux && player.getSum() <= 21) {
                aux = player.getSum();
                winnerVsIa = player;
            }
        }

        return winnerVsIa;
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


