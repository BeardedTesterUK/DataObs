import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVRead {

    private static List<String[]> originalData;
    private static String[] dataLine;
    private static String[] convertedDataArray;
    private static List<String[]> updatedContent;

    public static void main(String[] args) throws IOException {
        originalData = getOriginalData();
        List<String[]> authorisedData = cycleAndConvertData(originalData);
        CreateFile.createFile(authorisedData);
    }

    public static List<String[]> getOriginalData() throws IOException {
            return originalData = ReadingData.readData();
        }

    public static List<String[]> cycleAndConvertData(List<String[]> originalData) {
        updatedContent = new ArrayList<>();
            //outer loop;
            for(int i = 0; i< originalData.size(); i++){//Set i to Ignore headings
                dataLine = originalData.get(i); // Contains  surname, first, job, phone, other
                //Create new Array
                convertedDataArray = new String[dataLine.length];
                //Inner Loop
                for(int j = 0; j< dataLine.length; j++){
                    String dataFieldContents = dataLine[j]; // Contains surname
                    String convertedData = ConvertingData.generateRandomString(dataFieldContents); //Contains New Random Data
                    // convertedData added to new Array
                    convertedDataArray[j] = convertedDataArray[j] = convertedData;
                } //End Inner Loop
                updatedContent.add(convertedDataArray);
            }
        return updatedContent;
    }
}