package Model;

import java.util.Objects;

public class Players {

    private String userName; //Name of the Player //Nombre del Jugador
    private double moneyToBet; // MoneyToBet of Player // Dinero que dispone el Jugador para apostar



    /**
     * Parameterized constructor Players // Constructor parametrizado Jugador
     * @param userName   of player // Nombre del Jugador
     * @param moneyToBet of player // Dinero que dispone el Jugador para apostar
     */
    public Players(String userName, double moneyToBet) {

        this.userName = userName;
        this.moneyToBet = moneyToBet;
        if (moneyToBet == 0.25) { //PREGUNTAR SI PUEDO PONER UN EASTER EGG Y METERLE UN SOUT DE ENHORABUENA
            moneyToBet = 50;

        }
    }

    /**
     * Default Constructor // Constructor por defecto
     */
    public Players() {

        this("User", 0);

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        userName = userName;
    }

    public double getMoneyToBet() {
        return moneyToBet;
    }

    public void setMoneyToBet(double moneyToBet) {
        moneyToBet = moneyToBet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Players players)) return false;
        return Double.compare(getMoneyToBet(), players.getMoneyToBet()) == 0 && Objects.equals(getUserName(), players.getUserName());
    }

    @Override
    public String toString() {
        return "Players{" + "UserName='" + userName + '\'' + ", MoneyToBet=" + moneyToBet + '}';
    }



    /**
     * Ask for a Card // Jugador pide una carta
     * @return Card // Devuelve la carta
     */
    public Card askForCard(){

        return null;
    }

}
