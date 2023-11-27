public class TextChecker {
    public static void main(String[] args) {

        showTextInfo("Oko");

    }

    public static boolean isTextBlank(String text) {
        if (text.isBlank()) {
            return true;
        }
        return false;
    }
    public static void isTextPalindrome(String text){
        if (!(text.isBlank())) {
            String reverse = "";
            int length = text.length();
            for (int i = length - 1; i >= 0; i--)
                reverse = reverse + text.charAt(i);
            if (text.equalsIgnoreCase(reverse))
                System.out.println(text + " is a palindrome");
            else {
                System.out.println(text + " is not a palindrome");
            }
        }
    }
    public static void howLongIsText(String text){
        if (!(text.isBlank())){
            System.out.println("Length of text is: " + text.length());
        }

    }
    public static void showTextInfo (String text){
        isTextBlank(text);
        isTextPalindrome(text);
        howLongIsText(text);
    }
}
