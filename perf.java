class perf {
    public static void main(String[] args) {
        for (int number = 1000; number <= 9999; number++) {
            int sum = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) {
                System.out.println(number + " is a perfect number.");
            }
        }
    }
}
