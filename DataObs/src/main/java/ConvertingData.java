import java.util.Random;
import java.util.Scanner;

public class ConvertingData {


        public static void main(String[] args) {
            String asciiUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String asciiLowerCase = asciiUpperCase.toLowerCase();
            String digits = "1234567890";
            String asciiChars = asciiUpperCase + asciiLowerCase + digits;

            //String randomString = generateRandomString("Ro!BeR@t45!£^%&", asciiUpperCase, asciiLowerCase, digits);

            //System.out.println(String.format("The random string is %s", randomString));
        }

        static String generateRandomString(String original) {
            String asciiUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String asciiLowerCase = asciiUpperCase.toLowerCase();
            String digits = "1234567890";
            StringBuilder sb = new StringBuilder();
            int i = 0;
            Random rand = new Random();
            while (i < original.length()) {
                char x = original.charAt(i);
                if (Character.isUpperCase(x)) {
                    sb.append(asciiUpperCase.charAt(rand.nextInt(asciiUpperCase.length())));
                } else if(Character.isLowerCase(x)){
                    sb.append(asciiLowerCase.charAt(rand.nextInt(asciiLowerCase.length())));
                }else if(Character.isDigit(x)){
                    sb.append(digits.charAt(rand.nextInt(digits.length())));
                }else {
                    sb.append(x);
                }
                i++;
            }
                return sb.toString();
        }
}
