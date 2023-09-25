package Popov_AM.Randomizer.FileReaderAndBufferReader;

import Popov_AM.Randomizer.Model.Student;
import Popov_AM.Randomizer.Model.StudentBuilderImpl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BufferReadImpl implements BufferRead {
     private final ReadFile readFile;
     private final Map<Integer,Student> students;

    public BufferReadImpl(ReadFile readFile) {
        this.readFile = readFile;
        students = new LinkedHashMap<>();
    }

    @Override
    public Map<Integer,Student> DisplayAListOfStudents() {
        try (FileReader fileReader = readFile.returnFileForReading(); BufferedReader br = new BufferedReader(fileReader)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] strings = line.split("\\s+");
                Student student = new StudentBuilderImpl()
                        .number(Integer.parseInt(strings[0]))
                        .firstname(strings[2])
                        .lastname(strings[1])
                        .build();
                students.put(student.getNumber(),student);
            }
            students.values().forEach(System.out::println);
            System.out.println("------------------------------------------------------------");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
}
