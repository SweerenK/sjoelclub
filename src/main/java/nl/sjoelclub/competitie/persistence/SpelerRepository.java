package nl.sjoelclub.competitie.persistence;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nl.sjoelclub.competitie.domain.Speler;

@Repository
public interface SpelerRepository extends CrudRepository<Speler, Long> {

	public Optional<Speler> findByName(String name);
}
