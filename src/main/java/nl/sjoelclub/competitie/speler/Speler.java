package nl.sjoelclub.competitie.speler;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import nl.sjoelclub.competitie.klasse.Klasse;
import nl.sjoelclub.competitie.score.Score;

@Entity
public class Speler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	//@ManyToMany(fetch = FetchType.EAGER)
	//private List<Score> scores = new ArrayList<Score>();
	
	//@ManyToOne
	//private Klasse klasse;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public List<Score> getScores() {
		return scores;
	}
	public void setScores(List<Score> scores) {
		this.scores = scores;
	}
	public Klasse getKlasse() {
		return klasse;
	}
	public void setKlasse(Klasse klasse) {
		this.klasse = klasse;
	}*/
	
}
