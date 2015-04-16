import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Pruebas {

	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getEncoder();
		String normalString ="username:password";
		String encodedString = encoder.encodeToString(normalString.getBytes(StandardCharsets.UTF_8) );
		System.out.println(encodedString);
		/*Salida:
		 
		dXNlcm5hbWU6cGFzc3dvcmQ=*/
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] decodedByteArray = decoder.decode(encodedString);
		System.out.println(new String(decodedByteArray));
		/*Salida:
		username:password*/

	}
}
