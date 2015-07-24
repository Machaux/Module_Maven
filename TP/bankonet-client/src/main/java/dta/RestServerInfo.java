package dta;


public class RestServerInfo {

	private String protocol;
	private String host;
	private String port;
	
	/**
	 * getters & setters
	*/
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	/**
	 * méthode qui permet à partir des champs de construire un URL de base
	 */
	public String getBaseUrl(){
		String url = ((protocol+"://").concat(host)+":").concat(port);
		
		return url; 
	}
}
