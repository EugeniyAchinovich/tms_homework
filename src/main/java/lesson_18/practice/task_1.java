package lesson_18.practice;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

public class task_1 {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse("src/main/resources/source_document.xml");
        document.getDocumentElement().normalize();

        Element rootElement = document.getDocumentElement();
        NodeList childNodes = rootElement.getChildNodes();

        for (int i = 0; i < childNodes.getLength(); i++) {
            Node childNode = childNodes.item(i);

            if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) childNode;
                String elementName = element.getNodeName();
                String elementValue = element.getTextContent();

                System.out.println("Element Name: " + elementName);
                System.out.println("Element Value: " + elementValue);
            }
        }
    }
}
