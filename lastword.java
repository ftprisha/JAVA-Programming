import java.util.Scanner;

class lastword {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = S.nextLine();
        
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        int lengthOfLastWord = s.length() - lastSpaceIndex - 1;
        
        System.out.println("The length of the last word is: " + lengthOfLastWord);
        
        
    }
}
