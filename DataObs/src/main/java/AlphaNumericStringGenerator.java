import java.nio.charset.Charset;
import java.util.Random;

public class AlphaNumericStringGenerator {
    static String getRandomString(int i) {

        byte[] bytearray;
        String myString;
        StringBuffer theBuffer;

        bytearray = new byte[256];
        new Random().nextBytes(bytearray);

        myString = new String(bytearray, Charset.forName("UTF-8"));

        // Create the StringBuffer
        theBuffer = new StringBuffer();

        for (int m = 0; m < myString.length(); m++) {

            char n = myString.charAt(m);

            if (((n >= 'A' && n <= 'Z')
                    || (n >= '0' && n <= '9'))
                    && (i > 0)) {

                theBuffer.append(n);
                i--;
            }
        }

        // resulting string
        return theBuffer.toString();
    }
}
