import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        int selection;

        System.out.println("Welcome! Choose one of the following options below :) ");
        System.out.println("[1] Style");
        System.out.println("[2] Colors");
        System.out.println("[3] Audios");
        System.out.println("[4] Transitions");
        System.out.println("[5] Person");
        System.out.println("[Exit] Exit The Program");

        selection = scan.nextInt();
        switch (selection) {
            case 1:
                System.out.println("You selected Style, This is what was selected for you!");
                break;
            case 2:
                System.out.println("You selected Colors, This is what was selected for you!");
                break;
            case 3:
                System.out.println("You selected Audios, This is what was selected for you!");
                break;
            case 4:
                System.out.println("You selected Transitions, This is what was selected for you!");
                break;
            case 5:
                System.out.println("You selected Person, This is what was selected for you!");
                break;
            case 6:
                System.out.println("You chose to exit the program");
                break;
            default:
                System.out.println("Invalid selection!");
                break;
        }
    }
}
