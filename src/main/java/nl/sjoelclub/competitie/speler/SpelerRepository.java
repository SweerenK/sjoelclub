package nl.sjoelclub.competitie.speler;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpelerRepository extends CrudRepository<Speler, Long> {

	public Optional<Speler> findByName(String name);
}
