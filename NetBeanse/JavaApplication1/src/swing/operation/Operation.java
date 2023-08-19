package swing.operation;

/**
 *
 * @author Sohan_Maali
 */
public class Operation {

    public static String ganrateCapcha() {
        String s = "";
        String charector = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        for (int i = 1; i <= 6; i++) {
            int x = (int) ((Math.random() * 62) + 1);
            s += charector.charAt(x);
        }
        return s;
    }

}
