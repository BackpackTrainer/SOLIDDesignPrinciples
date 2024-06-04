package calculator;

import org.json.JSONObject;

public class JSONResultsPrinter {
    public void printResult(String operation, int a, int b, int result) {
        JSONObject json = new JSONObject();
        json.put("operation", operation);
        json.put("operand1", a);
        json.put("operand2", b);
        json.put("result", result);
        System.out.println(json.toString(4));
    }

    public void printResult(String operation, int a, int b, double result) {
        JSONObject json = new JSONObject();
        json.put("result", result);
        json.put("operation", operation);
        json.put("operand2", b);
        json.put("operand1", a);

        System.out.println(json.toString(4));
    }
}
