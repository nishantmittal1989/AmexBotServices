package com.amex.amexbot.webservices;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

@Path("/")
public class Service {

	private final static Logger logger = Logger.getLogger(Service.class);

	/**
	 * Home Page of the Web Services
	 */
	@GET
	@Path("/home")
	@Produces(MediaType.APPLICATION_JSON)
	public String home() {
		// First Web-Service to display the Welcome message
		// of the application.
		// TODO - Home

		System.out.println("WebService Working");
		logger.info("WebService Working");
		return " Welcome to AmexBot Chat Web services - Ver 1 ";
	}

	@POST
	@Path("/loginUser")
	@Consumes(MediaType.WILDCARD)
	@Produces(MediaType.APPLICATION_JSON)
	public String loginUser(String request) throws Exception {

		logger.info("Request:" + request);
		System.out.println("Request:" + request);

		return "{\"response\":\"Success\"}";

	}

}
