/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sohan_Maali
 */
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Test {

    public static void main(String[] args) {
        Encoder encoder = Base64.getEncoder();
        String pass = "sohan@2002";
        String enpass = encoder.encodeToString(pass.getBytes());

        System.out.println("Pass  =  " + enpass);
        Decoder decoder = Base64.getDecoder();
        byte[] bytes = decoder.decode(enpass);
        System.out.println("agen = " + new String(bytes));
    }
}
