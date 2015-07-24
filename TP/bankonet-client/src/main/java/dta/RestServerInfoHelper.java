package dta;

import java.util.ResourceBundle;

public class RestServerInfoHelper {
	
	public RestServerInfo getRestServerInfo(){
		
		ResourceBundle serverProps = ResourceBundle.getBundle("server");
		String protocol = serverProps.getString("protocol");
		String host = serverProps.getString("host");
		String port = serverProps.getString("port");
		
		RestServerInfo restserverinfo = new RestServerInfo();
		restserverinfo.setProtocol(protocol);
		restserverinfo.setHost(host);
		restserverinfo.setPort(port);
				
		return restserverinfo;
		
	}
}
