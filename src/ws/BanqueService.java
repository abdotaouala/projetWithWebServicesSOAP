package ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
@WebService(serviceName="BanqueWS")
public class BanqueService {
	@WebMethod(operationName="ConversionEuroToDh")
	public double conversion(@WebParam(name="montant") double mt){
		return mt*3;
	}
	@WebMethod
	public Compte getCompte(@WebParam(name="code") int code){
		return new Compte(code,Math.random()*9000);
	}
	@WebMethod
	public List<Compte> getComptes(){
		List<Compte> cpts=new ArrayList<Compte>();
		cpts.add(new Compte(1,454554));
		cpts.add(new Compte(2,4545));
		cpts.add(new Compte(3,4544));
		return cpts;
	}
}
