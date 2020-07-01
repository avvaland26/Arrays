public class ArraysSum {

    public static void main(String[] args) {
        int [] a = new int [] {10, 52,43, 64, 5};
       int sum = 0;

        for (int i=0; i<a.length; i++) {
            sum = sum + a[i];

        }
       System.out.println("Sum of all the elements of an array: " + sum);
    }
}




