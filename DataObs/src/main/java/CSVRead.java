import java.io.*;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CSVRead {

    private static List<String[]> content;
    private static String[] blah;

    public static void main(String[] args) throws IOException {
        runProgram();
    }

    public static void runProgram() throws IOException {
        content = ReadingData.readData();
        for(int i=0; i< content.size();i++){
            blah = content.get(i);}
        String ha = blah[3];
        String ta = ConvertingData.generateRandomString(ha);
        System.out.println("New String is " + ta);
    }

    static void splitText(String str){
        String[] arr = str.split("");
        for(String character : arr)
            System.out.println(character.toUpperCase());
    }

        public static void scannerMethod() throws FileNotFoundException {
            Scanner scan = new Scanner(new File("C:\\Users\\robert.stockton\\Desktop/CSVfile.csv"));
            scan.useDelimiter(",");
            while (scan.hasNext()) {
                System.out.print(scan.next());
            }
            scan.close();
        }

        public static String[] splitFileMethod() throws IOException {
            String line;
            String splitBy = ",";

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\robert.stockton\\Desktop/CSVfile.csv"));
            String[] employee = new String[0];
            while ((line = br.readLine()) != null) {
                employee = line.split(splitBy);
                //System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] + "]");
            }
            return employee;
        }
    }
