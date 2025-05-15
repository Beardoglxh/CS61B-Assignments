/** Class that prints the Collatz sequence starting from a given number.
 *  @author Bear
 */
public class Collatz {

    /**
     * Computes the next number in the Collatz sequence based on the input number.
     * <p>
     * Collatz sequence rules:
     * - If the input number is even: returns n / 2
     * - If the input number is odd: returns 3n + 1
     * - If the input number is 1: returns 4 (continues the sequence despite being the typical endpoint)
     *
     * @param n The current number in the Collatz sequence (must be a positive integer)
     * @return The next number in the Collatz sequence
     * @throws IllegalArgumentException If the input number is less than 1
     *
     * @example
     * <pre>
     * nextNumber(5) → 16
     * nextNumber(16) → 8
     * nextNumber(1) → 4
     * </pre>
     */
    public static int nextNumber(int n) {
        if (n  == 1) {
            return 1;
        } else if (n % 2 == 1) {
            return 3 * n + 1;
        } else {
            return n / 2;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

