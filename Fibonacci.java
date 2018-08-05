import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

  // memoize
  private static Map<Integer, BigInteger> values = new HashMap<>();

  public static void main(String[] args) {
    for (int i = 0; i < 50; i++) {
      System.out.println(fibonacci(i));
    }
  }

  public static BigInteger fibonacci(Integer n) {
    if (values.containsKey(n)) return values.get(n);
    else if (n == 0) return BigInteger.ZERO;
    else if (n == 1) return BigInteger.ONE;
    else {
      BigInteger fib = fibonacci(n - 1).add(fibonacci(n - 2));
      values.put(n, fib);
      return fib;
    }
  }
}