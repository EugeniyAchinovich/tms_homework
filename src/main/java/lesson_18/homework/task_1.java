package lesson_18.homework;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class task_1 {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("src/main/resources/source_document.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            doc.getDocumentElement().normalize();

            String firstName = doc.getElementsByTagName("firstName").item(0).getTextContent();
            String lastName = doc.getElementsByTagName("lastName").item(0).getTextContent();
            String title = doc.getElementsByTagName("title").item(0).getTextContent();

            String fileName = firstName + "_" + lastName + "_" + title + ".txt";

            // Файл создаётся в папке с этим проектом
            FileWriter writer = new FileWriter("src\\main\\java\\lesson_18\\homework\\" + fileName);
            NodeList lines = doc.getElementsByTagName("line");
            for (int i = 0; i < lines.getLength(); i++) {
                Node line = lines.item(i);
                writer.write(line.getTextContent() + "\n");
            }

            writer.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

