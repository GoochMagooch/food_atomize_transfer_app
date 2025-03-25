import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Atomizer atomizer = new Atomizer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome To Our Food Atomizer and Transfer");

        while (true) {
            System.out.println();
            System.out.print("Enter your food: ");
            String input = scanner.nextLine();

            System.out.println();
            switch(input.toLowerCase()) {
            case "exit":
                System.out.println("Exiting program...");
                System.exit(0);
                break;
            case "help":
                System.out.println("An app that can atomize food down to it's molecular composition, convert that composition to transferrable data and send through telecommunication technology");
                break;
            default:
                atomizer.testFunction(input); 
            }
        }
    }
}