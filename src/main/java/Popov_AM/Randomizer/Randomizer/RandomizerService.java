package Popov_AM.Randomizer.Randomizer;

import Popov_AM.Randomizer.Model.Student;
import java.util.Map;

public interface RandomizerService {
    Map<Integer,Student> deleteStudentsWhoAreNotAtTheLecture();
    void GettingACoupleOfStudents();


}
