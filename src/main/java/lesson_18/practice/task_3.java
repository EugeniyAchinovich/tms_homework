package lesson_18.practice;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;

public class task_3 {
    public static void main(String[] args) {
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("src/main/resources/source_document.xml"));

            while (reader.hasNext()) {
                int event = reader.next();

                switch (event) {
                    case XMLStreamConstants.START_ELEMENT -> {
                        System.out.println("Начальный элемент: " + reader.getName().toString());
                        int attributeCount = reader.getAttributeCount();
                        if (attributeCount > 0) {
                            System.out.println("Атрибуты:");
                            for (int i = 0; i < attributeCount; i++) {
                                System.out.println(reader.getAttributeName(i) + " : " + reader.getAttributeValue(i));
                            }
                        }
                    }
                    case XMLStreamConstants.CHARACTERS -> {
                        String data = reader.getText().trim();
                        if (!data.isEmpty()) {
                            System.out.println("Данные: " + data);
                        }
                    }
                    case XMLStreamConstants.END_ELEMENT ->
                            System.out.println("Закрывающий элемент: " + reader.getName().toString());
                }
            }

            reader.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

