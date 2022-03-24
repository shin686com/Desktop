import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A=input.nextInt();
        int B=input.nextInt();
        int C=input.nextInt();

        if (C <= B) {
            System.out.println("-1");
        }
        else {
            System.out.println((A/(C-B))+1);
        }
    }
}
