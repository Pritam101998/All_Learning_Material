import java.util.*;

public class Pattern1 {
    public static void main(String arg[]) {
        Scanner value = new Scanner(System.in);
        System.out.println("Please enter a value : ");
        int n = value.nextInt();
        System.out.println();
        System.out.println("#############################################");
        System.out.println();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                int x = i - j;
                if (x % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
