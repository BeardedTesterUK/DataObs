import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CreateFile {

    public static void createFile(List<String[]> data) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter("DataObs/output/test.csv"))){
            writer.writeAll(data);
        }
    }
}
