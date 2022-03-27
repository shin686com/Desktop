import java.util.Scanner;
import java.util.HashSet;

public class Test09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            h.add(input.nextInt() % 42);
        }

        input.close();
        System.out.print(h.size());
    }
}
