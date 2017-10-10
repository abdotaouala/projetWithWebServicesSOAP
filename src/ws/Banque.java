package ws;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class Banque {

	public static void main(String[] args) throws Exception {
		JAXBContext context=JAXBContext.newInstance(Compte.class);
		/*Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
		Compte cp=new Compte();
		cp.setCode(445);
		cp.setSolde(878787);
		marshaller.marshal(cp, new File("E://m2//youssfi//Support Web services//Video Jax WS//comptes.xml"));
	*/	
	   context.generateSchema(new SchemaOutputResolver() {
		
		@Override
		public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
			
				File f=new File("E://m2//youssfi//Support Web services//Video Jax WS//compte.xsd");
				StreamResult result=new StreamResult(f);
				result.setSystemId(f.getName());
				return result;
			
		}
	});
	}

}
