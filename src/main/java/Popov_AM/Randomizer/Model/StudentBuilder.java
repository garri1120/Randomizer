package Popov_AM.Randomizer.Model;

public interface StudentBuilder {
    StudentBuilder number(int number);
    StudentBuilder firstname(String  firstname);
    StudentBuilder lastname(String lastname);
    Student build();
}


