package nl.sjoelclub.competitie.speler;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Path("speler")
@Component
public class SpelerEndpoint {

	@Autowired
	private SpelerService spelerService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listSpelers(){
		Iterable <Speler> spelers = spelerService.findAll();
		return Response.ok(spelers).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response postSpeler(Speler speler){
		Speler result = spelerService.save(speler);
		return Response.accepted(result).build();	
	}
	

}