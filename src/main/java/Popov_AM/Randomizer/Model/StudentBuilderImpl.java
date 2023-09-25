package Popov_AM.Randomizer.Model;

public class StudentBuilderImpl implements StudentBuilder{
    private final Student student = new Student();
    @Override
    public StudentBuilder number(int number) {
        student.setNumber(number);
        return this;
    }

    @Override
    public StudentBuilder firstname(String firstname) {
        student.setFirstname(firstname);
        return this;
    }

    @Override
    public StudentBuilder lastname(String lastname) {
        student.setLastname(lastname);
        return this;
    }

    @Override
    public Student build() {
        return student;
    }
}
