package nl.sjoelclub.competitie.persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.sjoelclub.competitie.domain.Speler;


@Service
@Transactional		//Mag operaties op de database doen.
public class SpelerService {
	@Autowired		//Verbinding tussen repository en service. Zorgt ervoor dat je een object van Repository tot beschikking hebt (eigenlijk interface)
	private SpelerRepository spelerRepository;

	
	public Speler save(Speler speler) {
		return spelerRepository.save(speler);
	}


	public Iterable<Speler> findAll() {					//Iterable is een verzameling op het hoogste niveau. Doorheenloopbaar.
		Iterable<Speler> result = spelerRepository.findAll();
		return result;
	}
	
	
}

