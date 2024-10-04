public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String testStr = "madam";
        if (isPalindrome(testStr)) {
            System.out.println(testStr + " is a palindrome.");
        } else {
            System.out.println(testStr + " is not a palindrome.");
        }
    }
}
