import java.util.Scanner;

public class l_seq {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = S.nextInt();
        String b = Integer.toBinaryString(n);
        int c = 0, c1 = 0;
        
        for (int i = 0; i < b.length(); i++) {
            c1 = 0;
            for (int j = i; j < b.length(); j++) {
                if (b.charAt(j) == '0') {
                    c1++;
                    if (j + 1 < b.length() && b.charAt(j + 1) != '0') {
                        break;
                    }
                } else {
                    break;
                }
            }
            c = Math.max(c, c1);
        }
        
        System.out.println("Maximum consecutive zeros: " + c);
        S.close();
    }
}