import java.util.Scanner;

public class FortuneBank {
    public String pin = "1234";
    public double balance = 100000.00;

    public static void main(String[] args) {
        FortuneBank bankObject = new FortuneBank();
        bankObject.welcome();
    }

    public void welcome(){

        Scanner userEntry = new Scanner(System.in);
        System.out.println("Welcome to the Fortune Bank dear customer!");
        System.out.println("Enter the pin for your account: ");
        String enteredPin = userEntry.nextLine();

        if(enteredPin.equals(pin)){
            System.out.println("Thanks for entering the correct pin :)");
        }
        else{
            System.out.println("You're a thief, get lost!");
        }
    }

}
