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
    public int factorial(int x)
    {
        int result = 1;
        for (int i = 1; i <=x; i ++){
            result = result*i;
        }
        return result;
    }
}
