package dta.ihm;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import dta.RestServerInfoHelper;
import dta.Employe;

public class EmployeParId implements Action{

	public Integer getId() {
		return 2;
	}

	public String getMenu() {
		return "Rechercher un employé par ID";
	}

	public void execute() {
		
		Integer id = ScannerUtil.getInstance().askUserInt("saisir l'identifiant");
				
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target(new RestServerInfoHelper().getRestServerInfo().getBaseUrl());
		
		Invocation.Builder builder = target.path("bankonet-REST/api").path("employes").path(Integer.toString(id)).request();	
			
		System.out.println(builder.get(Employe.class));
	}

}
