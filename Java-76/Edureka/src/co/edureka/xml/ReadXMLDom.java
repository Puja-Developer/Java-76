package co.edureka.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXMLDom {

	public static void main(String[] args) throws Exception {
		File xmlFile = new File("src/co/edureka/xml/staff.xml");
		if (xmlFile.exists()) {
			// create DOM Parser
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = factory.newDocumentBuilder();
			
			Document doc = parser.parse(xmlFile);
			Element rootElement = doc.getDocumentElement();
			System.out.println("Root Element = "+ rootElement.getNodeName());
			
			NodeList staffs = doc.getElementsByTagName("staff");
			System.out.println("No of Staffs = "+ staffs.getLength());
			System.out.println("-----------------------------------");
			
			for(int i=0;i<staffs.getLength();i++) {
				Node node = staffs.item(i);
				if(node.getNodeType() == Node.ELEMENT_NODE) {
					Element staff = (Element)node;
					
					System.out.println("First Name = "+ staff.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("Last Name = "+ staff.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Nick Name = "+ staff.getElementsByTagName("nickname").item(0).getTextContent());
					System.out.println("Salary = "+ staff.getElementsByTagName("salary").item(0).getTextContent());
				}
				System.out.println("-----------------------------------");
			}
		} else {
			System.out.println("XML file is not available!");
		}

	}
}
