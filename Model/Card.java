package Model;

import java.util.Objects;

public class Card {


    private int value;
    private String suit; //Palo de la Carta
    private String color; //Color de la Carta
    String blanco = "\033[47m";
    private StringBuilder ts;

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


        //TOCAR ESTO PARA CREAR UNA CARTA

        @Override
        public String toString () {

            StringBuilder ts = comprobar(value);
            return ts.toString();
        }

        public StringBuilder comprobar ( int value){

            String d = "\u001B[0m";

            StringBuilder sb = new StringBuilder();

            switch (value) {
                case 1:
                    sb.append(color).append("-----------------\n");
                    sb.append("|   Tu carta    |\n");
                    sb.append("|               |\n");
                    sb.append("|" + "    " + "AS" + "         " + ("|\n"));
                    sb.append("|               |\n");
                    sb.append("|   " + suit + "          " + (" |\n"));
                    sb.append("|               |\n");
                    sb.append("|               |\n");
                    sb.append("-----------------\n" + d);
                    break;

                case 11:
                    sb.append(color).append("-----------------\n");
                    sb.append("|   Tu carta    |\n");
                    sb.append("|               |\n");
                    sb.append("|" + "    " + "J" + "         " + ("|\n"));
                    sb.append("|               |\n");
                    sb.append("|   " + suit + "          " + (" |\n"));
                    sb.append("|               |\n");
                    sb.append("|               |\n");
                    sb.append("-----------------\n" + d);
                    break;
                case 12:
                    sb.append(color).append("-----------------\n");
                    sb.append("|   Tu carta    |\n");
                    sb.append("|               |\n");
                    sb.append("|" + "    " + "Q" + "         " + ("|\n"));
                    sb.append("|               |\n");
                    sb.append("|   " + suit + "          " + (" |\n"));
                    sb.append("|               |\n");
                    sb.append("|               |\n");
                    sb.append("-----------------\n" + d);
                    break;
                case 13:
                    sb.append(color).append("-----------------\n");
                    sb.append("|   Tu carta    |\n");
                    sb.append("|               |\n");
                    sb.append("|" + "    " + "K" + "         " + ("|\n"));
                    sb.append("|               |\n");
                    sb.append("|   " + suit + "          " + (" |\n"));
                    sb.append("|               |\n");
                    sb.append("|               |\n");
                    sb.append("-----------------\n" + d);
                    break;
                default:
                    sb.append(color).append("-----------------\n");
                    sb.append("|   Tu carta    |\n");
                    sb.append("|               |\n");
                    sb.append("|" + "    " + value + "         " + ("|\n"));
                    sb.append("|               |\n");
                    sb.append("|   " + suit + "          " + (" |\n"));
                    sb.append("|               |\n");
                    sb.append("|               |\n");
                    sb.append("-----------------\n" + d);

            }
            return sb;

        }
    }