package nl.sjoelclub.competitie.score;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends CrudRepository<Score, Long> {

}
