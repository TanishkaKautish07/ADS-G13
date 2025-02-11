public class ReverseVowels {
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            if (!vowels.contains(chars[left] + "")) {
                left++;
            } else if (!vowels.contains(chars[right] + "")) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    // Main function
    public static void main(String[] args) {
        String s = "hello";
        System.out.println("Reversed vowels: " + reverseVowels(s));
    }

}
