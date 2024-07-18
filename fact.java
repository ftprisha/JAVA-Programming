import java.util.Scanner;
 class fact {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = s.nextInt();
        int f = 1;
        int i = n;

        while (i > 0) {
            f *= i;
            i--;
        }

        System.out.println(n + " Factorial = " + f);
    }
}
