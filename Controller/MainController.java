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
                soutResult(players1.getSum(), players1);

                ia.setUserName(iaName());
                System.out.println("Turno de: " + iaName());
                cardAsked(ia, 2);
                wantIA(ia, players1.getSum());
                ia.setSum(isBlackJack(ia));
                soutResult(ia.getSum(), ia);

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
                soutResult(players1.getSum(), players1);

                players2.setUserName(namePlayer());
                System.out.println("Turno de : " + players2.getUserName());
                cardAsked(players2, 2);
                players2.setSum(isBlackJack(players2));
                soutPoints(players2);
                System.out.println(players2);
                wantCard(players2);
                players2.setSum(isBlackJack(players2));
                soutResult(players2.getSum(), players2);

                ia.setUserName(iaName());
                System.out.println("Turno de: " + iaName());
                cardAsked(ia, 2);
                wantIA(ia, players1.getSum());
                ia.setSum(isBlackJack(ia));
                soutResult(ia.getSum(), ia);

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
                soutResult(players1.getSum(), players1);

                players2.setUserName(namePlayer());
                System.out.println("Turno de : " + players2.getUserName());
                cardAsked(players2, 2);
                players2.setSum(isBlackJack(players2));
                soutPoints(players2);
                System.out.println(players2);
                wantCard(players2);
                players2.setSum(isBlackJack(players2));
                soutResult(players2.getSum(), players2);

                players3.setUserName(namePlayer());
                System.out.println("Turno de : " + players3.getUserName());
                cardAsked(players3, 2);
                players3.setSum(isBlackJack(players3));
                soutPoints(players3);
                System.out.println(players3);
                wantCard(players3);
                players3.setSum(isBlackJack(players3));
                soutResult(players3.getSum(), players3);


                ia.setUserName(iaName());
                System.out.println("Turno de: " + iaName());
                cardAsked(ia, 2);
                wantIA(ia, players1.getSum());
                ia.setSum(isBlackJack(ia));
                soutResult(ia.getSum(), ia);

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
                soutResult(players1.getSum(), players1);

                players2.setUserName(namePlayer());
                System.out.println("Turno de : " + players2.getUserName());
                cardAsked(players2, 2);
                players2.setSum(isBlackJack(players2));
                soutPoints(players2);
                System.out.println(players2);
                wantCard(players2);
                players2.setSum(isBlackJack(players2));
                soutResult(players2.getSum(), players2);

                players3.setUserName(namePlayer());
                System.out.println("Turno de : " + players3.getUserName());
                cardAsked(players3, 2);
                players3.setSum(isBlackJack(players3));
                soutPoints(players3);
                System.out.println(players3);
                wantCard(players3);
                players3.setSum(isBlackJack(players3));
                soutResult(players3.getSum(), players3);

                players4.setUserName(namePlayer());
                System.out.println("Turno de : " + players4.getUserName());
                cardAsked(players4, 2);
                players4.setSum(isBlackJack(players4));
                soutPoints(players4);
                System.out.println(players4);
                wantCard(players4);
                players4.setSum(isBlackJack(players4));
                soutResult(players4.getSum(), players4);

                ia.setUserName(iaName());
                System.out.println("Turno de: " + iaName());
                cardAsked(ia, 2);
                wantIA(ia, players1.getSum());
                ia.setSum(isBlackJack(ia));
                soutResult(ia.getSum(), ia);

                Players winnerGame4[] = {players1, players2, players3, players4, ia};
                winner(winnerGame4);

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
                // player.setSum();
                System.out.println("Tu puntuacion actual es de: " + player.getSum());
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
                int randomCard = (int) (Math.random() * 52);
                newPlayerCards[i] = deck.getCards()[randomCard];  //sacar del mazo
            }
            player.setDeckPlayer(newPlayerCards);
        } else {
            Card[] newPlayerCards = new Card[(player.getDeckPlayer().length + howMany)];
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


    public static int isBlackJack(Players player) {

        Card[] cards = player.getDeckPlayer();
        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].getValue() == 1 && player.getSum()<=10){
                count+=11;

            } else if (cards[i].getValue() == 11 || cards[i].getValue() == 12 || cards[i].getValue() == 13) {
                count += 10;

            } else {
                count += cards[i].getValue();

            }

        }
        return count;
    }

    public static String winner(Players[] players) {
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
        System.out.println(purple+"*-------------------------------------------------*"+d);
        System.out.println(purple + "|" + d + " Enhorabuena " + winner + " es el ganador");
        System.out.println(purple+"*-------------------------------------------------*"+d);
        return winner;
    }

    public static void soutPoints(Players players){
        String purple = "\033[35m";
        String d = "\u001B[0m"; //borrar

        System.out.println(purple+"*-------------------------------------------------*"+d);
        System.out.println("| Tu puntuacion ahora mismo es de: "+ players.getSum()+"|");
        System.out.println(purple+"*-------------------------------------------------*"+d);
    }




    public static int totalBet(Players [] players){
        int totalBet=0;



        return totalBet;
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


