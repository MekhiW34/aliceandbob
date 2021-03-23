package homework;


import java.util.Scanner;

public class BobAndAlice {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Hey, whats you're name?");
        String name = userInput.nextLine();

        while (name != ("Alice") || name != ("Bob")) {
            System.out.println("Try again :( ");
            name = userInput.nextLine();


            if (name.equals("bob") || (name.equals("alice"))) {
                System.out.println("Welcome " + name + "!!");
                System.out.println("What is your phone number?");
                String number = userInput.nextLine();
                while (number.length() != 10) {
                    System.out.println("A real number please!");
                    number = userInput.nextLine();
                }
                if (number.length() == 10)
                    System.out.println("Thank you!");

            }
        }
    }
}