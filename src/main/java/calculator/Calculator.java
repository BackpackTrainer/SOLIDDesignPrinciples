//This class does too many things:
//        1.  It contains the main function
//        2.  It knows how to do the arithmatic operations
//        3.  It knows how to format in JSON for printing

//TODO:  Refactor this class into three classes, each conforming to the Single Responsibility Principle.

package calculator;

import org.json.JSONObject;

    public class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public double divide(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("Division by zero is not allowed.");
            }
            return (double) a / b;
        }
        public void printResult(String operation, int a, int b, double result) {
            JSONObject json = new JSONObject();
            json.put("result", result);
            json.put("operation", operation);
            json.put("operand2", b);
            json.put("operand1", a);


            System.out.println(json.toString(4));
        }
        public void printResult(String operation, int a, int b, int result) {
            JSONObject json = new JSONObject();

            json.put("operand1", a);
            json.put("operand2", b);
            json.put("operation", operation);
            json.put("result", result);
            System.out.println(json.toString(4));
        }


        public static void main(String[] args) {
            Calculator calculator = new Calculator();

            int a = 6;
            int b = 3;

            int sum = calculator.add(a, b);
            calculator.printResult("add", a, b, sum);

            int difference = calculator.subtract(a, b);
            calculator.printResult("subtract", a, b, difference);

            int product = calculator.multiply(a, b);
            calculator.printResult("multiply", a, b, product);

            double quotient = calculator.divide(a, b);
            calculator.printResult("divide", a, b, quotient);
        }
    }

