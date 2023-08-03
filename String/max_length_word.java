public class max_length_word {

    public static void main(String[] args) {

        String s1 = "i am rakesh shrma frome india ";
        String[] words = s1.split(" ");

        String length = words[0];

        for (String word : words) {
            if (word.length() > length.length()) {
                length = word;
            }
        }
        System.out.println("Max length of word = "+length);
    }
}
