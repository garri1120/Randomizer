package Popov_AM.Randomizer.Randomizer;

import Popov_AM.Randomizer.FileReaderAndBufferReader.BufferRead;
import Popov_AM.Randomizer.FileReaderAndBufferReader.ScannerTake;
import Popov_AM.Randomizer.Model.Student;
import java.io.IOException;
import java.util.*;


public class RandomizerServiceImpl implements RandomizerService{
   private final Map<Integer,Student> students;
   private final Scanner scanner;

    public RandomizerServiceImpl(BufferRead bufferRead, ScannerTake scannerTake) throws IOException {
        students = bufferRead.DisplayAListOfStudents();
        scanner = scannerTake.getScanner();
    }

    @Override
    public Map<Integer,Student> deleteStudentsWhoAreNotAtTheLecture() {
        System.out.println("Введите номер студента который отсутствует на лекции.");
        System.out.println("Для завершения ввода введите слово STOP");
        String stop = "STOP";
        String enteredNumber;
        int deleteStudent;
        while (scanner.hasNextLine()) {
            enteredNumber = scanner.nextLine();
            if (enteredNumber.equals(stop)) {
                break;
            }
            try {
                deleteStudent = Integer.parseInt(enteredNumber);
                students.remove(deleteStudent);

            } catch (NumberFormatException s) {
                System.out.println("Вы ввели не число");
            }
        }
        System.out.println("------------------------------------------------------------");
        return students;
    }

    @Override
    public void GettingACoupleOfStudents() {
      List<Student> studentList = new ArrayList<>(deleteStudentsWhoAreNotAtTheLecture().values());
      Collections.shuffle(studentList);
      int sizeList = studentList.size();
      int  start = 0;

      while (start<sizeList-1){
          System.out.println("Перестрелка между студентами: " + studentList.get(start).getLastname() + " " + studentList.get(start).getFirstname() +
                  " и " + studentList.get(start+1).getLastname() + " " + studentList.get(start+1).getFirstname());

                   start = start+2;
            }
            if(sizeList % 2 != 0) {
                System.out.println("------------------------------------------------------------");
                System.out.println("Студенту нет пары так как нечетное число студентов.");
                Random random = new Random();
                System.out.println("Перестрелка между студентами: " + studentList.get(sizeList-1).getLastname() + " " + studentList.get(sizeList-1).getFirstname() +
                        " и " + studentList.get(random.nextInt(0,sizeList-1)).getLastname() + " " + studentList.get(random.nextInt(0,sizeList-1)).getFirstname());
            }
            scanner.close();
      }

}
