import java.util.ArrayList;
import java.util.List;

public class StudentRepo {

    private List<Person> students;
    private int age;
    private static StudentRepo repo;

    private StudentRepo() {
        students = new ArrayList<>();
    }

    public static StudentRepo getInstance() {
        if (repo == null) {
            repo = new StudentRepo();
        }
        return repo;
    }

    public void incrementAge() {
        age++;
    }

    public int getAge() {
        return age;
    }
}
