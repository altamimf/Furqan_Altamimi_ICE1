/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package card;
 
import java.util.Random;
import java.util.Scanner;
 
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * Modifier: Your Name - StudentID
 * Date: 2025-09-17
 */
public class CardTrick {
    public static void main(String[] args) {
        Random rand = new Random();
 
        // create array of 7 random cards
        Card[] magicHand = new Card[7];
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); // values 1–13
            c.setSuit(Card.SUITS[rand.nextInt(4)]); // suits 0–3
            magicHand[i] = c;
 
            // show the cards (for testing / demo)
            System.out.println(c.getSuit() + " " + c.getValue());
        }
 
        // ask user for a card
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a card value (1–13): ");
            int userValue = input.nextInt();
 
            System.out.print("Enter a suit (0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
            int userSuitIndex = input.nextInt();
 
            Card userCard = new Card();
            userCard.setValue(userValue);
            userCard.setSuit(Card.SUITS[userSuitIndex]);
 
            // search for user card
            boolean found = false;
            for (Card c : magicHand) {
                if (c.getValue() == userCard.getValue() && c.getSuit().equals(userCard.getSuit())) {
                    found = true;
                    break;
                }
            }
 
            if (found) {
                System.out.println("Your card is in the magic hand!");
            } else {
                System.out.println("Sorry, your card is not in the magic hand.");
            }
 
            
        }
    }
}
