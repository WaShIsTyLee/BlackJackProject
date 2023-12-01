package Test;

import Model.Deck;
import Model.Card;
import Controller.MainController;

import static Controller.MainController.menu;

public class Test {
    public static void main(String[] args) {

        Deck deck = new Deck();

        System.out.println(deck);

        menu();
    }
}
