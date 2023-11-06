import java.util.Base64.Encoder;

public class EncodePasswoed {
    public static void main(String[] args) {
        Encoder encoder = Base64.getEncoder();
        String pass = "sohan@2002";
        String enpass = encoder.encodeToString(pass.getBytes());

        System.out.println("Pass  =  " + enpass);

    }
}