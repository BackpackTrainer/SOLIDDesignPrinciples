package fileHandler;

import java.io.BufferedReader;
import java.io.IOException;


import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.util.Iterator;

public class FileHandlerApp {

    private String filename;

    public FileHandlerApp(String filename) {
        this.filename = filename;
    }


    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/main/resources/sample.txt");
            FileWriter fileWriter = new FileWriter("src/main/resources/sample.txt");
            ContentFormatter contFormatter = new ContentFormatter();


            String content = fileReader.readFile();

            String jsonContent = "{\"name\": \"John\", \"age\": 30}";
            String xmlContent = contFormatter.jsonToXml(jsonContent);

            fileWriter.writeFile(xmlContent);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
