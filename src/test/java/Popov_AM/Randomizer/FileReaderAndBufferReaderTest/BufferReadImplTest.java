package Popov_AM.Randomizer.FileReaderAndBufferReaderTest;

import Popov_AM.Randomizer.FileReaderAndBufferReader.BufferReadImpl;
import Popov_AM.Randomizer.Model.Student;
import Popov_AM.Randomizer.Model.StudentBuilderImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

public class BufferReadImplTest {
    BufferReadImpl bufferRead = Mockito.mock(BufferReadImpl.class);
    Map<Integer, Student> studentMap = new LinkedHashMap<>();
    Map<Integer, Student> returnedFromMethod = new LinkedHashMap<>();
    @BeforeEach
    void setUp(){
        studentMap.put(1,new StudentBuilderImpl().number(1).firstname("Bob").lastname("Ivanov").build());
        returnedFromMethod.put(1,new StudentBuilderImpl().number(1).firstname("Bob").lastname("Ivanov").build());
    }
    @Test
    void DisplayAListOfStudents(){
        when(bufferRead.DisplayAListOfStudents()).thenReturn(returnedFromMethod);
        Assertions.assertEquals(studentMap.keySet(), bufferRead.DisplayAListOfStudents().keySet());
        Assertions.assertEquals(studentMap.get(1), bufferRead.DisplayAListOfStudents().get(1));

    }
}
