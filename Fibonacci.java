import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
  public static void main(String[] args) {
    // memoize
    Map<Integer, BigInteger> values = new HashMap<>();

    System.out.println(fibonacci(100, values));
  }

  public static BigInteger fibonacci(Integer n, Map<Integer, BigInteger> values) {
    if (values.containsKey(n)) {
      return values.get(n);

    } else if (n == 0) {
      return BigInteger.ZERO;

    } else if (n == 1) {
      return BigInteger.ONE;

    } else {
      BigInteger fib = fibonacci(n - 1, values).add(fibonacci(n - 2, values));
      values.put(n, fib);
      return fib;
    }
  }
}