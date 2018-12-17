package nl.sjoelclub.competitie.klasse;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlasseRepository extends CrudRepository<Klasse, Long> {

}
