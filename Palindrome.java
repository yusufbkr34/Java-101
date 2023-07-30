import java.util.Scanner ;
public class Palindrome {
    public static boolean isPalindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) { 
            reverse += (word.charAt(i)); 
                                       
        }
        if (word.equals(reverse)) {
            System.out.println("The input is palindrome");
            return true;
        }
        else {
            System.out.println("The input is not palindrome");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String word = input.nextLine();
        System.out.println(isPalindrome(word));
    }
}