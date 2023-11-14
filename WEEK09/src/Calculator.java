import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstInput = sc.nextInt();

        System.out.println("Enter the second number: ");
        double secondInput = sc.nextInt();

        System.out.println("Press 1 for (+) \n 2 for (-) \n 3 for (*) \n 4 for (Division)");
        int enteredOption = sc.nextInt();

        switch(enteredOption){
            case 1:
                System.out.println("The addition is: " + (firstInput + secondInput));
                break;
            case 2:
                System.out.println("The subtraction is: " + (firstInput - secondInput));
                break;
            case 3:
                System.out.println("The multiplication is: " + (firstInput * secondInput));
                break;
            case 4:
                System.out.println("The division is: " + (firstInput/secondInput));
                break;
        }
    }
}
