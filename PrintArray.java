public class PrintArray {
    public static void main(String[] args){
    int[]  arr={1,2,3,4,5};
    arr[1] = 6; // for updating the index at any point 
    for(int num:arr) {
        System.out.println(num);
    }
    }
}