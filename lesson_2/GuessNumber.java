import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;
    private int guessNumber;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        guessNumber = (int) (Math.random() * 101);

        System.out.println("Компьютер загадал число: " + guessNumber);

        while(true) {
            if(makeMove(playerOne)) {
                break;
            }
            if(makeMove(playerTwo)) {
                break;
            }
        }
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        return compareNumbers(player);
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите ваше число: ");
        player.setNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if(player.getNumber() > guessNumber) {
            System.out.println(player.getName() + ", введенное вами число больше того, что загадал компьютер");
        } else if(player.getNumber() < guessNumber) {
            System.out.println(player.getName() + ", введенное вами число меньше того, что загадал компьютер");
        } else if(player.getNumber() == guessNumber) {
            System.out.println(player.getName() + ", вы угадали!");
            return true;
        }
        return false;
    }
}