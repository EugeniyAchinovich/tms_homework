package lesson_18.practice.task_2;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Main {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            MyHandler handler = new MyHandler();
            saxParser.parse("src/main/resources/source_document.xml", handler);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
