package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        Numeral num1 = new Numeral(1);
        Numeral num2 = new Numeral(2);
        Numeral num3 = new Numeral(3);
        Numeral num10 = new Numeral(10);
        Numeral num0 = new Numeral(0);

        Numeral result = new Numeral((10 * 10 - 1 + 2 * 3) *(10 * 10 - 1 + 2 * 3));
        System.out.println("expression: "+result.toString());

        System.out.println("addition "+addition.Addition(num0,num3).toString());
        System.out.println("subtraction "+subtraction.Subtraction(num3,num2).toString());
        System.out.println("multiplication "+multiplication.Multiplication(num0,num3).toString());
        System.out.println("division "+ division.Division(num2,num2).toString());
        System.out.println("---------------------");
        try {
            System.out.println(division.Division(num1, num0).toString());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }


    }
}
