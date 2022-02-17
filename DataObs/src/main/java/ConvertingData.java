import java.time.LocalDate;
import java.util.Random;

public class ConvertingData {

    private static String asciiUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String digits = "1234567890";
    private static Random rand = new Random();
    private static String asciiLowerCase = asciiUpperCase.toLowerCase();
    private static String asciiChars = asciiUpperCase + asciiLowerCase + digits;

//        public static void main(String[] args) {
//            //String asciiUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//            //String asciiLowerCase = asciiUpperCase.toLowerCase();
//            //String digits = "1234567890";
//            //String asciiChars = asciiUpperCase + asciiLowerCase + digits;
//        }

        static String convertStringData(String original) {
            //String asciiUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            //String asciiLowerCase = asciiUpperCase.toLowerCase();
            //String digits = "1234567890";
            StringBuilder sb = new StringBuilder();
            int i = 0;
            //Random rand = new Random();
            while (i < original.length()) {
                char x = original.charAt(i);
                if(asciiChars.contains(Character.toString(x))){
                    if (Character.isUpperCase(x)) {
                        //sb.append(asciiUpperCase.charAt(rand.nextInt(asciiUpperCase.length())));
                        char y = changeUpperCase();
                        sb.append(y);
                    } else if(Character.isLowerCase(x)){
                        //sb.append(asciiLowerCase.charAt(rand.nextInt(asciiLowerCase.length())));
                        char y = changeLowerCase();
                        sb.append(y);
                    }else if(Character.isDigit(x)) {
                        //if(x == '0'){sb.append(x);
                        //}else{sb.append(digits.charAt(rand.nextInt(digits.length())));}
                        char y = changeDigits(x);
                        sb.append(y);
                    }
                }else {
                    sb.append(x);
                }
                i++;
            }
                return sb.toString();
        }

        public static char changeUpperCase(){
            return asciiUpperCase.charAt(rand.nextInt(asciiUpperCase.length()));
        }

        public static char changeLowerCase(){
            String asciiLowerCase = asciiUpperCase.toLowerCase();
            return asciiLowerCase.charAt(rand.nextInt(asciiLowerCase.length()));
        }

        public static char changeDigits(char x){
            if(x == '0'){
                return (x);
            }else {
                return digits.charAt(rand.nextInt(digits.length()));}
        }

        public static void convertDateData(){
            int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
            int maxDay = (int) LocalDate.of(2020, 1, 1).toEpochDay();
            long randomDay = minDay + rand.nextInt(maxDay - minDay);

            LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
            LocalDate today = LocalDate.now();
            System.out.println(randomBirthDate + " " + today);

        }

        public static LocalDate getPastDate(){
            int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
            int maxDay = (int) LocalDate.now().toEpochDay();
            long randomDay = minDay + rand.nextInt(maxDay - minDay);

            LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
            return randomBirthDate;
        }

        public static LocalDate getFutureDate(){
            int minDay = (int) LocalDate.now().toEpochDay();
            int maxDay = (int) LocalDate.of(2100, 1, 1).toEpochDay();
            long randomDay = minDay + rand.nextInt(maxDay - minDay);

            LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
            return randomBirthDate;
        }

        public static int convertNumericalData(int amount){ //Salary
            double difference = (amount * 0.1);
            int minAmount = (int) (amount - difference);
            int maxAmount = (int) (amount + difference);
            int range = maxAmount - minAmount;

            int randomNumber = minAmount + rand.nextInt(range);
            System.out.println("Amount: " + amount);
            System.out.println("Min: " + minAmount);
            System.out.println("Max " + maxAmount);
            System.out.println("Range: " + range);
            System.out.println("Random No: " + randomNumber);

            return randomNumber;
        }

        public static void convertIDData(){

        }
}
