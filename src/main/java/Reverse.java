public class Reverse {

    public static String reverse(String word) {

        word = word.trim();
        String reverseWords = new StringBuffer(word).reverse().toString();
        String[] split = reverseWords.split(" ");
        String result = "";

        for (int i = split.length - 1; i >= 0; i--) {

            if (i == 0) {
                result += split[i];
            } else {
                result += (split[i] + " ");
            }
        }

        return result;
    }
}
