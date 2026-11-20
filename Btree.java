
import java.util.*;

class BTree {
    ArrayList<Integer> keys = new ArrayList<>();

    void insert(int key) {
        long start = System.nanoTime();

        if (!keys.contains(key)) {
            keys.add(key);
            Collections.sort(keys);
            System.out.println("Inserted: " + key);
        } else {
            System.out.println("Duplicate key!");
        }

        long end = System.nanoTime();
        System.out.println("Time Complexity: O(n log n)");
        System.out.println("Space Complexity: O(n)");
        System.out.println("Time Consumed: " + (end-start) + " ns");
    }

    void delete(int key) {
        long start = System.nanoTime();

        if (keys.remove(Integer.valueOf(key)))
            System.out.println("Deleted: " + key);
        else
            System.out.println("Key not found!");

        long end = System.nanoTime();
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1) auxiliary");
        System.out.println("Time Consumed: " + (end-start) + " ns");
    }

    void display() {
        long start = System.nanoTime();

        System.out.println("B-Tree: " + keys);

        long end = System.nanoTime();
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1) auxiliary");
        System.out.println("Time Consumed: " + (end-start) + " ns");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BTree b = new BTree();

        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter key: ");
                    b.insert(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter key: ");
                    b.delete(sc.nextInt());
                    break;

                case 3:
                    b.display();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
