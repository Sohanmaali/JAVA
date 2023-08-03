class Anagrams {
    public static void main(String[] args) {

        String s1 = "TRIANGLE";
        String s2 = "INTEGRAL";

        if (s1.length() != s2.length()) {
            System.out.println(" not Anagrame String");
            System.exit(0);
        }

        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                if (ch == s2.charAt(j)) {
                    count++;
                }
            }
        }
        if (count == s1.length()) {
            System.out.println("Anagrame String");
        } else {
            System.out.println(" not Anagrame String");
        }
    }
}