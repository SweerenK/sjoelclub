package nl.sjoelclub.competitie.config;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import nl.sjoelclub.competitie.klasse.KlasseEndpoint;
import nl.sjoelclub.competitie.score.ScoreEndpoint;
import nl.sjoelclub.competitie.speler.SpelerEndpoint;


@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig(){
		register(SpelerEndpoint.class);
		register(KlasseEndpoint.class);
		register(ScoreEndpoint.class);
	}
}
