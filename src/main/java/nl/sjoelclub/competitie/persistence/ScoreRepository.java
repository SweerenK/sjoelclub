package nl.sjoelclub.competitie.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nl.sjoelclub.competitie.domain.Score;

@Repository
public interface ScoreRepository extends CrudRepository<Score, Long> {

}
