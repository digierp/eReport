package com.digierp.it.ereport.base.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.digierp.it.ereport.base.entity.Demo;


@Path("/demo")
@Produces({"application/json"})
public interface IDemoService {

	
	@POST
	@Path("/add")
	public void createDemo(Demo demo);
	
	@PUT
	@Path("/update")
	public void updateDemo(Demo demo);
	
	
	@DELETE
	@Path("/del/{id}")
	public void deleteDemo(@PathParam("id")Integer id);
	
	
	@GET
	@Path("/find/{id}")
	public Demo findDemo(@PathParam("id")Integer id);
	
	@GET
	@Path("/find/list")
	public List<Demo> findDemos();
	
	
	
}
