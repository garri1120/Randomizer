package Popov_AM.Randomizer.FileReaderAndBufferReader;

import java.util.Scanner;

public class ScannerTake {
    private final Scanner scanner;

    public ScannerTake() {
        scanner = new Scanner(System.in, "cp866");
    }

    public Scanner getScanner() {
        return scanner;
    }
}
