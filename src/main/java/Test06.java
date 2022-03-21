import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N=0;
        for(int i=0; i<1;i++)
        {
            N=input.nextInt();
            if(N<0||N>99)
            {
                i--;
            }
        }
        int tmp=N;
        int cnt=0;
        while(true)
        {
            N=((N%10)*10) + (((N/10)+(N%10))%10);
            cnt++;

            if(tmp ==N)
            {
                break;
            }
        }
        System.out.println(cnt);
    }
}
