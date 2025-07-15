public class TypeCat {
    public static void main(String[] args) {

        int a = 100;
        double b = a;
        System.out.println("Widening: int to double: " + b);


        double x = 123.45;
        int y = (int) x;  // double to int (manual)
        System.out.println("Narrowing: double to int: " + y);


        char c = 'A';
        int cInt = c;  // char to int (ASCII value)
        System.out.println("char to int (ASCII): " + cInt);


        int d = 66;
        char dChar = (char) d; // int to char
        System.out.println("int to char: " + dChar);


        int largeNum = 130;
        byte smallNum = (byte) largeNum; // Overflow
        System.out.println("int to byte (with overflow): " + smallNum);
    }
}