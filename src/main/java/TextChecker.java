public class TextChecker {
    public static void main(String[] args) {
        getTextInfo("oko");
        getTextInfo("koko");
    }

    public static void getTextInfo(String text){
        if (text.isBlank()){
            System.out.println("There is no text!");
        }

        String reverse = "";
        int length = text.length();
        if (!(text.isBlank())){
            for (int i = length -1; i >= 0; i--)
                reverse = reverse + text.charAt(i);
            if(text.equals(reverse))
                System.out.println(text + " is a palindrome");
            else {
                System.out.println(text + " is not a palindrome");
            }

            System.out.println("Text length is " + text.length() + " characters \n");
        }
    }
}
