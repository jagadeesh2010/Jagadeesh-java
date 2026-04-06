package com.test;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Pat;
import jakarta.ws.rs.Produces;


public class HelloService {

	@Path("/hello")
	public class HelloService {

		@GET
		@Path("/text")
		@Produces(MediaType.TEXT_PLAIN)
		public String simpleHelloPlainTextResponse() {
			return "This Is Rest API Simple Plain Text Response";
		}

		@GET
		@Path("/{db}")
		@Produces(MediaType.TEXT_HTML)
		public String simpleHTMLResponse(@PathParam("db") String num) {
			return "<html><body><h2>:: Simple HTML Data Response :: " + num + "</h2></body></html>";
		}

}
