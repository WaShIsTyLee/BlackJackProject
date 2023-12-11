package Model;

import java.util.Objects;

public class Card {


    private int value; // Value of Card //Valor de la cara
    private String suit; // Suit of Card //Palo de la Carta
    private String color; // Color of Card //Color de la Carta

    public Card(int value, String suit, String color) {
        this.value = value;
        this.suit = suit;
        this.color = color;
    }



    public int getValue() {
        return value;
    }

    public void setValue(int value) {

        }


        public String getSuit () {
            return suit;
        }

        public void setSuit (String suit){

            this.suit = suit;
        }

        public String getColor () {
            return color;
        }

        public void setColor (String color){
            this.color = color;
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (!(o instanceof Card card)) return false;
            return getValue() == card.getValue() && Objects.equals(getSuit(), card.getSuit()) && Objects.equals(getColor(), card.getColor());
        }


        @Override
        public String toString () {

            StringBuilder ts = check(value);
            return ts.toString();
        }

        public StringBuilder check (int value) {

            String d = "\u001B[0m";

            StringBuilder sb = new StringBuilder();

                switch (value) {
                    case 1:
                        System.out.println(color + "┌─────────┐");
                        System.out.println("| " + suit + "       |");
                        System.out.println("|         |");
                        System.out.println("|   " + "AS" + "    |");
                        System.out.println("|         |");
                        System.out.println("|     " + suit + "   |");
                        System.out.println("└─────────┘" + d);
                        ;
                        break;
                    case 10:
                        System.out.println(color + "┌─────────┐");
                        System.out.println("| " + suit + "       |");
                        System.out.println("|         |");
                        System.out.println("|   " + "10" + "    |");
                        System.out.println("|         |");
                        System.out.println("|     " + suit + "   |");
                        System.out.println("└─────────┘" + d);
                        ;

                        break;


                    case 11:
                        System.out.println(color + "┌─────────┐");
                        System.out.println("| " + suit + "       |");
                        System.out.println("|         |");
                        System.out.println("|   " + "J" + "     |");
                        System.out.println("|         |");
                        System.out.println("|     " + suit + "   |");
                        System.out.println("└─────────┘" + d);
                        break;

                    case 12:
                        System.out.println(color + "┌─────────┐");
                        System.out.println("| " + suit + "       |");
                        System.out.println("|         |");
                        System.out.println("|   " + "Q" + "     |");
                        System.out.println("|         |");
                        System.out.println("|     " + suit + "   |");
                        System.out.println("└─────────┘" + d);

                        break;
                    case 13:
                        System.out.println(color + "┌─────────┐");
                        System.out.println("| " + suit + "       |");
                        System.out.println("|         |");
                        System.out.println("|   " + "K" + "     |");
                        System.out.println("|         |");
                        System.out.println("|     " + suit + "   |");
                        System.out.println("└─────────┘" + d);
                        ;
                        break;
                    default:
                        System.out.println(color + "┌─────────┐");
                        System.out.println("| " + suit + "       |");
                        System.out.println("|         |");
                        System.out.println("|   " + value + "     |");
                        System.out.println("|         |");
                        System.out.println("|     " + suit + "   |");
                        System.out.println("└─────────┘" + d);
                        ;

                }
                return sb;

            }
        }
