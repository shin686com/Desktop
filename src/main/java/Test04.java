import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N=1,K=1;
        for(int i=0; i<1; i++){
            N=input.nextInt();
            if(1>N||N>10){
                i--;
            }
        }
        for(int i=0; i<1; i++) {
            K = input.nextInt();
            if (1 > K || K > 100000000) {
                i--;
            }
        }
        int[] coin = new int[N];

        for(int i = 0; i < N; i++) {
            coin[i] = input.nextInt();
        }
        int cnt=0;
        for(int i=N-1; i>=0; i--)
        {
            if(coin[i]<=K){
                cnt+=(K/coin[i]);
                K=K%coin[i];
            }
        }
        System.out.println(cnt);

    }
}
