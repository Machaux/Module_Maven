package dta.ihm;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import dta.Employe;
import dta.RestServerInfoHelper;

public class ListerEmployer implements Action{

	public Client client=ClientBuilder.newClient();
	public WebTarget target = client.target("http://localhost:8085/bankonet-REST/api");
	
	public Integer getId() {
		return 1;
	}

	public String getMenu() {
		return "Lister les Employés";
	}

	public void execute() {
		System.out.println("liste des employés");
			
			WebTarget target = client.target(new RestServerInfoHelper().getRestServerInfo().getBaseUrl());
		
			Invocation.Builder builder = target.path("bankonet-REST/api/employes").request();
			
			List <Employe> employes = builder.get(new GenericType<List<Employe>>() {});
			
			for (Employe employe:employes)
			{
				System.out.println(employe.toString());
			}
			
			//CF Github de Johnatan 
	}

}
