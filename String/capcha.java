class Operation {
    public static void main(String[] args) {
        // String s = ganrateCapcha();
        // String s = "sohanmaali144@gmail.com";
        // String s = "62323898h2";
        // System.out.println(checkMobileNumber(s));
        String password = "2002";
        String conPass_1 = "20002";
        System.out.println(password.equals(conPass_1));

    }

    public static String ganrateCapcha() {
        String s = "";
        String charector = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        for (int i = 1; i <= 6; i++) {
            int x = (int) ((Math.random() * 62) + 1);
            s += charector.charAt(x);
        }
        return s;
    }

    public static boolean checkGmail(String gmail) {
        int i = 0;
        for (; i < gmail.length(); i++) {
            if (gmail.charAt(i) == '@' && gmail.charAt(i + 6) == '.') {
                return true;
            }
        }
        return false;
    }

    public static boolean checkMobileNumber(String mobileNumber) {
        if (mobileNumber.length() != 10) {
            return false;
        }
        for (int i = 0; i < mobileNumber.length(); i++) {
            try {
                int n = mobileNumber.charAt(i) - '0';
                // int a = n - '0';
                System.out.print(n);
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

}
