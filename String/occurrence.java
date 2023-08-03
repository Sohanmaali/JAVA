class Occurrence {
    public static void main(String[] args) {
        String s1 = "aabbccddd";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int count = 1;
            for (int j = i + 1; j < s1.length(); j++) {
                if (ch == s1.charAt(j)) {
                    count++;
                }
            }
            boolean flag = false;
            for (int k = i - 1; k >= 0; k--) {
                if (ch == s1.charAt(k)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(ch + "- " + count + " time");
            }
        }
    }
}
