package nl.sjoelclub.competitie.persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.sjoelclub.competitie.domain.Klasse;


@Service
@Transactional		//Mag operaties op de database doen.
public class KlasseService {
	@Autowired		//Verbinding tussen repository en service. Zorgt ervoor dat je een object van Repository tot beschikking hebt (eigenlijk interface)
	private KlasseRepository klasseRepository;

	
	public Klasse save(Klasse klasse) {
		return klasseRepository.save(klasse);
	}


	public Iterable<Klasse> findAll() {					//Iterable is een verzameling op het hoogste niveau. Doorheenloopbaar.
		
		Iterable<Klasse> result = klasseRepository.findAll();
		return result;
	}
	
	
}

