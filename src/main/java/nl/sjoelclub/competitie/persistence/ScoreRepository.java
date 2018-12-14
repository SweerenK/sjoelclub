package nl.sjoelclub.competitie.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.sjoelclub.competitie.domain.Score;

@Component
public interface ScoreRepository extends CrudRepository<Score, Long> {

}
