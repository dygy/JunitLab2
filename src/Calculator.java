import java.math.BigInteger;

public class Calculator {

    public double getSum(double x, double y) {
        return x + y;
    }

    public int getDivide(int x, int y) {
        return x / y;
    }

    public int getMultiple(int x, int y) {
        return x * y;
    }
    public int factorial(int x) {
        int result = 1;
        if (x > 0) {

            for (int i = 1; i <= x; i++) {
                result = result * i;
            }
            return result;
        }
        else {
            x=x*-1;
            for (int i = 1; i <= x; i++) {
                result = result * i;
            }
            return result*-1;
        }
    }
    public static String bigFactorial(int x) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= x; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
        }
        return fact.toString();
    }

}
