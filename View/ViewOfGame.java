package View;

import Model.Deck;

import java.util.Scanner;

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

        System.out.println(red + hearth + " " + "----------------------------"+" "+hearth+" "+black+clover+d+" "+red+diamond+d+" "+black+lance+d+" "+red+"-----------------------------"+ " "+d+black+lance+d);
        System.out.println(blue + "|   ######      ###       #####     ######     ##   ##     #####      | "+d);
        System.out.println(green + "|  ##          ## ##     ##           ##       ###  ##    ##   ##     | "+d);
        System.out.println(purple + "|  ##         #######      ####       ##       #### ##    ##   ##     | "+d);
        System.out.println(green + "|  ##         ##   ##         ##      ##       ## ####    ##   ##     | "+d);
        System.out.println(blue + "|    ######   ##   ##    #####      ######     ##  ###     #####      | "+d);
        System.out.println(black + clover + d + red + " " + "----------------------------"+" "+hearth+" "+black+clover+d+" "+red+diamond+d+" "+black+lance+d+" "+red+"-----------------------------" + " "+diamond+d);
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
            Deck deck = new Deck();
            System.out.println(deck);

        } else {
            System.out.println("Gracias por su visita.");
        }
        return option;
    }


}
