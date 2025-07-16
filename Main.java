import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your food choice:");
        System.out.println("1. Burger");
        System.out.println("2. Maggi");
        System.out.println("3. Pasta");
        System.out.println("4. Chowmein");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Burger.");
                break;
            case 2:
                System.out.println("You selected Maggi.");
                break;
            case 3:
                System.out.println("You selected Pasta.");
                break;
            case 4:
                System.out.println("You selected Chowmein.");
                break;
            default:
                System.out.println("Invalid choice. Please select from 1 to 4.");
        }

        sc.close();
    }
}
