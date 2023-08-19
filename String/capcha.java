public class capcha {
    public static void main(String[] args) {
        String s = ganrateCapcha();
        System.out.println(s);
    }

    public static String ganrateCapcha() {
        String s = "";
        String charector = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        for (int i = 1; i <= 6; i++) {
            int x = (int)((Math.random() * 62) + 1);
            s += charector.charAt(x);
        }
        return s;
    }
}
 