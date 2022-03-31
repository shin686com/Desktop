import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int cnt = 1;
        int range = 2;

        if (N == 1) {
            System.out.println(1);
        } else {
            while (range <= N) {
                range = range + (6 * cnt);
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
