package Popov_AM.Randomizer;

import Popov_AM.Randomizer.FileReaderAndBufferReader.*;
import Popov_AM.Randomizer.Randomizer.RandomizerServiceImpl;
import java.io.IOException;

public class RandomizerApplication {
	public static void main(String[] args) throws IOException {
		ScannerTake scannerTake = new ScannerTake();
		ReadFile readFile = new ReadFileImpl(scannerTake);
		BufferRead bufferRead = new BufferReadImpl(readFile);
		RandomizerServiceImpl randomizerService = new RandomizerServiceImpl(bufferRead,scannerTake);
		randomizerService.GettingACoupleOfStudents();
	}

}
