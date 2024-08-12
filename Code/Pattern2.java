import java.util.Scanner;

public class Pattern2 {

    public static void main(String arg[]) {
        Scanner value = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = value.nextInt();
        System.out.println();
        System.out.println("###############################################");
        System.out.println();
        
        String num = "";
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 2 * n - i; j++) {
                if ((i < j)) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }

            num = num + i;

            for (int l = num.length() - 1; l >= 0; l--) {
                System.out.print(num.charAt(l));
            }

            System.out.println();
        }
    }

}
