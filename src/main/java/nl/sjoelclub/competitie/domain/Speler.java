package nl.sjoelclub.competitie.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Speler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String naam;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Score> scores = new ArrayList<Score>();
	
	@ManyToOne
	private Klasse klasse;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public List<Score> getScores() {
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
	}
	
}
