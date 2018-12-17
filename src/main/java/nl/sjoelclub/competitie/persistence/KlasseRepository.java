package nl.sjoelclub.competitie.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nl.sjoelclub.competitie.domain.Klasse;

@Repository
public interface KlasseRepository extends CrudRepository<Klasse, Long> {

}
