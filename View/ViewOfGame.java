package View;

import Model.Players;

import java.util.Scanner;

import static Controller.MainController.*;


public class ViewOfGame {
    private static String usedName = "";


    public static void printCasino() {

        String d = "\u001B[0m"; //borrar
        String black = "\033[30m";
        String red = "\033[31m";
        String green = "\033[32m";
        String blue = "\033[34m";
        String purple = "\033[35m";


        String hearth = "\u2764";
        String lance = "\u2660";
        String clover = "\u2663";
        String diamond = "\u2666";


        System.out.println(red + hearth + " " + "----------------------------" + " " + hearth + " " + black + clover + d + " " + red + diamond + d + " " + black + lance + d + " " + red + "-----------------------------" + " " + d + black + lance + d);
        System.out.println(blue + "|   ######      ###       #####     ######     ##   ##     #####      | " + d);
        System.out.println(green + "|  ##          ## ##     ##           ##       ###  ##    ##   ##     | " + d);
        System.out.println(purple + "|  ##         #######      ####       ##       #### ##    ##   ##     | " + d);
        System.out.println(green + "|  ##         ##   ##         ##      ##       ## ####    ##   ##     | " + d);
        System.out.println(blue + "|    ######   ##   ##    #####      ######     ##  ###     #####      | " + d);
        System.out.println(black + clover + d + red + " " + "----------------------------" + " " + hearth + " " + black + clover + d + " " + red + diamond + d + " " + black + lance + d + " " + red + "-----------------------------" + " " + diamond + d);
    }

    public static void printWelcome() {
        String purple = "\033[35m";
        String d = "\u001B[0m"; //borrar


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
//Preguntar a carlos
    public static String optionWelcome() {
        Scanner scanner = new Scanner(System.in);
        boolean valid;
        printWelcome();
        System.out.print("¿Una partida de Blackjack señores y señoras?" + " 🃏");
        String option = "";

        do {
            option = scanner.nextLine().toLowerCase();

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

        return option;
    }


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


    public static String iaName() {
        String iaName = "IA";
        return iaName;
    }
}
