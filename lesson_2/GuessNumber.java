import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {

    private Player p1;
    private Player p2;
    private Scanner scan;
    private int guessNumber;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    private void checkNumber(Player p, Scanner s) {
        System.out.print(p.getName() + ", введите ваше число: ");
        p.setNumber(s.nextInt());

        if(p.getNumber() > guessNumber) {
            System.out.println(p.getName() + ", введенное вами число больше того, что загадал компьютер");
            p.setIfWinner(false);
        } else if(p.getNumber() < guessNumber) {
            System.out.println(p.getName() + ", введенное вами число меньше того, что загадал компьютер");
            p.setIfWinner(false);
        } else if(p.getNumber() == guessNumber) {
            System.out.println(p.getName() + ", вы угадали!");
            p.setIfWinner(true);
        }
        
    }

    public void startGame() {
        scan = new Scanner(System.in);
        guessNumber = (int) (Math.random() * 101);
        
        System.out.println("Компьютер загадал число: " + guessNumber);

        while(true) {
            checkNumber(p1, scan);
            if(p1.getIfWinner()) {
                break;
            }
            checkNumber(p2, scan);
            if(p2.getIfWinner()) {
                break;
            }
        }
    }
}