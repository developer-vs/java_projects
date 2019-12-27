public class GuessNumber {
    public static void main(String[] args) {
        int guessNumber = 30;
        int myNumber = 18;
        
        if(myNumber > guessNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else if(myNumber < guessNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else if(myNumber == guessNumber) {
            System.out.println("Вы угадали!");
        }
    }
}
