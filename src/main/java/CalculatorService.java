public class CalculatorService {

    public long factorial(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= number;
        }
        return result;
    }
}
