import java.util.Scanner;

public class Pattern {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please provied a number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = n-1; k>0; k--) {
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}