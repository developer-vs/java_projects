import java.util.Scanner;

public class Player {

    private String name;
    private int number;
    private Scanner scan = new Scanner(System.in);

    Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber() {
        System.out.print(name + ", введите ваше число: ");
        number = scan.nextInt();
    }

    public int getNumber() {
        return number;
    }
}