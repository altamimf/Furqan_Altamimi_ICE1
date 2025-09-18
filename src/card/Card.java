/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package card;
 
  // make sure this matches the package of CardTrick.java
 
public class Card {
    private int value;      // 1–13
    private String suit;    // Hearts, Diamonds, Clubs, Spades
 
    // Suits array (accessible from CardTrick)
    public static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
 
    // Default constructor
    public Card() {
    }
 
    // Constructor with parameters
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }
 
    // Getter and Setter for value
    public int getValue() {
        return value;
    }
 
    public void setValue(int value) {
        this.value = value;
    }
 
    // Getter and Setter for suit
    public String getSuit() {
        return suit;
    }
 
    public void setSuit(String suit) {
        this.suit = suit;
    }
}