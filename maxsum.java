public class maxsum {
    public static void main(String[] args) {
        int[] arr = {2, 3, -1, 2, -4, 5, 1};
        int maxsum = arr[0];
        int currentsum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentsum = Math.max(arr[i], currentsum + arr[i]);
            maxsum = Math.max(maxsum, currentsum);
        }

        System.out.println("Largest Sum Contiguous Subarray: " + maxsum);
    }
}