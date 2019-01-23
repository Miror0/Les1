
import java.util.Scanner;

public class GuessNumber {

    Scanner scan = new Scanner(System.in);
    private Player userPlayerOne;
    private Player userPlayerTwo;

    public GuessNumber(Player userPlayerOne, Player userPlayerTwo) {
        this.userPlayerOne = userPlayerOne;
        this.userPlayerTwo = userPlayerTwo;
    }

    public void startGame() {

        int randomNumber = (int) (Math.random() * 100 + 1);
        
        do {

            System.out.println(userPlayerOne.getUserName + ", please, try to guess the number: ");
            userPlayerOne.setUserNumber(scan.nextInt());

            if (userPlayerOne.getUserNumber == randomNumber) {
                System.out.println("Well done!!");
                System.out.println(userPlayerOne.getUserName + "wins!!");
            } else if (userPlayerOne.getUserNumber > randomNumber) {
                System.out.println("The number is smaller.");
            } else {
                System.out.println("The number is larger.");
            }

            System.out.println(userPlayerTwo + " tries to guess the number: ");
            userPlayerTwo.setUserNumber(scan.nextInt());

            if (userPlayerTwo.getUserNumber == randomNumber) {
                System.out.println("Well done!!");
                System.out.println(userPlayerTwo.getUserName + "wins!!");
            } else if (userPlayerTwo.getUserNumber > randomNumber) {
                System.out.println("The number is smaller.");
            } else {
                System.out.println("The number is larger.");
            }
        } while (userPlayerOne.getNumber() != randomNumber && userPlayerTwo.getNumber() != randomNumber);   
    }
}
