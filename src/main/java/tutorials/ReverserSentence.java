package tutorials;

public class ReverserSentence {
    public static void reverseString(String str1){
        String s[] = str1.split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--) {
            ans += s[i] + " ";
        }
        System.out.println("Reversed String: " + ans.trim());
    }

    public static void main(String args[]) {
        String str1="you shall not pass";  // Pass the string to reverse
        System.out.println("Original String: " + str1.trim());
          reverseString(str1);

    }

}
