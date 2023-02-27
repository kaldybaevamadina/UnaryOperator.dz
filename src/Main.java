import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Double> sqrt = (Double x) -> Math.sqrt(x);
        System.out.println(sqrt.apply(4.0));
    }
}