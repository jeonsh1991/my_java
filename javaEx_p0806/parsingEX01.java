package p0806;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class parsingEX01 {

	public static void main(String[] args) {
		try {
			new parsingEX01().start();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void start() throws Exception{
		URL url = new URL("http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.xml?key=430156241533f1d058c603178cc3ca0e&targetDt=20180805");
		URLConnection connection = url.openConnection();
		
		Document doc = parseXML(connection.getInputStream());
		NodeList descNodes = doc.getElementsByTagName("dailyBoxOffice");
		
		for(int i=0; i<descNodes.getLength(); i++) {
			for (Node node = descNodes.item(i).getFirstChild(); node!=null; node=node.getNextSibling()) {
				if(node.getNodeName().equals("movieNm")) {
					System.out.println(node.getTextContent());		
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
