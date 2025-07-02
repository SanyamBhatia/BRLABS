import java.util.Scanner;

public class calculator2 {
    int x,y;
    public void calculator(int x,int y){
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x/y);
        System.out.println(x*y);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        calculator2 obj= new calculator2();
        obj.calculator(x,y);
    }
}