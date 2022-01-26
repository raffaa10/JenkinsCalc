import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JenkinsCalcTest {

    public JenkinsCalcTest(){};

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }


    /**
     * Test of addition method, of class CalculatriceJenkins.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        int a = 20;
        int b = 10;
        JenkinsCalc instance = new JenkinsCalc();
        int expResult = 30;
        int result = instance.addition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sustraction method, of class CalculatriceJenkins.
     */
    @Test
    public void testSustraction() {
        System.out.println("sustraction");
        int a = 40;
        int b = 30;
        JenkinsCalc instance = new JenkinsCalc();
        int expResult = 10;
        int result = instance.sustraction(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplication method, of class CalculatriceJenkins.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        int a = 5;
        int b = 4;
        JenkinsCalc instance = new JenkinsCalc();
        int expResult = 20;
        int result = instance.multiplication(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class CalculatriceJenkins.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int a = 8;
        int b = 2;
        JenkinsCalc instance = new JenkinsCalc();
        int expResult = 4;
        int result = instance.division(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
