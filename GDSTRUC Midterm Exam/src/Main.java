import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(); //random number
        ArrayStack deck = new ArrayStack(30);
        ArrayStack discard = new ArrayStack(30);

        ArrayList<Card> hand = new ArrayList<>();
        String[] names = {"Wizard", "Paladin", "Barbarian", "Sorcerer", "Fighter"};
        for (int i = 0; i < 30; i++) {
            deck.push(new Card(names[rand.nextInt(names.length)]));
        }

        while (!deck.isEmpty()) {
            int randCommand = rand.nextInt(3);   // random computer command
            int randCards = rand.nextInt(5) + 1;     // how many cards to add

            if (randCommand == 0) {
                System.out.println("Draw " + randCards + " cards");
                for (int i = 0; i < randCards && !deck.isEmpty(); i++) {
                    hand.add(deck.pop());
                }
            } else if (randCommand == 1) {
                System.out.println("Discard " + randCards + " cards");
                for (int i = 0; i < randCards && !hand.isEmpty(); i++) {
                    discard.push(hand.remove(hand.size() - 1));
                }
            } else {
                System.out.println("Get " + randCards + " cards from discard pile");
                for (int i = 0; i < randCards && !discard.isEmpty(); i++) {
                    hand.add(discard.pop());
                }
            }

            System.out.println("Hand: " + hand);
            System.out.println("Cards left in deck: " + deck.size());
            System.out.println("Cards in discard pile: " + discard.size());
            System.out.println();
        }
        System.out.println("Deck is empty. Game over.");
    }


}
