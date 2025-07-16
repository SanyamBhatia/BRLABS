import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        int largest = (a > b) ? a : b;
sc.close();
        System.out.println("The largest number is: " + largest);
    }
}




