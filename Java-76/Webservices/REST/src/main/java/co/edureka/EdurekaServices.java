package co.edureka;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/edureka")
public class EdurekaServices {
 @GET
 @Produces("text/html")
 public String localService() {
	 String responseMsg = "<h2>Welcome to Customer Service India</h2>";
	 return responseMsg;
 }
 
 @GET
 @Produces("text/html")
 @Path("/nri")
 public String internationalService() {
	 String responseMsg = "<h2>Welcome to International Customer Service</h2>";
	 return responseMsg;
 }
/*
 @GET
 @Path("{name}/{cname}")
 @Produces("text/html")
 public String findCourseDetailsByCourseName(@PathParam("name") String name, @PathParam("cname") String cname) {
	 //logic to get course details
	 return "<h2>Hello, "+name+ "!, Please check your mail to get the course details of Course = "+cname;
 }
*/
 
 @GET
 @Path("{name}/{course}")
 @Produces("text/html")
 public String enquiry(@PathParam("name") String name, @PathParam("course") String course) {
  return "<h2>Customer Name - " + name + "<br>Course Name - " + course + "</h2>";		
 }
 
}
