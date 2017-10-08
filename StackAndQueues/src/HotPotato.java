import java.text.CollationElementIterator;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split("\\s+");
        int n = scanner.nextInt();
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, children);

        while(queue.size()>1){
            for (int i =1; i<n; i++) {
                String firstChild = queue.poll();
                queue.offer(firstChild);
            }
            System.out.println(("Removed "+ queue.poll()));
            }
            System.out.println("Last is " + queue.poll());
        }

    }

