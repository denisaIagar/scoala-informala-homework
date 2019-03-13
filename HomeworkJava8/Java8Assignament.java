/**
 * in this application we have to use stream and lambda expression to read a csv file,
 * target a month in the file from user,
 * and write back another csv file with the name alphabetically for the matches which have the birthday on a month indicated
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Java8Assignament {
    String inputFile;
    String outputFile;
    int month;

    public Java8Assignament(String inputFile, String outputFile, int month) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.month = month;
    }

    public List<String> readFile() {
        this.inputFile = "HomeworkJava8\\InputText\\Namelist.csv";
        List<String> files = new ArrayList<>();
        try (Stream<String> person = Files.lines(Paths.get(inputFile))) {
            person.map(x -> x.split(","))
                    .filter(x -> LocalDate.parse(x[2]).getMonthValue() == this.month)
                    .forEach(x -> files.add(x[0] + x[1]));

        } catch (IOException e) {
            e.printStackTrace();
        }
        files.sort((x, y) -> x.compareTo(y));
        for (String x : files) {
            System.out.println(x);
        }
        return files;
    }


    public void writeFile() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.outputFile))) {
            for (String x : readFile()) {
                bufferedWriter.write(x.replace(" ", ","));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Check if the user write a month between 1-12 included;
     * @param month
     * @return
     */
    public static boolean checkMonth(int month){
        return ( month>= 1 && month <= 12);
    }
}





