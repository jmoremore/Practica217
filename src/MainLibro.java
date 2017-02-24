import java.io.FileInputStream;
import java.util.HashMap;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class MainLibro {
	
	private static HashMap<String,Libro> mapaLibros;
	
	public static void main(String[] args) throws Throwable {
		
		XMLReader reader = XMLReaderFactory.createXMLReader();
		ParserLibroXML parserlibro = new ParserLibroXML();
		
		reader.setContentHandler(parserlibro);
		
		reader.parse(new InputSource(new FileInputStream("libros.xml")));
		
		mostrar();
	}
	
	public static void mostrar(){
		for (String nombre: mapaLibros.keySet())
		{
	    	String value = mapaLibros.get(nombre).toString();
	    	System.out.println(value);
		} 
	}

	public static int getNLibros(){
		int numeroTotalLibros = 0;
		for (String nombre: mapaLibros.keySet())
		{
			numeroTotalLibros++;
		} 
		return numeroTotalLibros;
	}
	
	public static void setMapaLibros(HashMap<String,Libro> mapaLibros2){
		mapaLibros = mapaLibros2;
	}
}