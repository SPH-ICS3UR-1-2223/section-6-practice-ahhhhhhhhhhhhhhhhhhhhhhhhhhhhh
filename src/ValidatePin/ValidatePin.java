package ValidatePin;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int pin =1234;
        System.out.println("Enter a PIN");
        int userPin=in.nextInt(); 
        int userGuesses=1;
        while (userPin !=pin) {
        	System.out.println("Invalid PIN. Try again."); 
        	userPin=in.nextInt();
        }
        System.out.println("Correct. Weclome KingSnake56");
    }
}
