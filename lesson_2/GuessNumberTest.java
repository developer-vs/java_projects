import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Введите имя первого игрока: ");
        String playerOneName = scan.next();

        System.out.print("Введите имя второго игрока: ");
        String playerTwoName = scan.next();

        Player p1 = new Player(playerOneName);
        Player p2 = new Player(playerTwoName);

        GuessNumber gn = new GuessNumber();
        gn.startGame(p1, p2);
    }
}