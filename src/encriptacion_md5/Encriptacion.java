package encriptacion_md5;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Vitaminac
 * @version 1.0
 * @since 26/12/2021
 */
public class Encriptacion {

    public String encriptar(String pass) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] pass_byte = messageDigest.digest(pass.getBytes("UTF-8"));
            BigInteger bigInteger = new BigInteger(1, pass_byte);
            String pass_encriptada = bigInteger.toString(16);

            while (pass_encriptada.length() < 32) {
                pass_encriptada = "0" + pass_encriptada;
            }
            
            return pass_encriptada;
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            System.out.println(e);
            return null;
        }
    }

}
