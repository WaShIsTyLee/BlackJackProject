package View;

import Model.Deck;
import  Controller.MainController;
import java.util.Scanner;

import static Controller.MainController.*;

public class ViewOfGame {


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

    public static String printWelcome() {

        String welcome = " ";
        System.out.println("Bienvenido al Casino");
        System.out.print("¿Una partida de Blackjack señores y señoras?");
        return welcome;
    }

    public static String optionWelcome() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(printWelcome());
        String option = scanner.nextLine().toLowerCase();

        if (option.equals("si")) {
            menu(playersOfGame());

        } else {
            System.out.println("Gracias por su visita.");

        }
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
                if (playersOfGame>=0 && playersOfGame <4){
                    valid=false;
                }
            }catch (Exception e) {
                System.out.println("Error ingrese un numero entre 1 y 4");
            }

        }while (valid);

        return playersOfGame;
    }

    public static String namePlayer (){
        String username="";
        System.out.println("Introduce tu nombre de usuario: ");
        username=keyboardString();

        return username;
    }
public static String iaName() {
    String iaName = "IA";
    return iaName;
}
    }
