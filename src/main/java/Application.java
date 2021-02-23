public class Application {
    public static void main(String[] args) {
        StudentRepo repo = StudentRepo.getInstance();
        repo.incrementAge();
        StudentRepo repo1 = StudentRepo.getInstance();
        repo1.incrementAge();

        System.out.println(repo1.getAge());
    }
}
