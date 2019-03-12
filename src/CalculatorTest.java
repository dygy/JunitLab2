import org.junit.*;
import org.hamcrest.SelfDescribing;
import static org.junit.Assert.*;


public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }

    @Before
    public void initTest() {
        calculator = new Calculator();
    }

    @After
    public void afterTest() {
        calculator = null;
    }

    @Test
    public void testGetSmallSum() throws Exception {
        assertEquals(0.00000017,0.00000002, calculator.getSum(0.0000001,0.00000007));
    }
    @Test
    public void testGetBigSum() throws Exception {
        assertEquals(101000000000000.00000017, calculator.getSum(100000000000000.0000001,1000000000000.00000007));
    }
    @Test
    public void testGetMultiple() throws Exception {
        assertEquals(0, calculator.getMultiple(100,0));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        calculator.getDivide(15,0);
    }
    @Test
    public void testGetNegFact() throws Exception {
        assertEquals(-6, calculator.factorial(-3));
    }
    @Test
    public void testGetBigFact() throws Exception {
        assertEquals(510909+""+4217170+""+9440000, calculator.factorial(21));
    }
    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }

    @Test(timeout = 500)
    public void timeStampTest() {
        while (true);
    }
}