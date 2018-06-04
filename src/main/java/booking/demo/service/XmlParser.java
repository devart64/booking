package booking.demo.service;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.NodeIterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XmlParser {

    public static void ReadXml() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder loader = factory.newDocumentBuilder();
            Document document = loader.parse("books.xml");
            DocumentTraversal traversal = (DocumentTraversal) document;

            NodeIterator iterator = traversal.createNodeIterator(document.getDocumentElement(), NodeFilter.SHOW_ELEMENT, null, true);
            for (Node node = iterator.nextNode(); node != null; node = iterator.nextNode())
            {
                Thread.sleep(10);
                if (node.getNodeName().contentEquals("Title")) {

                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
