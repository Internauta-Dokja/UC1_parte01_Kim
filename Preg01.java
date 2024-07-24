public class Preg01 {
    public static void main(String[] args) {
        int A = 8;
        int B = 9;

        // Swapping values using a temporary variable
        int temp = A;
        A = B;
        B = temp;

        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}
