package nl.sjoelclub.competitie.config;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import nl.sjoelclub.competitie.klasse.KlasseEndpoint;
import nl.sjoelclub.competitie.score.ScoreEndpoint;
import nl.sjoelclub.competitie.speler.SpelerEndpoint;
import nl.sjoelclub.competitie.user.UserEndpoint;


@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig(){
		register(SpelerEndpoint.class);
		register(KlasseEndpoint.class);
		register(ScoreEndpoint.class);
		register(UserEndpoint.class);
	}
}
