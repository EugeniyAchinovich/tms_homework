package lesson_18.practice.task_2;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

class MyHandler extends DefaultHandler {
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        System.out.println("Начальный элемент: " + qName);
        if (attributes.getLength() > 0) {
            System.out.println("Атрибуты:");

            for (int i = 0; i < attributes.getLength(); i++)
                System.out.println(attributes.getQName(i) + " : " + attributes.getValue(i));
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        String data = new String(ch, start, length).trim();

        if (!data.isEmpty())
            System.out.println("Данные: " + data);
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        System.out.println("Закрывающий элемент: " + qName);
    }
}