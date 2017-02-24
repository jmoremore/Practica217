

import java.io.FileInputStream;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class InicioXML {
	
	public static void main(String[] args) throws Throwable {
		
		XMLReader reader = XMLReaderFactory.createXMLReader();
		ParserLibroXML parserlibro = new ParserLibroXML();
		
		reader.setContentHandler(parserlibro);
		
		reader.parse(new InputSource(new FileInputStream("libros.xml")));
		
	}
}