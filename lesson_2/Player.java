public class Player {

    private String name;
    private int number;
    private boolean ifWinner;

    Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setIfWinner(boolean ifWinner) {
        this.ifWinner = ifWinner;
    }

    public boolean getIfWinner() {
        return ifWinner;
    }
}