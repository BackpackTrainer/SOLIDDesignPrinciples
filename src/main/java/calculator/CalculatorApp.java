package calculator;

public class CalculatorApp {
    public static void main(String[] args) {
        RefactoredCalculator calculator = new RefactoredCalculator();
        JSONResultsPrinter printer = new JSONResultsPrinter();

        int a = 5;
        int b = 3;

        int sum = calculator.add(a, b);
        printer.printResult("add", a, b, sum);

        int difference = calculator.subtract(a, b);
        printer.printResult("subtract", a, b, difference);

        int product = calculator.multiply(a, b);
        printer.printResult("multiply", a, b, product);

        double quotient = calculator.divide(a, b);
        printer.printResult("divide", a, b, quotient);
    }
}
