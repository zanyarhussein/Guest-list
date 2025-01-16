import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] guests = new String[10];

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("1- View the list");
            System.out.println("2- Add guest");
            System.out.println("3- Remove guest");
            System.out.println("4- Exit the program");
            System.out.print("Option: ");

            int opt = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character

            if (opt == 1) {
                for (int i = 0; i < guests.length; i++) {
                    System.out.println(guests[i]);
                }
            } else if (opt == 2) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Name: ");
                       guests[i] =  = sc.nextLine();
                        
                        break;
                    }
                }
            } else if (opt == 4) {
                System.out.println("Exiting.");
                break; // Break out of the do-while loop
            }

        } while (true);
    }
}
