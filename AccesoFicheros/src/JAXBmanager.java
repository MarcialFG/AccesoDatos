import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBmanager {
	public static void marshal(Booklist bl) 
			throws JAXBException{
		marshal(bl,"ejemplo.xml");
	}
	public static void marshal(Booklist bl, String f) 
			throws JAXBException{
		marshal(bl,new File(f));
	}
	public static void marshal(Booklist bl,File f) 
			throws JAXBException{
		try(BufferedWriter writer = 
				new BufferedWriter(new FileWriter(f))){
			JAXBContext context = 
					JAXBContext.newInstance(Booklist.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
			m.marshal(bl, writer);
			//writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static Book unmarshal (File f) {
		return null;
	}
}
