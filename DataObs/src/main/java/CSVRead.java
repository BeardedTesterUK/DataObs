import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CSVRead {

    private static List<String[]> content;
    private static String[] blah;
    private static String[] dataConverted;
    private static List<String[]> updatedContent;

    public static void main(String[] args) throws IOException {
        List<String[]> whatevre = runProgram();
    }

    public static List<String[]> runProgram() throws IOException {
            int i;
            int j;
            content = ReadingData.readData();
            updatedContent = new ArrayList<>();
            //outer loop;
            for(i=0; i< content.size();i++){
                blah = content.get(i); // Contains  surname, first, job, phone, other
                //Create new Array
                dataConverted = new String[blah.length];
                //Inner Loop
                for(j=0; j< blah.length; j++){
                    String ha = blah[j]; // Contains surname
                    String ta = ConvertingData.generateRandomString(ha); //Contains New Random Data
                    // ta added to new Array
                    dataConverted[j] = dataConverted[j] = ta;
                } //End Inner Loop
                updatedContent.add(dataConverted);
            }
            return updatedContent;
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
