class Count_vowel_s {
    public static void main(String[] args) {
        String s1[] = { "ramu", "syamu", "aashi", "ankit", "anita" };
        int count=0;
        for (int i = 0; i < s1.length; i++) {

            String s2 = s1[i];
            
            if (s2.charAt(0)=='a'||s2.charAt(0)=='e'||s2.charAt(0)=='i'||s2.charAt(0)=='o'||s2.charAt(0)=='u'||s2.charAt(0)=='A'||s2.charAt(0)=='E'||s2.charAt(0)=='I'||s2.charAt(0)=='O'||s2.charAt(0)=='U') {
                count++;
            }
        }
        System.out.println("Total World start with vowel = "+count);
    }
}
