
import coches.Autos;
import coches.Auto;
import coches.Transmision;
import java.io.*;
import java.util.ArrayList;
import javax.xml.bind.*;;

public class main {

	public static void main(String[] args) {
		
		try {
			
			// Leer xml
			JAXBContext conexto;
			conexto = JAXBContext.newInstance(Autos.class);
			Unmarshaller um = conexto.createUnmarshaller();
			Autos coche = (Autos) um.unmarshal (new File("src\\main\\resources\\Coches.xml"));
			coche.imprimirAutos();
			
			//Leer y escribir xml (En uno nuevo para mantener el base)
			
			Marshaller m = conexto.createMarshaller();
			Transmision transmision1 = new Transmision("manual", 20); 
			Auto auto1 = new Auto("003", "Mustang", "Nuevo_Modelo", 2024, "verde", "V10", "4.5", "650", transmision1);
			coche.añadirAutos(auto1);
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); //Para que escriba el documento indentado 
			m.marshal(coche, new File("src\\main\\resources\\Coches1.xml"));
			
			//Imprimir mediante xml
			m.marshal(coche, System.out);
			
			//Mostrar mediante el metodo de autos
			coche.imprimirAutos();
			
			//Buscar datos en el xml		
		} catch (JAXBException /*|IOException*/ e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}