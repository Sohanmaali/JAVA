class first {
    public static void main(String[] args) {
        String s1 = "aabbccddd";
        String s2 = "";
        boolean flag;
        for (int i = 0; i < s1.length(); i++) {
            flag  = true;
            char ch = s1.charAt(i);
            for (int j = i+1; j < s1.length(); j++) {
                if (ch==s1.charAt(j)) {
                    flag= false;
                    break;
                }
            }
            if(flag)
                s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }
}