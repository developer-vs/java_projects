import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {

    private int guessNumber;
    private String answer = "";

    public void startGame(Player p1, Player p2) {
        Scanner scan = new Scanner(System.in);

        do {
            guessNumber = (int) (Math.random() * 101);
            System.out.println("Компьютер загадал число: " + guessNumber);

            while(true) {
                p1.setNumber();
                if(p1.getNumber() > guessNumber) {
                    System.out.println(p1.getName() + ", введенное вами число больше того, что загадал компьютер");
                } else if(p1.getNumber() < guessNumber) {
                    System.out.println(p1.getName() + ", введенное вами число меньше того, что загадал компьютер");
                } else if(p1.getNumber() == guessNumber) {
                    System.out.println(p1.getName() + ", вы угадали!");
                    break;
                }
                p2.setNumber();
                if(p2.getNumber() > guessNumber) {
                    System.out.println(p2.getName() + ", введенное вами число больше того, что загадал компьютер");
                } else if(p2.getNumber() < guessNumber) {
                    System.out.println(p2.getName() + ", введенное вами число меньше того, что загадал компьютер");
                } else if(p2.getNumber() == guessNumber) {
                    System.out.println(p2.getName() + ", вы угадали!");
                    break;
                }
            }

            System.out.print("Хотите продолжить? [да/нет]: ");
            answer = scan.next();

        } while(answer.equals("да"));
    }
}