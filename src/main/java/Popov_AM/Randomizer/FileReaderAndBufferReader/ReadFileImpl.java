package Popov_AM.Randomizer.FileReaderAndBufferReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ReadFileImpl implements ReadFile{
    private final Scanner scanner;

    public ReadFileImpl(ScannerTake scannerTake) {
        scanner = scannerTake.getScanner();
    }

    @Override
    public FileReader returnFileForReading() throws IOException {
        FileReader fileReader = null;
        System.out.println("Введите путь к файлу students.txt");
        while (fileReader == null){
            try {
                fileReader = getFileReader(scanner);
            }
            catch (FileNotFoundException e){
                System.out.println("Введите путь к файлу students.txt");
            }
        }
        return fileReader;
    }
    static FileReader getFileReader(Scanner scanner) throws IOException {
        return new FileReader(scanner.nextLine() + "\\students.txt", StandardCharsets.UTF_8);
    }
}
