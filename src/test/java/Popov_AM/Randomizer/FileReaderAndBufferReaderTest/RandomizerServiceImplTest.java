package Popov_AM.Randomizer.FileReaderAndBufferReaderTest;

import Popov_AM.Randomizer.Model.Student;
import Popov_AM.Randomizer.Model.StudentBuilderImpl;
import Popov_AM.Randomizer.Randomizer.RandomizerServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

public class RandomizerServiceImplTest {
    RandomizerServiceImpl randomizerService = Mockito.mock(RandomizerServiceImpl.class);
    Map<Integer, Student> studentMap = new LinkedHashMap<>();
    Map<Integer, Student> returnedFromMethod = new LinkedHashMap<>();
    @BeforeEach
    void setUp(){
        studentMap.put(1,new StudentBuilderImpl().number(1).firstname("Bob").lastname("Ivnov").build());
        returnedFromMethod.put(1,new StudentBuilderImpl().number(1).firstname("Bob").lastname("Ivnov").build());
    }
    @Test
    void DisplayAListOfStudents(){
        when(randomizerService.deleteStudentsWhoAreNotAtTheLecture()).thenReturn(returnedFromMethod);
        Assertions.assertEquals(studentMap.keySet(), randomizerService.deleteStudentsWhoAreNotAtTheLecture().keySet());
        Assertions.assertEquals(studentMap.get(1), randomizerService.deleteStudentsWhoAreNotAtTheLecture().get(1));

    }
}
