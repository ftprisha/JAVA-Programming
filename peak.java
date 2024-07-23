import java.io.*;
import java.util.*;

class peak {
    public static void main(String[] args) {
        int n;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the size");
        n = S.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = S.nextInt();
        }
        int maxPeak = Integer.MIN_VALUE;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i - 1] < a[i] && a[i] > a[i + 1]) {
                maxPeak = Math.max(maxPeak, a[i]);
            }
        }
        if (maxPeak == Integer.MIN_VALUE) {
            System.out.println("No peak element found");
        } else {
            System.out.println("The maximum peak element is: " + maxPeak);
        }
    }
}