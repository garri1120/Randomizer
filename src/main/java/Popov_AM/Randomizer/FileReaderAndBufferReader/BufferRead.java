package Popov_AM.Randomizer.FileReaderAndBufferReader;

import Popov_AM.Randomizer.Model.Student;

import java.io.IOException;
import java.util.Map;

public interface BufferRead {
    Map<Integer,Student> DisplayAListOfStudents() throws IOException;
}
