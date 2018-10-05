package week3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Week3Test {
    public Week3Test() {

    }

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax1() {
        Week3 max1 = new Week3();
        int a = 1;
        int b = 2;
        int x = 2;
        int y = max1.max(a, b);
        assertEquals(x, y);
    }

    @Test
    public void testMax2() {
        Week3 max2 = new Week3();
        int a = 5;
        int b = 3;
        int x = 5;
        int y = max2.max(a, b);
        assertEquals(x, y);
    }

    @Test
    public void testMax3() {
        Week3 max3 = new Week3();
        int a = -10;
        int b = 5;
        int x = 5;
        int y = max3.max(a, b);
        assertEquals(x, y);
    }

    @Test
    public void testMax4() {
        Week3 max4 = new Week3();
        int a = -2;
        int b = 6;
        int x = 6;
        int y = max4.max(a, b);
        assertEquals(x, y);
    }

    @Test
    public void testMax5() {
        Week3 max5 = new Week3();
        int a = 15;
        int b = 1;
        int x = 15;
        int y = max5.max(a, b);
        assertEquals(x, y);

    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMin1() {
        Week3 min1 = new Week3();
        int [] a = {0};
        int x = 0;
        int y = min1.minOfArray(a);
        assertEquals(x, y);
    }

    @Test
    public void testMin2() {
        Week3 min2 = new Week3();
        int [] a = {2, 3, -5};
        int x = -5;
        int y = min2.minOfArray(a);
        assertEquals(x, y);
    }

    @Test
    public void testMin3() {
        Week3 min3 = new Week3();
        int [] a = {2, 8, 1, -3};
        int x = -3;
        int y = min3.minOfArray(a);
        assertEquals(x, y);
    }

    @Test
    public void testMin4() {
        Week3 min4 = new Week3();
        int [] a = {0, 2, -3, 5};
        int x = -3;
        int y = min4.minOfArray(a);
        assertEquals(x, y);
    }

    @Test
    public void testMin5() {
        Week3 min5 = new Week3();
        int [] a = {0, 1, 2, 3, 4};
        int x = 0;
        int y = min5.minOfArray(a);
        assertEquals(x, y);
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testBMI1() {
        Week3 bmi1 = new Week3();
        double kg = 46.5;
        double m = 1.59;
        String x = "Thieu can";
        String y = bmi1.calculateBMI(kg, m);
        assertEquals(x, y);
    }

    @Test
    public void testBMI2() {
        Week3 bmi2= new Week3();
        double kg = 22;
        double m = 1.2;
        String x = "Thieu can";
        String y = bmi2.calculateBMI(kg, m);
        assertEquals(x, y);
    }

    @Test
    public void testBMI3() {
        Week3 bmi3= new Week3();
        double kg = 66;
        double m = 1.79;
        String x = "Binh thuong";
        String y = bmi3.calculateBMI(kg, m);
        assertEquals(x, y);
    }

    @Test
    public void testBMI4() {
        Week3 bmi4= new Week3();
        double kg = 51;
        double m = 1.58;
        String x = "Binh thuong";
        String y = bmi4.calculateBMI(kg, m);
        assertEquals(x, y);
    }

    @Test
    public void testBMI5() {
        Week3 bmi5= new Week3();
        double kg = 80;
        double m = 1.75;
        String x = "Beo phi";
        String y = bmi5.calculateBMI(kg, m);
        assertEquals(x, y);
    }
}
