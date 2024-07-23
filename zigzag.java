import java.util.Arrays;
import java.util.Scanner;

public class zigzag {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = s.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter the elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 1; i <= arr.length - 2; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        System.out.println("Zig-Zag array:");
        System.out.println(Arrays.toString(arr));

        
    }
}
