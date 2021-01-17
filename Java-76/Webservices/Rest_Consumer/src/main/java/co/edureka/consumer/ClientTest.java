package co.edureka.consumer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ClientTest {

	public static void main(String[] args) {
		String baseURL = "http://localhost:65535/REST";
		
		// 1. Create on empty Client object
	    Client client = ClientBuilder.newClient();	
	    
	    // 2. add url to Client, get WebTarget
	    WebTarget webTarget = client.target(baseURL);
	 
	    // 3. make request call to a resource
	    Invocation.Builder invocationBuilder =  webTarget.path("/rest/edureka").request(MediaType.TEXT_HTML);
	    Response response = invocationBuilder.get();	
	    
	    // 4. read entity from response object
	    String resp = response.readEntity(String.class);
	 		
	    // 5. print response
	    System.out.println(resp);
	 		
	    // 6. print extra details
	    System.out.println(response.getStatus());
	    System.out.println(response.getStatusInfo());
	    
	    System.out.println("---------------------------------");
	    
	    String str = webTarget.path("rest").path("edureka/nri").request().accept(MediaType.TEXT_HTML).get(String.class);
	    System.out.println(str);
	}
}
