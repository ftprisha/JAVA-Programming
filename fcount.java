import java.util.Scanner;
class fcount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    
        System.out.print("Enter a number: ");
        int number = s.nextInt();

        int c=0;

       
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                c++;
            }
        }

     
        System.out.println("The number of factors for " + number + " is: " + c);
    }
}
