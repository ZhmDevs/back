package com.myapp.fr.esef.facade;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class TestFacade {

	@GET
	public String get() {
		return "test";
	}

}
