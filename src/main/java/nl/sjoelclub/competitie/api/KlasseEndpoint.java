package nl.sjoelclub.competitie.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import nl.sjoelclub.competitie.domain.Klasse;
import nl.sjoelclub.competitie.persistence.KlasseService;

@Path("klasse")
@Component
public class KlasseEndpoint {

	@Autowired
	private KlasseService klasseService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listGroep(){
		Iterable <Klasse> klasses = klasseService.findAll();
		return Response.ok(klasses).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response postKlasse(Klasse klasse){
		Klasse result = klasseService.save(klasse);
		return Response.accepted(result.getId()).build();	
	}
	

}