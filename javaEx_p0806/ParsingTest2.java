package p0806;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParsingTest2 {

	public static void main(String[] args) {
		try {
			new ParsingTest2().start();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	private void start() throws Exception{
		URL url = new URL("http://apis.data.go.kr/B551182/pharmacyInfoService/getParmacyBasisList?pageNo=1&numOfRows=100&ServiceKey=0uFBsPAvdo7B7DD9qw9EpS%2FX14TMRt5nMctpFu4ZIRYa17dJqDzwmIAa52l0xK49yfnOsVpmKsYDmTUctmT0Sw%3D%3D");
		URLConnection connection = url.openConnection();
		
		Document doc = parseXML(connection.getInputStream());
		NodeList descNodes = doc.getElementsByTagName("item");
		
		for(int i=0; i<descNodes.getLength(); i++) {
			for (Node node = descNodes.item(i).getFirstChild(); node!=null; node=node.getNextSibling()) {
				
				if(node.getNodeName().equals("postNo")) {
					System.out.println("우편번호 : "+node.getTextContent());		
				}else if(node.getNodeName().equals("sgguCdNm")) {
					System.out.println("시도명 : "+node.getTextContent());
				}else if(node.getNodeName().equals("yadmNm")) {
					System.out.println("약국명 : "+node.getTextContent());
				}
				
			}
		}
	}
	private Document parseXML(InputStream stream) throws Exception {
		
		DocumentBuilderFactory objDocumentBuilderFactory = null;
		DocumentBuilder objDocumentBuilder = null;
		Document doc = null;
		try {
			objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
			objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();
			doc = objDocumentBuilder.parse(stream);
		}catch(Exception ex) {
			throw ex;
		}
		return doc;
	}
}
