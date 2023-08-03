class check_digit {
    public static void main(String[] args) {
        String s1 = "563356565666";
        boolean flag= false;
        for (int i = 0; i < s1.length(); i++) {
            flag= false;
            if ((int)s1.charAt(i) < 48 || (int)s1.charAt(i) > 57) {
                flag = true;
                break;
           }
        }
        if (flag) {
            System.out.println(" String Not contains only digits");
        }
        else
        {
            System.out.println(" String contains only digits");
        }
    }
}
