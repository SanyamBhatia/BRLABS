import java.util.Scanner;

public class IdCard {
//    public static void main(String[] args) {
//    System.out.println("Name : Sanyam Bhatia");
//    System.out.println("Roll No . 2210990795");
//    System.out.println("Branch : CSE");
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Your AGE : ");
        int age  = sc.nextInt();
        sc.nextLine(); // to consume the next line
        System.out.print("Enter Your Address : ");
        String Address = sc.nextLine();

        System.out.println("Your name is : " + name );
        System.out.println("Your age is : " + age );
        System.out.println("Your Address is : " + Address );
        sc.close();

    }
}
