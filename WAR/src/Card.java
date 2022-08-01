public class Card {
    private int value;
    private String name;

    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println("your card is: " + name + " and the value is: " + value);
    }
}
