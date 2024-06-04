package calculator;

import com.google.gson.JsonObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONResultsPrinter {

    public void printResult(String operation, int a, int b, double result) {
        JsonObject json = new JsonObject();
        json.addProperty("operand1", a);
        json.addProperty("operand2", b);
        json.addProperty("operation", operation);
        json.addProperty("result", result);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(json));
    }
}
