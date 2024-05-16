package csvReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class csvReaderFile {

    public static void main(String[] args) {
        String csvFile = "path/to/csv/file.csv";
        String line = "";
        String cvsSplitBy = ",";
        List<Map<String, String>> dataList = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String[] headers = br.readLine().split(cvsSplitBy);
            while ((line = br.readLine()) != null) {
                String[] values = line.split(cvsSplitBy);
                Map<String, String> dataMap = new HashMap<>();
                for (int i = 0; i < headers.length; i++) {
                    dataMap.put(headers[i], values[i]);
                }
                dataList.add(dataMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Do something with the list of maps, for example:
        for (Map<String, String> data : dataList) {
            System.out.println(data.get("id") + ", " + data.get("name") + ", " + data.get("age"));
        }
    }
}






