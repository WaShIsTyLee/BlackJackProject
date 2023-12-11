package View;

import Model.Players;

import java.util.Scanner;

import static Controller.MainController.*;


public class ViewOfGame {
    private static String usedName = "";


    /**
     * Print CASINO and Welcome with some colors // Imprimir casino y Bienvenida con Colores
     */

    public static void printCasino() {

        String d = "\u001B[0m"; // Stop print the color // Parar el color establecido
        String black = "\033[30m"; // Negro
        String red = "\033[31m"; // Rojo
        String green = "\033[32m"; // Verde
        String blue = "\033[34m"; // Blue
        String purple = "\033[35m"; // Morado


        String hearth = "\u2764"; // Corazones
        String lance = "\u2660"; // Picas
        String clover = "\u2663"; // Treboles
        String diamond = "\u2666"; //Diamantes


        System.out.println(red + hearth + " " + "----------------------------" + " " + hearth + " " + black + clover + d + " " + red + diamond + d + " " + black + lance + d + " " + red + "-----------------------------" + " " + d + black + lance + d);
        System.out.println(blue + "|   ######      ###       #####     ######     ##   ##     #####      | " + d);
        System.out.println(green + "|  ##          ## ##     ##           ##       ###  ##    ##   ##     | " + d);
        System.out.println(purple + "|  ##         #######      ####       ##       #### ##    ##   ##     | " + d);
        System.out.println(green + "|  ##         ##   ##         ##      ##       ## ####    ##   ##     | " + d);
        System.out.println(blue + "|    ######   ##   ##    #####      ######     ##  ###     #####      | " + d);
        System.out.println(black + clover + d + red + " " + "----------------------------" + " " + hearth + " " + black + clover + d + " " + red + diamond + d + " " + black + lance + d + " " + red + "-----------------------------" + " " + diamond + d);


        System.out.println();
        System.out.println("🎲 " + "Bienvenido al Casino" + " 🎲");
        System.out.println(purple + "*-------------------------------------------------------------------------*" + d);
        System.out.println(purple + "|" + d + " \uD83D\uDCDC" + " Le explicare las reglas de nuestro juego: " + purple + "                           |");
        System.out.println(purple + "|" + d + " 1\uFE0F⃣" + " Gana el jugador que mas cerca quede a 21" + purple + "                             |");
        System.out.println(purple + "|" + d + " 2\uFE0F⃣" + " Todas las cartas suman por su valor, salvo J, Q y K que suman 10 " + purple + "    |");
        System.out.println(purple + "|" + d + " 3\uFE0F⃣" + " Si te toca un AS y tienes menos de 10 puntos, este pasara a sumar 11" + purple + " |");
        System.out.println(purple + "*-------------------------------------------------------------------------*" + d);
        System.out.println("Asi pues con mucho gusto les pregunto: ");

    }

    /**
     * Players have to say yes or no for play // Jugador debe decir si o no para jugar
     * @return
     */

    public static void optionWelcome() {
        boolean valid;
        System.out.println("¿Una partida de Blackjack señores y señoras?" + " 🃏");
        String option = "";

        do {
            option = keyboardString().toLowerCase();

            if (option.equals("si")) {
                menu();
                valid = true;
            } else if (option.equals("no")) {
                System.out.println("Gracias por su visita.");
                valid = true;
            } else {
                System.out.println("Por favor introduzca si o no");
                valid = false;
            }

        } while (!valid);

    }

    /**
     * Determinates player of Game // Determina el numero de jugadores
     * @return
     */

    public static int playersOfGame() {
        int playersOfGame = 0;
        boolean valid = true;

        do {
            try {
                System.out.println("Partida de entre 1 y 4 jugadores");
                System.out.println("Cuantos jugadores sois: ");
                playersOfGame = keyboardInt();
                if (playersOfGame >= 0 && playersOfGame <= 4) {
                    valid = false;
                }
            } catch (Exception e) {
                System.out.println("Error ingrese un numero entre 1 y 4");
            }

        } while (valid);

        return playersOfGame;
    }

    /**
     * Determinates de name of Players // Determinar el nombre de los jugadores
     * @return name of Player // Nombre del jugador
     */

    public static String namePlayer() {

        String name = "";

        do {
            System.out.println("Introduce tu nombre de usuario: ");
            name = keyboardString();

            if (usedName.contains(name)) {
                System.out.println("Este nombre ya está en uso. Por favor, elige otro.");
            }

        } while (usedName.contains(name));

        usedName += name + " ";
        return name;
    }

    /**
     * Sout the total value when player doesn't want more cards // Muestra los el valor total de las cartas cuando no se piden mas
     * @param player // jugador
     */
    public static void soutResult(Players player) {
        String purple = "\033[35m";
        String d = "\u001B[0m"; //borrar

        System.out.println(purple + "*-------------------------------------------------*" + d);
        System.out.println(purple + "|" + d + " El turno de " + player.getUserName() + " ha terminado");

        if (player.getSum() > 21)
            System.out.println(purple + "|" + d + " Te has pasado de 21, su valor es: " + player.getSum());
        else if (player.getSum() < 21)
            System.out.println(purple + "|" + d + " Su valor total es " + player.getSum());

        System.out.println(purple + "*-------------------------------------------------*" + d);

    }

    /**
     * Check and show winner of game with his username // Comprueba y muestra el ganador con su nombre
     * @param players // Jugadores
     */
    public static void winner(Players[] players) {
        String purple = "\033[35m";
        String d = "\u001B[0m";

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

    /**
     * Set IA name // Establecer nombre de la ia
     * @return
     */
    public static String iaName() {
        String iaName = "IA";
        return iaName;
    }

    /**
     *  Read Strings of keyboard // Leer frases en teclado
     */
    public static String keyboardString() {

        Scanner teclado = new Scanner(System.in);

        String keyboard = teclado.nextLine();

        return keyboard;
    }
    /**
     *  Read Int of keyboard // Leer Numeros en teclado
     */

    public static int keyboardInt() {
        Scanner teclado = new Scanner(System.in);
        int keyboard = teclado.nextInt();

        return keyboard;

    }
}

