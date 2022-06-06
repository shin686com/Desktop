import java.util.Arrays;
import java.util.Scanner;

public class Test25 {
    private static int N;
    private static int[] nArr;
    private static int M;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        nArr = new int[N];
        for (int i = 0; i < N; i++) {
            nArr[i] = in.nextInt();
        }
        Arrays.sort(nArr);
        M = in.nextInt();
        for (int i = 0; i < M; i++) {
            int m = in.nextInt();
            int left = 0;
            int right = N - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                int n = nArr[mid];
                if (n == m) {
                    sb.append(1 + " ");
                    break;
                }
                if (n > m) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                if (left > right) {
                    sb.append(0 + " ");
                    break;
                }
            }
        }
        System.out.println(sb.toString());

    }

}