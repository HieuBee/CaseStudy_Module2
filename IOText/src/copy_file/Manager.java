package copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    public static List<String> readAndWriteFile(String sourceFile, String targetFile){
        List<String> programList = new ArrayList<>();
        try {
            File sFile = new File(sourceFile);
            File tFile = new File(targetFile);

            if (!sFile.exists() || !tFile.exists()){
                throw new FileNotFoundException();
            }

            // File reader
            FileReader fileReader = new FileReader(sFile);
            BufferedReader fileBufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = fileBufferedReader.readLine()) != null){
//                String sourceText = line.substring(0);
                programList.add(line);
            }
            fileBufferedReader.close();

            // File write
            FileWriter fileWriter = new FileWriter(tFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Coppy: " + programList);
            bufferedWriter.close();
        } catch (Exception e){
            System.out.println("a");
        }
        return programList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input source file: ");
        String pathSource = sc.nextLine();
        System.out.println("Input target file: ");
        String pathTarget = sc.nextLine();

        readAndWriteFile(pathSource, pathTarget);
    }
}
