package nl.sjoelclub.competitie.config;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import nl.sjoelclub.competitie.domain.Klasse;
import nl.sjoelclub.competitie.domain.Score;
import nl.sjoelclub.competitie.domain.Speler;


@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig(){
		register(Speler.class);
		register(Klasse.class);
		register(Score.class);
	}
}
