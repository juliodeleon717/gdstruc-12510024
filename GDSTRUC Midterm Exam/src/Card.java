public class Card {
    private String Name;

    @Override
    public String toString() {
        return "Card{" +
                "Name=" + Name +
                '}';
    }

    public Card(String name) {
        Name = name;
    }
}
