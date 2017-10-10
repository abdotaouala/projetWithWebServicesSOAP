package ws;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Banque2 {
	public static void main(String[] args) throws Exception {
		JAXBContext jc=JAXBContext.newInstance(Compte.class);
		Unmarshaller unmarshaller=jc.createUnmarshaller();
		Compte cp=(Compte) unmarshaller.unmarshal(new File("E://m2//youssfi//Support Web services//Video Jax WS//comptes.xml"));
		System.out.println(cp.getCode()+"-"+cp.getSolde());
		
	}
}
