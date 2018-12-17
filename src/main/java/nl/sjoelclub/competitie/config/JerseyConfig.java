package nl.sjoelclub.competitie.config;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import nl.sjoelclub.competitie.klasse.Klasse;
import nl.sjoelclub.competitie.score.Score;
import nl.sjoelclub.competitie.speler.Speler;


@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig(){
		register(Speler.class);
		register(Klasse.class);
		register(Score.class);
	}
}
