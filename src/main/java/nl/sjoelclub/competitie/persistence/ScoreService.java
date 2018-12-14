package nl.sjoelclub.competitie.persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.sjoelclub.competitie.domain.Score;


@Service
@Transactional		//Mag operaties op de database doen.
public class ScoreService {
	@Autowired		//Verbinding tussen repository en service. Zorgt ervoor dat je een object van ZiekenhuisRepository tot beschikking hebt (eigenlijk interface)
	private ScoreRepository winkelRepository;

	
	public Score save(Score score) {
		return winkelRepository.save(score);
	}


	public Iterable<Score> findAll() {					//Iterable is een verzameling op het hoogste niveau. Doorheenloopbaar.
		
		Iterable<Score> result = winkelRepository.findAll();
		return result;
	}
	
	
}

