package labFiles;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.binary.Base64;

/**
 * A simple class that experiments with the Hex encoding
 * of the Apache Commons Codec library.
 *
 */
public class EncodingTest {
    public static void main(String[] args) throws DecoderException {
		String input = "Hello World";
		String input2 = "Hello Big World";
		
		System.out.println("\"Hello World\": " + Hex.encodeHexString(input.getBytes()));
        System.out.println("\"Hello Big World\": " + Hex.encodeHexString(input2.getBytes()) + "\n");
        
	   String hexString = "4d6f64756c652032";
	   byte[] bytes = hexString.getBytes();
	   String string = new String(bytes);
	   char[] chars = string.toCharArray();
	   byte[] decoded = Hex.decodeHex(chars);
	   String decodedstring = new String(decoded);
	   System.out.println(decodedstring + "\n");
	   
	   
	   String input3 = "Hello World";
	   System.out.println(Base64.encodeBase64String(input3.getBytes()));
	   
	   
	   String hexString2 = "0102030405060";
	   byte[] bytes3 = Base64.decodeBase64(hexString2.getBytes());
	   String stringetje = new String(bytes3);
	   System.out.println("\nLength of original 0102030405060: " + hexString2.length() + "\n" + stringetje + " Length of string: " + stringetje.length());
	  
	   String string64 = "U29mdHdhcmUgU3lzdGVtcw==";
	   byte[] bytes64 = string64.getBytes();
	   byte[] decoded64 = Base64.decodeBase64(bytes64);
	   String decodedstring64 = new String(decoded64);
	   System.out.println("\nEncoded: " + string64 + "\nDecoded: " + decodedstring64 + "\n");
		
	   for (int i = 0; i <= 10; i++) {
		   System.out.println("String: " + stringa(i) + " becomes: " + Base64.encodeBase64String(stringa(i).getBytes()));
	   }
	   
	           
    }
    
    public static String stringa(int a) {
    	StringBuilder result = new StringBuilder();
    	for (int i = 0; i <= a; i++) {
    		result.append("a");
    	}
    	return result.toString();
    }
}
