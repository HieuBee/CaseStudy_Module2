package read_file_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static final String FILE_PATH = "C:\\Users\\Admin\\CaseStudy_Module2\\IOText\\src\\read_file_csv\\database.csv";

    public static List<Country> readFileCSV() {
        List<Country> countryList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String temp[];
            Country country;

            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String nameShort = temp[1];
                String nameFull = temp[2];

                country = new Country(id, nameShort, nameFull);
                countryList.add(country);
            }

            bufferedReader.close();
        }catch (Exception e) {
            System.out.println("a");
        }
        return countryList;
    }

    public static void main(String[] args) {
        readFileCSV();
    }
}
