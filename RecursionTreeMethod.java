
import java.util.Scanner;

public class RecursionTreeMethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (power of 2): ");
        int n = sc.nextInt();

        System.out.print("Enter T(1): ");
        int base = sc.nextInt();

        if (n < 1 || (n & (n - 1)) != 0 || base < 0) {
            System.out.println("Enter a positive power of 2 and non-negative base value.");
            sc.close();
            return;
        }

        long startTime = System.nanoTime();

        int levels = 0;
        int temp = n;

        while (temp > 1) {
            temp /= 2;
            levels++;
        }

        long total = 0;
        int currentN = 1;

        System.out.println("\nRecursion Tree Analysis:");

        for (int i = 0; i < levels; i++) {

            long work = n;

            System.out.println("Level " + i +
                    ": " + currentN +
                    " subproblems, Work = " + work);

            total += work;
            currentN *= 2;
        }

        long leafWork = (long) n * base;
        total += leafWork;

        System.out.println("Leaf Level Work = " + leafWork);
        System.out.println("Total Work = " + total);

        System.out.println("Time Complexity = O(n log n)");
        System.out.println("Space Complexity = O(1) auxiliary");

        long endTime = System.nanoTime();

        System.out.println("Execution Time = " +
                (endTime - startTime) + " nanoseconds");

        sc.close();
    }
}
